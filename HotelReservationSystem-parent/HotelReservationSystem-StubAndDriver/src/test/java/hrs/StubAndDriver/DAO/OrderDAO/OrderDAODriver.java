package hrs.StubAndDriver.DAO.OrderDAO;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.OrderDAO;
import hrs.server.POJO.HotelPO;
import hrs.server.POJO.OrderPO;
import hrs.server.POJO.UserPO;

public class OrderDAODriver {
	private OrderDAO dao;
	private Date defaultDate;

	@Before
	public void launch() {
		dao = new OrderDAOStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 14, 8, 0, 0);
		defaultDate = c.getTime();
	}

	@Test
	public void testFindByID() {
		OrderPO po = dao.findByID(0);
		HotelPO hotel = new HotelPO();
		hotel.setId(0);
		UserPO user = new UserPO();
		user.setId(0);
		assertEquals(po, new OrderPO(0, defaultDate, defaultDate, OrderStatus.Unexecuted, hotel, 300, RoomType.Single, 1,
				false, user,1));
	}

	@Test
	public void testFindByUsernameAndType() {
		List<OrderPO> list = dao.findByUsernameAndType("admin", OrderStatus.Unexecuted);
		for (OrderPO po : list) {
			assertEquals(po.getUser().getUsername(), "admin");
			assertEquals(po.getStatus(), OrderStatus.Unexecuted);
		}
	}

	@Test
	public void testFindByHotelAndUsername() {
		List<OrderPO> list = dao.findByHotelAndUsername(0, "admin");
		for (OrderPO po : list) {
			assertEquals(po.getHotel().getId(), 0);
			assertEquals(po.getUser().getUsername(), "admin");
		}
	}
	
	@Test
	public void testFindByUsername() {
		List<OrderPO> list = dao.findByUsername("admin");
		for (OrderPO po : list) {
			assertEquals(po.getUser().getUsername(), "admin");
		}
	}
	
	@Test
	public void testFindByOrderType() {
		List<OrderPO> list = dao.findByOrderType(OrderStatus.Unexecuted);
		for (OrderPO po : list) {
			assertEquals(po.getStatus(), OrderStatus.Unexecuted);
		}
	}
	
	
	@Test
	public void testAdd(){
		HotelPO hotel = new HotelPO();
		hotel.setId(0);
		UserPO user = new UserPO();
		user.setId(0);
		OrderPO po = new OrderPO(0, defaultDate, defaultDate, OrderStatus.Unexecuted, hotel, 300, RoomType.Single, 1,
				false, user,1);
		assertEquals(dao.add(po),ResultMessage.SUCCESS);
		assertEquals(dao.findByID(0),po);
	}
	
	@Test
	public void testUpdate(){
		OrderPO po = dao.findByID(0);
		po.setNum(2);
		dao.update(po);
		assertEquals(dao.findByID(0), po);
	}
	
}
