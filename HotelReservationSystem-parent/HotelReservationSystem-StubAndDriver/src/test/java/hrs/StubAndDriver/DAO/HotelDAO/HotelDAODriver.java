package hrs.StubAndDriver.DAO.HotelDAO;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.POJO.CommercialCirclePO;
import hrs.common.POJO.HotelPO;
import hrs.common.POJO.LocationPO;
import hrs.server.DAO.Interface.HotelDAO.HotelDAO;

public class HotelDAODriver {
	private HotelDAO dao;
	private LocationPO loc = new LocationPO();
	private CommercialCirclePO circle = new CommercialCirclePO();
	
	@Before
	public void launch(){
		dao = new HotelDAOStub();
		loc.setId(0);
		circle.setId(0);
	}
	
	@Test
	public void testFind(){
		List<HotelPO> pos = dao.find(0, 0);
		for(HotelPO po :pos){
			assertEquals(po.getId(),0);
			assertEquals(po.getName(), "嘻嘻");
		}
	}
	@Test
	public void testFindByID(){
		HotelPO po = dao.findByID(0);
		assertEquals(po,new HotelPO(0,"嘻嘻",loc,circle,"",""));
	}
	
	@Test
	public void testUpdate(){
		HotelPO po = dao.findByID(0);
		po.setName("哈哈");
		assertEquals(po,dao.findByID(0));
	}
	
	@Test
	public void testAdd(){
		loc.setId(1);
		circle.setId(1);
		HotelPO po = new HotelPO(1,"wuli韬韬",loc,circle,"","");
		dao.add(po);
		assertEquals(po,dao.findByID(1));
	}	
}
