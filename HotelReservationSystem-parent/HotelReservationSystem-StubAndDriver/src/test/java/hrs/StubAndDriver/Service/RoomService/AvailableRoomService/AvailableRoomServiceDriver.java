package hrs.StubAndDriver.Service.RoomService.AvailableRoomService;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.RoomService.AvailableRoomService;
import hrs.common.util.type.RoomType;

public class AvailableRoomServiceDriver {
	private AvailableRoomService service;
	private Date begin;
	private Date end;
	@Before
	public void launch(){
		service = new AvailableRoomServiceStub();
		Calendar c = new GregorianCalendar();
		c.set(2016, 10, 13, 0, 0, 0);
		begin = c.getTime();
		c.set(2016, 10,15,0,0,0);
		end = c.getTime();
	}
	
	@Test
	public void testHasAvailableRoom(){
		assertEquals(1,service.findAvailableRoomNum(0, RoomType.Double, begin, end));
	}
	
}
