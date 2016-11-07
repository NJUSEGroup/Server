package hrs.StubAndDriver.Service.OrderService;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.HotelVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;
import hrs.server.Service.Interface.OrderService.OrderSearchService;
import hrs.server.Service.Interface.OrderService.OrderService;

public class OrderServiceDriver {
	private OrderService service;
	private OrderSearchService searchService;
	private Date defaultDate;
	@Before
	public void launch(){
		service = new OrderServiceStub();
		searchService = new OrderSearchServiceStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 14, 8, 0, 0);
		defaultDate = c.getTime();
	}
	
	
	
	
	@Test
	public void testAdd(){
		HotelVO hotel = new HotelVO();
		hotel.id = 0;
		UserVO user = new UserVO();
		user.id = 1;
		OrderVO vo = new OrderVO(1, defaultDate, defaultDate, OrderStatus.Unexecuted, hotel, 300, RoomType.Single, 1,
				false, user,1);
		assertEquals(service.add(vo),ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate(){
		OrderVO vo = searchService.findByID(0);
		vo.status = OrderStatus.UserRevoked;
		service.revoke(vo);
		assertEquals(searchService.findByID(0), vo);
	}
}
