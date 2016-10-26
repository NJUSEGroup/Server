package hrs.server.Service.Impl.RoomService;

import java.util.Date;
import java.util.List;

import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;
import hrs.server.Service.Interface.RoomService.RoomService;

public class RoomServiceImpl implements RoomService{
	private RoomDAO dao;
	

	@Override
	public List<RoomVO> findAvailableByHotelID(int hotelID, Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(RoomVO roomvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(RoomVO roomvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomType> findNotAddedRoomType(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findAvailableRoomNum(int hotelID, RoomType type, Date begin, Date end) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RoomVO> findByHotelID(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

}
