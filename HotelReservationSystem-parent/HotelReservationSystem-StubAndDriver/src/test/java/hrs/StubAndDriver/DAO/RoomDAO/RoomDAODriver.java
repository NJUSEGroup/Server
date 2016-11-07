package hrs.StubAndDriver.DAO.RoomDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;
import hrs.server.POJO.HotelPO;
import hrs.server.POJO.RoomPO;

public class RoomDAODriver {
	private RoomDAO dao;
	private List<RoomPO> list;

	@Before
	public void setUp() throws Exception {
		dao = new RoomDAOStub();
		list = new ArrayList<RoomPO>();
	}

	
	@Test
	public void testAdd() {
		HotelPO hotel = new HotelPO();
		hotel.setId(2);
		assertTrue(dao.update(new RoomPO(hotel, RoomType.Business, 0, 0)) == ResultMessage.SUCCESS);
	}

	@Test
	public void testUpdate() {
		HotelPO hotel = new HotelPO();
		hotel.setId(3);
		assertTrue(dao.update(new RoomPO(hotel, RoomType.Deluxe, 0, 0)) == ResultMessage.SUCCESS);
	}

	@Test
	public void testFindByHotelID() {
		HotelPO hotel = new HotelPO();
		hotel.setId(1);
		list.add(new RoomPO(hotel, RoomType.Single, 0, 0));
		assertEquals(list, dao.findByHotelID(1));
	}

}
