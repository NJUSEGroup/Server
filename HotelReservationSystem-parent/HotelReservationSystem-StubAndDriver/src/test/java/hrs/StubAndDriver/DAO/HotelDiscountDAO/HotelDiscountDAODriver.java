package hrs.StubAndDriver.DAO.HotelDiscountDAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.HotelDiscountDAO.HotelDiscountDAO;
import hrs.common.PO.HotelDiscountPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;

public class HotelDiscountDAODriver {
	private HotelDiscountDAO dao;
	
	@Before
	public void launch(){
		dao=new HotelDiscountDAOStub();			
	}
	
	@Test
	public void testAdd(){
		assertTrue(dao.add(new HotelDiscountPO(1, 1, 0.9, HotelDiscountType.Birthday, 0, 0 ,null, null))==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate(){
		assertTrue(dao.update(new HotelDiscountPO(1, 1, 0.8, HotelDiscountType.Birthday, 0,0,null, null))==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testDelete(){
		assertTrue(dao.delete(1)==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testFindAllByHotelID(){
		List<HotelDiscountPO> list=dao.findAllByHotelID(0);
		for(HotelDiscountPO po:list){
			assertEquals(po.getHotelId(),0);
		}
	}
}
