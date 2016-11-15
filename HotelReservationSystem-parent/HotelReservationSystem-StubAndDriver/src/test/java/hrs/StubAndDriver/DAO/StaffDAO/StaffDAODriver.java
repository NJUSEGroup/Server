package hrs.StubAndDriver.DAO.StaffDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import hrs.common.POJO.HotelPO;
import hrs.common.POJO.StaffPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.StaffType;
import hrs.server.DAO.Interface.StaffDAO;

public class StaffDAODriver {
	private StaffDAO dao;

	@Before
	public void setUp() throws Exception {
		dao = new StaffDAOStub();
	}

	@Test
	public void testAdd() {
		HotelPO po = new HotelPO();
		po.setId(0);
		assertTrue(dao.add(new StaffPO(2, "staff*", "110", "wang", StaffType.HotelStaff, po)) == ResultMessage.SUCCESS);
	}

	@Test
	public void testUpdate() {
		HotelPO po = new HotelPO();
		po.setId(0);
		assertTrue(
				dao.update(new StaffPO(1, "staff*", "120", "wang", StaffType.HotelStaff, po)) == ResultMessage.SUCCESS);
	}

	@Test
	public void testFindByUsername() {
		HotelPO hotel = new HotelPO();
		hotel.setId(0);
		StaffPO po = new StaffPO(0, "staff", "110", "staff", StaffType.WebsiteMarketer, hotel);
		assertEquals(po, dao.findByUsername("staff"));
	}
}
