package hrs.StubAndDriver.Service.RoomService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.RoomDAO.RoomDAOStub;
import hrs.client.Service.RoomService;
import hrs.client.VO.RoomVO;
import hrs.common.DAO.RoomDAO;
import hrs.common.PO.RoomPO;
import hrs.common.PO.UserPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public class RoomServiceStub implements RoomService {
	private RoomDAO roomDao;
	
	public RoomServiceStub() {
		roomDao = new RoomDAOStub();
	}
	
	@Override
	public RoomVO findByHotelAndType(int hotelID, RoomType type) {
		RoomPO po =  roomDao.findByHotelAndType(hotelID, type);
		RoomVO vo = new RoomVO();
		BeanUtils.copyProperties(po,vo);
		return vo;
	}

	@Override
	public List<RoomVO> findByHotelID(int hotelID) {
		List<RoomVO> l = new ArrayList<>();
		l.add(new RoomVO(1, RoomType.Single, 0, 0));
		return l;
	}

	@Override
	public ResultMessage update(RoomVO roomvo) {
		RoomPO po = new RoomPO();
		BeanUtils.copyProperties(roomvo, po);
		return roomDao.update(po);
	}

	@Override
	public ResultMessage add(RoomVO roomvo) {
		RoomPO po = new RoomPO();
		BeanUtils.copyProperties(roomvo, po);
		return roomDao.add(po);
	}

}
