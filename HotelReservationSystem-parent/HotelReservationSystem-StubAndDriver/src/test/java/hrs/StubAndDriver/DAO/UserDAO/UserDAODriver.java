package hrs.StubAndDriver.DAO.UserDAO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.UserDAO;
import hrs.common.PO.UserPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.UserType;

public class UserDAODriver {
	private UserDAO dao;
	
	@Before
	public void launch(){
		dao = new UserDAOStub();
	}
	
	@Test
	public void testFindByUsername() {
		UserPO po = dao.findByUserName("admin");
		assertEquals(po,new UserPO("admin","admin", null, null, 0, 0, UserType.Normal));
	}
	
	@Test
	public void testAdd(){
		assertTrue(dao.add(new UserPO("NewSong","66666666", null, null, 0, 0, UserType.Normal)) == ResultMessage.SUCCESS);
	}
	@Test
	public void testUpdate(){
		assertTrue(dao.update(new UserPO("admin","7777777777777", null, null, 0, 0, UserType.Normal)) == ResultMessage.SUCCESS);
	}
}
