package hrs.StubAndDriver.DAO.RoomDAO.AvailableRoomDAO;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.HotelDAO.AvailableRoomDAO;
import hrs.common.util.type.RoomType;

public class AvailableRoomDAODriver {
	private AvailableRoomDAO dao;
	private Date date;
	@Before
	public void launch(){
		dao = new AvailableRoomDAOStub();
		Calendar c = new GregorianCalendar();
		c.set(2016, 10, 13, 0, 0, 0);
		date = c.getTime();
	}
	@Test
	public void testHasAvailableRoom(){
		assertEquals(dao.findAvailableRoom(0, RoomType.Double, date),0);
	}
	
}
