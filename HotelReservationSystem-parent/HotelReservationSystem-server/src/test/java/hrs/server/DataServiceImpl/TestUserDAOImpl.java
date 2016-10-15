/*package hrs.server.DataServiceImpl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hrs.common.DAO.UserDAO;
import hrs.common.PO.UserPO;
import hrs.common.util.type.UserType;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:applicationContext.xml")
public class TestUserDAOImpl {
	@Autowired
	private UserDAO dao;

	@Test
	public void testFindByUsername() {
		UserPO user = dao.findByUserName("admin");
		assertEquals(user.getPassword(),"admin");
	}
	
	@Test
	public void testAdd(){
		UserPO po = new UserPO("admin2","admin2", "", "", 0, 0, UserType.Normal);
		dao.add(po);
		assertEquals(dao.findByUserName("admin2").getPassword(),"admin2");
	}
	
	@Test 
	public void testUpdate(){
		UserPO po = dao.findByUserName("admin");
		po.setPassword("123456789");
		dao.update(po);
		assertEquals(po, dao.findByUserName("admin"));
	}
}
*/