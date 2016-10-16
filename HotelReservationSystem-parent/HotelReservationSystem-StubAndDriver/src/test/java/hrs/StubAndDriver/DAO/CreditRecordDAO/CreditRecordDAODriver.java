package hrs.StubAndDriver.DAO.CreditRecordDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.CreditRecordDAO;
import hrs.common.PO.CreditRecordPO;
import hrs.common.PO.UserPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.CreditRecordType;
import hrs.common.util.type.UserType;

public class CreditRecordDAODriver {
	private CreditRecordDAO dao;

	@Before
	public void launch() {
		dao = new CreditRecordDAOStub();
	}

	@Test
	public void testFindByUsername() {
		List<CreditRecordPO> list = dao.findByUsername("admin");
		List<CreditRecordPO> list1 = new ArrayList<>();
		list1.add(new CreditRecordPO(0, "admin", CreditRecordType.Execute, 10, 10));
		assertEquals(list, list1);
	}

	@Test
	public void testAdd() {
		assertTrue(dao.add(new CreditRecordPO(1, "admin1", CreditRecordType.Execute, 0, 0)) == ResultMessage.SUCCESS);
	}

}
