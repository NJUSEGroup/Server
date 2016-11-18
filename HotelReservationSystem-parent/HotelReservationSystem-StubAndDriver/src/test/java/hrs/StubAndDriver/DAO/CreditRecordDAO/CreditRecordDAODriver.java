package hrs.StubAndDriver.DAO.CreditRecordDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.CreditRecordType;
import hrs.server.DAO.Interface.CreditRecordDAO;
import hrs.server.POJO.CreditRecordPO;
import hrs.server.POJO.UserPO;

public class CreditRecordDAODriver {
	private CreditRecordDAO dao;
	private UserPO user = new UserPO();
	
	@Before
	public void launch() {
		dao = new CreditRecordDAOStub();
		
	}

	@Test
	public void testFindByUsername() {
		List<CreditRecordPO> list = dao.findByUsername("admin");
		List<CreditRecordPO> list1 = new ArrayList<>();
		user.setUsername("admin");
		list1.add(new CreditRecordPO(0, user, CreditRecordType.Execute, 10, 10));
		assertEquals(list, list1);
	}

	@Test
	public void testAdd() {
		user.setUsername("admin8");
		assertTrue(dao.add(new CreditRecordPO(1, user, CreditRecordType.Execute, 0, 0)) == ResultMessage.SUCCESS);
	}

}
