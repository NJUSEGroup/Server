package hrs.StubAndDriver.Service.WebDiscountService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.CommercialCircleVO;
import hrs.common.VO.LocationVO;
import hrs.common.VO.WebDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.WebsiteDiscountType;
import hrs.server.Service.Interface.PromotionService.WebDiscountService;

public class WebDiscountServiceDriver {
	private WebDiscountService service;
	private Date date;

	@Before
	public void launch() {
		service = new WebDiscountServiceStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 15, 8, 0, 0);
		date = c.getTime();
	}

	@Test
	public void testFindAll() {
		List<WebDiscountVO> vos = service.findAll();
		assertNotNull(vos);
	}

	@Test
	public void testAdd() {
		LocationVO loc = new LocationVO();
		loc.setId(0);
		CommercialCircleVO circle = new CommercialCircleVO();
		circle.setId(0);
		WebDiscountVO vo = new WebDiscountVO(0, 0.8, WebsiteDiscountType.SpecialPeriod, loc,circle,date, date, 0);
		assertEquals(service.add(vo), ResultMessage.SUCCESS);
	}

	@Test
	public void testUpdate() {
		WebDiscountVO vo = service.findAll().get(0);
		vo.discount = 0.9;
		service.update(vo);
		assertEquals(service.findAll().get(0), vo);
	}

	@Test
	public void testDelete() {
		assertTrue(service.delete(0) == ResultMessage.SUCCESS);
	}

}
