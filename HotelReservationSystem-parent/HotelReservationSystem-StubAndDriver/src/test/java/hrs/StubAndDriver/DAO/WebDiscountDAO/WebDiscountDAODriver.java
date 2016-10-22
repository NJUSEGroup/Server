package hrs.StubAndDriver.DAO.WebDiscountDAO;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.WebDiscountDAO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.WebsiteDiscountType;
import hrs.server.POJO.WebDiscountPO;

public class WebDiscountDAODriver {
	private WebDiscountDAO dao;
	private Date date;
	
	@Before
	public void launch(){
		dao = new WebDiscountDAOStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 15, 8, 0, 0);
		date = c.getTime();
	}
	
	@Test
	public void testAdd(){
		WebDiscountPO po = new WebDiscountPO(0, WebsiteDiscountType.SpecialPeriod, 0.8, date, date, null, 0);
		assertEquals(dao.add(po),ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate(){
		WebDiscountPO po = dao.findAll().get(0);
		po.setDiscount(0.9);
		dao.update(po);
		assertEquals(dao.findAll().get(0), po);
	}
	
	@Test
	public void testFindAll(){
		List<WebDiscountPO> pos = dao.findAll();
		assertNotNull(pos);
	}
	
	@Test
	public void testDelete(){
		assertTrue(dao.delete(0)==ResultMessage.SUCCESS);
	}
}
