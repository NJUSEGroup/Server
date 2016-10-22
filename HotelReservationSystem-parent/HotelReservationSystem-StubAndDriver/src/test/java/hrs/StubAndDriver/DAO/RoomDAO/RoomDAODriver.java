package hrs.StubAndDriver.DAO.RoomDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.RoomDAO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
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
	public void testFindByHotelAndType() {
		RoomPO po=dao.findByHotelAndType(1, RoomType.Single);
		assertEquals(po, new RoomPO(1,RoomType.Single, 0, 0));
	}
	
	@Test
	public void testAdd(){
		assertTrue(dao.update(new RoomPO(2, RoomType.Business, 0, 0))==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate(){
		assertTrue(dao.update(new RoomPO(3, RoomType.Deluxe, 0, 0))==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testFindByHotelID(){
		list.add(new RoomPO(1,RoomType.Single, 0, 0));
		assertEquals(list,dao.findByHotelID(1));
	}

}
