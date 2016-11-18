package hrs.StubAndDriver.DAO.HotelDiscountDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;
import hrs.server.POJO.EnterprisePO;
import hrs.server.POJO.HotelDiscountPO;
import hrs.server.POJO.HotelPO;

public class HotelDiscountDAODriver {
	private hrs.server.DAO.Interface.PromotionDAO.HotelDiscountDAO dao;
	
	@Before
	public void launch(){
		dao=new HotelDiscountDAOStub();			
	}
	
	@Test
	public void testAdd(){
		HotelPO hotel = new HotelPO();
		hotel.setId(0);
		EnterprisePO enterprise = new EnterprisePO();
		enterprise.setId(0);
		assertTrue(dao.add(new HotelDiscountPO(1,hotel , 0.9, HotelDiscountType.Birthday, enterprise, 0 ,null, null))==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate(){
		HotelPO hotel = new HotelPO();
		hotel.setId(0);
		EnterprisePO enterprise = new EnterprisePO();
		enterprise.setId(2);
		assertTrue(dao.add(new HotelDiscountPO(1,hotel , 0.9, HotelDiscountType.Birthday, enterprise, 0 ,null, null))==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testDelete(){
		assertTrue(dao.delete(1)==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testFindAllByHotelID(){
		List<HotelDiscountPO> list=dao.findAllByHotelID(0);
		for(HotelDiscountPO po:list){
			assertEquals(po.getId(),0);
		}
	}
}
