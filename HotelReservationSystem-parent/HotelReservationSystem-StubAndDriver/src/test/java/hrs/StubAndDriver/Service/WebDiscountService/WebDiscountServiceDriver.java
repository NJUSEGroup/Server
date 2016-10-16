package hrs.StubAndDriver.Service.WebDiscountService;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.WebDiscountService;
import hrs.client.VO.WebDiscountVO;
import hrs.common.PO.WebDiscountPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.WebsiteDiscountType;

public class WebDiscountServiceDriver {
	private WebDiscountService service;
	private Date date;
	
	@Before
	public void launch(){
		service = new WebDiscountServiceStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 15, 8, 0, 0);
		date = c.getTime();
	}
	
	@Test
	public void testFindAll(){
		List<WebDiscountVO> vos = service.findAll();
		assertNotNull(vos);
	}
	
	@Test
	public void testAdd(){
		WebDiscountVO vo = new WebDiscountVO(0, WebsiteDiscountType.SpecialPeriod, 0.8, date, date, null, 0);
		assertEquals(service.add(vo), ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate(){
		WebDiscountVO vo = service.findAll().get(0);
		vo.discount = 0.9;
		service.update(vo);
		assertEquals(service.findAll().get(0), vo);
	}
	
	@Test
	public void testDelete(){
		assertTrue(service.delete(0)==ResultMessage.SUCCESS);
	}
	
}

