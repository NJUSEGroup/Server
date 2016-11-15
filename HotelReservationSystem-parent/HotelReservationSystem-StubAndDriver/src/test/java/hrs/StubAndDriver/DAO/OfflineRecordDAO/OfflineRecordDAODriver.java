package hrs.StubAndDriver.DAO.OfflineRecordDAO;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.OfflineRecordDAO;
import hrs.server.POJO.HotelPO;
import hrs.server.POJO.OfflineRecordPO;

public class OfflineRecordDAODriver {
	private OfflineRecordDAO dao;
	Date date;
	
	@Before
	public void launch(){
		dao = new OfflineRecordDAOStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 15, 8, 0, 0);
		date = c.getTime();
	}
	
	@Test
	public void testFindByID(){
		OfflineRecordPO po = dao.findByID(0);
		HotelPO hotel = new HotelPO();
		hotel.setId(1);
		assertEquals(po,new OfflineRecordPO( hotel, date, date, , RoomType.Single, 1));
	}
	
	@Test
	public void testAdd(){
		HotelPO hotel = new HotelPO();
		hotel.setId(1);
		OfflineRecordPO po = new OfflineRecordPO(0,hotel, date, date, null, RoomType.Single, 1);
		assertEquals(dao.add(po),ResultMessage.SUCCESS);
		assertEquals(dao.findByID(0),po);
	}
	
	@Test
	public void testUpdate(){
		OfflineRecordPO po = dao.findByID(0);
		po.setNum(2);
		dao.update(po);
		assertEquals(dao.findByID(0), po);
	}
}
