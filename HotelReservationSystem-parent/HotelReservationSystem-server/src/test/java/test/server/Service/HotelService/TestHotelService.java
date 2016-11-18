package test.server.Service.HotelService;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hrs.common.VO.HotelVO;
import hrs.common.VO.OrderVO;
import hrs.server.Service.Interface.HotelService.HotelService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestHotelService {
	@Autowired
	private HotelService service;

	@Test
	public void testFindByID() {
		HotelVO vo = service.findByID(0);
		// assertEquals(vo,new HotelVO(0,"嘻嘻",0,0,"","",1));
	}

	@Test
	public void testUpdate() {
		HotelVO vo = service.findByID(0);
		vo.name = "呼呼呼";
		service.update(vo);
		assertEquals(vo, service.findByID(0));
	}

	@Test
	public void testAdd() {
		// HotelVO vo = new HotelVO(3,"啦啦啦",1,1,"","");
		// service.add(vo);
		// assertEquals(vo, service.findByID(3));
	}

	@Test
	public void testFindOrderedHotelAndOrder() {
		Map<HotelVO, List<OrderVO>> map = service.findOrderedHotelAndOrder("admin");
		for (HotelVO hotel : map.keySet()) {
			for (OrderVO order : map.get(hotel)) {
				assertEquals(order.user.username, "admin");
			}
		}
	}

	@Test
	public void testFind() {

	}

	@Test
	public void testGetRoomDetail() {

	}

	@Test
	public void testOrder1() {

	}

	@Test
	public void testOrder2() {

	}

	@Test
	public void testOrder3() {

	}

	@Test
	public void testFilter1() {

	}

	@Test
	public void testFilter2() {

	}

	@Test
	public void testFilter3() {

	}

	@Test
	public void testFilter4() {

	}
}
