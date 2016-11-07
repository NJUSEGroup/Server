package hrs.StubAndDriver.Service.OfflineRecordService;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.HotelVO;
import hrs.common.VO.OfflineRecordVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.Service.Interface.OfflineRecordService.OfflineRecordService;

public class OfflineRecordServiceDriver {
	private OfflineRecordService service;
	Date date;
	
	@Before
	public void launch(){
		service = new OfflineRecordServiceStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 15, 8, 0, 0);
		date = c.getTime();
	}
	
	@Test
	public void testFindByID(){
		OfflineRecordVO vo = service.findByID(0);
		HotelVO hotel = new HotelVO();
		hotel.id = 1;
		assertEquals(vo, new OfflineRecordVO(0, hotel, date, date, null, RoomType.Single, 1));
	}
	
	@Test
	public void testAdd(){
		HotelVO hotel = new HotelVO();
		hotel.id = 1;
		OfflineRecordVO vo = new OfflineRecordVO(1, hotel, date, date, null, RoomType.Single, 1);
		assertEquals(service.add(vo),ResultMessage.SUCCESS);
		assertEquals(service.findByID(1), vo);
	}
}

