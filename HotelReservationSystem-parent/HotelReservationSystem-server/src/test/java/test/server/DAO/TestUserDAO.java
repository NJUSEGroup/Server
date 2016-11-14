package test.server.DAO;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.POJO.UserPO;
import hrs.common.util.type.UserType;
import hrs.server.DAO.Interface.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUserDAO {
	@Autowired
	private UserDAO dao;

	@Transactional
	@Test
	public void testFindByUsername() {
		assertEquals(dao.findByUserName("admin").getUsername(), "admin");
	}

	@Transactional
	@Test
	public void testAdd() {
		UserPO po = new UserPO("NewSong", "66666666", "150150150", "AreYouOK", 0, 0, UserType.Normal);;
		dao.add(po);
		assertEquals(po,dao.findByUserName("NewSong"));
	}

	@Transactional
	@Test
	public void testUpdate() {
		UserPO po = dao.findByUserName("admin");
		po.setName("yo");
		dao.update(po);
		assertEquals(dao.findByUserName("admin").getName(),"yo");
	}
}
