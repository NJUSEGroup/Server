package hrs.StubAndDriver.Service.OrderService;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.OrderService;
import hrs.client.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;

public class OrderServiceDriver {
	private OrderService service;
	private Date defaultDate;
	@Before
	public void launch(){
		service = new OrderServiceStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 14, 8, 0, 0);
		defaultDate = c.getTime();
	}
	
	@Test
	public void testFindByID() {
		OrderVO vo = service.findByID(0);
		assertEquals(vo, new OrderVO(0, defaultDate, defaultDate, OrderStatus.Unexecuted, 0, 300, RoomType.Single, 1,
				false, "admin"));
	}

	@Test
	public void testFindByUsernameAndType() {
		List<OrderVO> list = service.findByUsernameAndType("admin", OrderStatus.Unexecuted);
		for (OrderVO vo : list) {
			assertEquals(vo.username, "admin");
			assertEquals(vo.status, OrderStatus.Unexecuted);
		}
	}

	@Test
	public void testFindByHotelAndUsername() {
		List<OrderVO> list = service.findByHotelAndUsername(0, "admin");
		for (OrderVO vo : list) {
			assertEquals(vo.hotelID, 0);
			assertEquals(vo.username, "admin");
		}
	}
	
	@Test
	public void testFindByUsername() {
		List<OrderVO> list = service.findByUsername("admin");
		for (OrderVO vo : list) {
			assertEquals(vo.username, "admin");
		}
	}
	
	@Test
	public void testFindByOrderType() {
		List<OrderVO> list = service.findByOrderType(OrderStatus.Unexecuted);
		for (OrderVO vo : list) {
			assertEquals(vo.status, OrderStatus.Unexecuted);
		}
	}
	
	
	@Test
	public void testAdd(){
		OrderVO vo = new OrderVO(1, defaultDate, defaultDate, OrderStatus.Unexecuted, 0, 300, RoomType.Single, 1,
				false, "admin");
		assertEquals(service.add(vo),ResultMessage.SUCCESS);
		assertEquals(service.findByID(1),vo);
	}
	
	@Test
	public void testUpdate(){
		OrderVO vo = service.findByID(0);
		vo.num  = 2;
		vo.status = OrderStatus.UserRevoked;
		service.update(vo);
		assertEquals(service.findByID(0), vo);
	}
}
