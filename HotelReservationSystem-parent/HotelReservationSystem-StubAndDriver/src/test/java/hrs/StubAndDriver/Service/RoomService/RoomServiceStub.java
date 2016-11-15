package hrs.StubAndDriver.Service.RoomService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.RoomDAO.RoomDAOStub;
import hrs.common.POJO.RoomPO;
import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;
import hrs.server.Service.Interface.RoomService.RoomService;

public class RoomServiceStub implements RoomService {
	private RoomDAO dao;
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	public RoomServiceStub() {
		dao = new RoomDAOStub();
	}

	@Override
	public ResultMessage update(RoomVO roomvo) {
		RoomPO po = new RoomPO();
		BeanUtils.copyProperties(roomvo, po);
		return dao.update(po);
	}

	@Override
	public ResultMessage add(RoomVO roomvo) {
		RoomPO po = new RoomPO();
		BeanUtils.copyProperties(roomvo, po);
		return dao.add(po);
	}

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

	@Override
	public List<RoomVO> findAvailableByHotelID(int hotelID, Date begin, Date end) {
		List<RoomPO> pos = dao.findByHotelID(hotelID);
		if (pos == null) {
			return null;
		}
		List<RoomVO> vos = new ArrayList<>();
		RoomVO vo = null;
		for (RoomPO po : pos) {
			vo = new RoomVO();
			BeanUtils.copyProperties(po, vo);
			vo.availableRoomNum = findAvailableRoomNum(hotelID, po.getType(), begin, end);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public List<RoomVO> findByHotelID(int hotelID) {
		List<RoomPO> pos = dao.findByHotelID(hotelID);
		List<RoomVO> vos = new ArrayList<>();
		RoomVO vo = null;
		for(RoomPO po:pos){
			vo = new RoomVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public int findAvailableRoomNum(int hotelID, RoomType type, Date begin, Date end) {
		int minRoomNum = Integer.MAX_VALUE, roomNum = 0;
		try {
			begin = formatter.parse(formatter.format(begin));
			end = formatter.parse(formatter.format(end));
			while (!begin.equals(end)) {
				roomNum = dao.findAvailableRoom(hotelID, type, begin);
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

	@Override
	public RoomVO findByHotelAndType(int hotelID, RoomType type) {
		List<RoomVO> list= findByHotelID(hotelID);
		for(RoomVO vo:list){
			if(vo.type == type){
				return vo;
			}
		}
		return null;
	}
}
