package hrs.StubAndDriver.DAO.RoomDAO.AvailableRoomDAO;

import java.text.SimpleDateFormat;
import java.util.Date;

import hrs.common.DAO.HotelDAO.AvailableRoomDAO;
import hrs.common.util.type.RoomType;

public class AvailableRoomDAOStub implements AvailableRoomDAO{
	private SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");   
	
	@Override
	public int findAvailableRoom(int hotelID, RoomType type, Date date) {
		return 1;
	}
	
}
