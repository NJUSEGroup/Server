package hrs.StubAndDriver.DAO.StaffDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.StaffDAO;
import hrs.common.PO.StaffPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.StaffType;

public class StaffDAODriver {
	private StaffDAO dao;
	@Before
	public void setUp() throws Exception {
		dao = new StaffDAOStub();
	}
	@Test
	public void testAdd() {
		assertTrue(dao.add(new StaffPO("staff*", "110", "wang", StaffType.HotelStaff, "su8"))==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate() {
		assertTrue(dao.update(new StaffPO("staff*", "120", "wang", StaffType.HotelStaff, "su8"))==ResultMessage.SUCCESS);
	}
	
	
	@Test
	public void testFindByUsername() {
		StaffPO po=new StaffPO("staff", "110", "staff", StaffType.WebsiteMarketer, null);
		assertEquals(po, dao.findByUsername("staff"));
	}
}
