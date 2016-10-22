package hrs.StubAndDriver.DAO.HotelDAO;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.HotelDAO.HotelDAO;
import hrs.server.POJO.HotelPO;

public class HotelDAODriver {
	private HotelDAO dao;
	
	@Before
	public void launch(){
		dao = new HotelDAOStub();
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
		assertEquals(po,new HotelPO(0,"嘻嘻",0,0,"",""));
	}
	
	@Test
	public void testUpdate(){
		HotelPO po = dao.findByID(0);
		po.setName("哈哈");
		assertEquals(po,dao.findByID(0));
	}
	
	@Test
	public void testAdd(){
		HotelPO po = new HotelPO(1,"wuli韬韬",1,1,"","");
		dao.add(po);
		assertEquals(po,dao.findByID(1));
	}	
}
