package hrs.server.Service.Impl.RoomService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.RoomService.AvailableRoomNotFoundException;
import hrs.common.Exception.RoomService.RoomNotFoundException;
import hrs.common.POJO.RoomPO;
import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;
import hrs.server.Service.Interface.RoomService.RoomService;
import hrs.server.util.DateFormatter;
@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomDAO dao;
	
	/**
	 * 查找当前酒店的各个房间类型，以及每种房间的可用数量
	 */
	@Transactional
	@Override
	public List<RoomVO> findAvailableByHotelID(int hotelID, Date begin, Date end) {
		List<RoomPO> pos = dao.findByHotelID(hotelID);
		if (pos.size() == 0) {
			throw new AvailableRoomNotFoundException();
		}
		List<RoomVO> vos = new ArrayList<>();
		RoomVO vo = null;
		for (RoomPO po : pos) {
			vo = new RoomVO(po);
			vo.availableRoomNum = findAvailableRoomNum(hotelID, po.getType(), begin, end);
			vos.add(vo);
		}
		return vos;
	}

	@Transactional
	@Override
	public ResultMessage update(RoomVO roomvo) {
		return dao.update(new RoomPO(roomvo));
	}

	@Transactional
	@Override
	public ResultMessage add(RoomVO roomvo) {
		return dao.add(new RoomPO(roomvo));
	}

	@Transactional
	@Override
	public List<RoomType> findNotAddedRoomType(int hotelID) {
		List<RoomType> list = new ArrayList<>();
		RoomType[] types = RoomType.values();
		for (int i = 0; i != types.length; i++) {
			list.add(types[i]);
		}
		List<RoomPO> pos = dao.findByHotelID(hotelID);
		for (RoomPO po : pos) {
			list.remove(po.getType());
		}
		return list;
	}
	
	/**
	 * 找到在begin和end时间段中该类型该酒店的可用房间的最小数量
	 * @param hotelID
	 * @param type
	 * @param begin
	 * @param end
	 * @return
	 */
	@Transactional
	@Override
	public int findAvailableRoomNum(int hotelID, RoomType type, Date begin, Date end) {
		int minRoomNum = Integer.MAX_VALUE, roomNum = 0;
		try {
			begin = DateFormatter.parse(DateFormatter.format(begin),false);
			end = DateFormatter.parse(DateFormatter.format(end),false);
			while (!begin.equals(end)) {
				roomNum = dao.findAvailableRoom(hotelID, type, begin);
				System.out.println(roomNum);
				if (roomNum == 0) {
					return 0;
				}
				if (roomNum < minRoomNum) {
					minRoomNum = roomNum;
				}
				begin = incOneDay(begin);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return minRoomNum;
	}
	
	private Date incOneDay(Date date) {
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		c.add(Calendar.DATE, 1);
		return c.getTime();
	}
	
	@Transactional
	@Override
	public List<RoomVO> findByHotelID(int hotelID) {
		List<RoomPO> pos = dao.findByHotelID(hotelID);
		if(pos.size() == 0){
			throw new RoomNotFoundException();
		}
		List<RoomVO> vos = new ArrayList<>();
		RoomVO vo = null;
		for(RoomPO po:pos){
			vo = new RoomVO(po);
			vos.add(vo);
		}
		return vos;
	}
	
	@Override
	public RoomVO findByHotelAndType(int hotelID, RoomType type) {
		RoomPO po = dao.findByHotelAndType(hotelID, type);
		if(po == null){
			throw new RoomNotFoundException();
		}else{
			return new RoomVO(po);
		}
	}
	
}
