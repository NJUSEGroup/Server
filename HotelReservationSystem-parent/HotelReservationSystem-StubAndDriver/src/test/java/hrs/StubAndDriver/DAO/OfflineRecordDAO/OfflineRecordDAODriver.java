package hrs.StubAndDriver.DAO.OfflineRecordDAO;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.OfflineRecordDAO;
import hrs.common.PO.OfflineRecordPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

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
		assertEquals(po,new OfflineRecordPO(0, 1, date, date, null, RoomType.Single, 1));
	}
	
	@Test
	public void testAdd(){
		OfflineRecordPO po = new OfflineRecordPO(0, 1, date, date, null, RoomType.Single, 1);
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
