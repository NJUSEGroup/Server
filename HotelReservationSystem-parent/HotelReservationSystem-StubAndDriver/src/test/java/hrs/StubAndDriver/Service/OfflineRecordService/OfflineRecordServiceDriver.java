package hrs.StubAndDriver.Service.OfflineRecordService;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.OfflineRecordService;
import hrs.client.VO.OfflineRecordVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

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
		assertEquals(vo, new OfflineRecordVO(0, 1, date, date, null, RoomType.Single, 1));
	}
	
	@Test
	public void testAdd(){
		OfflineRecordVO vo = new OfflineRecordVO(1, 1, date, date, null, RoomType.Single, 1);
		assertEquals(service.add(vo),ResultMessage.SUCCESS);
		assertEquals(service.findByID(1), vo);
	}
	
	@Test
	public void testUpdate(){
		OfflineRecordVO vo = service.findByID(0);
		vo.setNum(2);
		service.update(vo);
		assertEquals(service.findByID(0), vo);
	}
}

