package hrs.StubAndDriver.Service.RoomService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.RoomDAO.RoomDAOStub;
import hrs.StubAndDriver.Service.RoomService.AvailableRoomService.AvailableRoomServiceStub;
import hrs.client.Service.RoomService.AvailableRoomService;
import hrs.client.Service.RoomService.RoomService;
import hrs.client.VO.RoomVO;
import hrs.common.DAO.RoomDAO;
import hrs.common.PO.RoomPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public class RoomServiceStub implements RoomService {
	private RoomDAO dao;
	private AvailableRoomService availRoomService;
	
	public RoomServiceStub() {
		dao = new RoomDAOStub();
		availRoomService = new AvailableRoomServiceStub();
	}
	
	@Override
	public RoomVO findByHotelAndType(int hotelID, RoomType type) {
		RoomPO po =  dao.findByHotelAndType(hotelID, type);
		if(po == null){
			return null;
		}
		RoomVO vo = new RoomVO();
		BeanUtils.copyProperties(po,vo);
		return vo;
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
		RoomType [] types = RoomType.values();
		for(int i = 0; i != types.length;i++){
			list.add(types[i]);
		}
		List<RoomPO> pos = dao.findByHotelID(hotelID);
		for(RoomPO po:pos){
			list.remove(po.getType());
		}
		return list;
	}

	@Override
	public List<RoomVO> findAvailableByHotelID(int hotelID, Date begin, Date end) {
		List<RoomPO> pos = dao.findByHotelID(hotelID);
		if(pos == null){
			return null;
		}
		List<RoomVO> vos = new ArrayList<>();
		RoomVO vo = null;
		for(RoomPO po:pos){
			vo = new RoomVO();
			BeanUtils.copyProperties(po, vo);
			vo.availRoomNum = availRoomService.findAvailableRoomNum(hotelID, po.getType(), begin, end);
			vos.add(vo);
		}
		return vos;
	}

	
}
