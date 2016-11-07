package hrs.server.Service.Impl.RoomService;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;
import hrs.server.Service.Interface.RoomService.RoomService;

public class RoomServiceImpl implements RoomService {
	private RoomDAO dao;

	@Transactional
	@Override
	public List<RoomVO> findAvailableByHotelID(int hotelID, Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage update(RoomVO roomvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage add(RoomVO roomvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<RoomType> findNotAddedRoomType(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public int findAvailableRoomNum(int hotelID, RoomType type, Date begin, Date end) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional
	@Override
	public List<RoomVO> findByHotelID(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDao(RoomDAO dao) {
		this.dao = dao;
	}

	@Override
	public RoomVO findByHotelAndType(int hotelID, RoomType type) {
		// TODO Auto-generated method stub
		return null;
	}
}
