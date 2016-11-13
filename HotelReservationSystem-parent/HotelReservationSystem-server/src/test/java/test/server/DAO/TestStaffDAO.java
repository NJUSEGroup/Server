package test.server.DAO;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.util.type.StaffType;
import hrs.server.DAO.Interface.StaffDAO;
import hrs.server.POJO.HotelPO;
import hrs.server.POJO.StaffPO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestStaffDAO {
	@Autowired
	private StaffDAO dao;

	@Transactional
	@Test
	public void testAdd() {
		HotelPO hotel = new HotelPO();
		hotel.setId(4);
		StaffPO po = new StaffPO("hotelmanager", "130130130", "wang", StaffType.HotelStaff, hotel);
		dao.add(po);
		assertEquals(po,dao.findByUsername("hotelmanager"));
	}

	@Transactional
	@Test
	public void testUpdate() {
		StaffPO po = dao.findByUsername("admin3");
		po.setName("lulu");
		dao.update(po);
		assertEquals(dao.findByUsername("admin3").getName(),"lulu");
	}

	@Transactional
	@Test
	public void testFindByUsername() {
		assertEquals(dao.findByUsername("admin3").getUsername(),"admin3");
	}

	@Transactional
	@Test
	public void testFindByHotelName() {
		assertEquals(dao.findByHotelName("仙林大酒店").getUsername(),"admin3");
	}
}
