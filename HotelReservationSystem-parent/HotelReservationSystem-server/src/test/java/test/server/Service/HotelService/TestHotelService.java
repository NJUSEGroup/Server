package test.server.Service.HotelService;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hrs.common.VO.CommercialCircleVO;
import hrs.common.VO.HotelVO;
import hrs.common.VO.LocationVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.RoomVO;
import hrs.server.Service.Interface.HotelService.HotelService;
import hrs.server.util.DateFormatter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestHotelService {
	@Autowired
	private HotelService service;

	@Test
	public void testFindByID() {
		HotelVO vo = service.findByID(1);
		assertEquals(vo.star, 3);
		System.out.println(vo);
	}

	@Test
	public void testUpdate() {
		HotelVO vo = service.findByID(1);
		vo.name = "呼呼呼酒店";
		service.update(vo);
		assertEquals("呼呼呼酒店", service.findByID(1).name);
	}

	@Test
	public void testAdd() {
		LocationVO loc = new LocationVO();
		loc.id = 1;
		CommercialCircleVO circle = new CommercialCircleVO();
		circle.id = 1;
		HotelVO vo = new HotelVO("啦啦啦酒店", 2, 0, loc, circle, "简介", "服务优质", "仙林大道", 0);
		service.add(vo);
		vo = service.findByID(7);
		assertEquals(vo.name, "啦啦啦酒店");
		assertEquals(vo.profile, "简介");
		System.out.println(vo);
	}

	@Test
	public void testFindOrderedHotelAndOrder() {
		Map<HotelVO, List<OrderVO>> map = service.findOrderedHotelAndOrder("admin");
		for (HotelVO hotel : map.keySet()) {
			System.out.println(hotel);
			for (OrderVO order : map.get(hotel)) {
				System.out.println(order);
				assertEquals(order.user.username, "admin");
			}
			System.out.println();
		}
	}

	@Test
	public void testFind1() throws ParseException {
		Date begin = DateFormatter.parseWithHMS("2016-10-19 00:00:00");
		Date end = DateFormatter.parseWithHMS("2016-10-20 00:00:00");
		Map<HotelVO, List<RoomVO>> map = service.find(1, 1, begin, end, "admin");
		assertEquals(map.size(),0);
	}
	
	@Test
	public void testFind2() throws ParseException {
		Date begin = DateFormatter.parseWithHMS("2016-10-19 00:00:00");
		Date end = DateFormatter.parseWithHMS("2016-10-20 00:00:00");
		Map<HotelVO, List<RoomVO>> map = service.find(1, 1, begin, end, "admin");
		assertEquals(map.size(),0);
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
