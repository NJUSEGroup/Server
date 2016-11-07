package hrs.StubAndDriver.Service.OrderService;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.HotelVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.UserVO;
import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;
import hrs.server.Service.Interface.OrderService.OrderSearchService;

public class OrderSearchServiceDriver {
	private OrderSearchService service;
	private Date defaultDate;
	@Before
	public void launch(){
		service = new OrderSearchServiceStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 14, 8, 0, 0);
		defaultDate = c.getTime();
	}
	@Test
	public void testFindByID() {
		OrderVO vo = service.findByID(1);
		HotelVO hotel = new HotelVO();
		hotel.id = 0;
		UserVO user = new UserVO();
		user.id = 1;
		assertEquals(vo, new OrderVO(1,defaultDate,defaultDate,OrderStatus.Unexecuted,hotel,300,RoomType.Single,1,false,user,1));
	}

	@Test
	public void testFindByUsernameAndType() {
		List<OrderVO> list = service.findByUsernameAndType("admin", OrderStatus.Unexecuted);
		for (OrderVO vo : list) {
			assertEquals(vo.user.username, "admin");
			assertEquals(vo.status, OrderStatus.Unexecuted);
		}
	}

	@Test
	public void testFindByHotelAndUsername() {
		List<OrderVO> list = service.findByHotelAndUsername(0, "admin");
		for (OrderVO vo : list) {
			assertEquals(vo.hotel.id, 0);
			assertEquals(vo.user.username, "admin");
		}
	}
	
	@Test
	public void testFindByUsername() {
		List<OrderVO> list = service.findByUsername("admin");
		for (OrderVO vo : list) {
			assertEquals(vo.user.username, "admin");
		}
	}
	
	@Test
	public void testFindByOrderType() {
		List<OrderVO> list = service.findByOrderType(OrderStatus.Unexecuted);
		for (OrderVO vo : list) {
			assertEquals(vo.status, OrderStatus.Unexecuted);
		}
	}
}
