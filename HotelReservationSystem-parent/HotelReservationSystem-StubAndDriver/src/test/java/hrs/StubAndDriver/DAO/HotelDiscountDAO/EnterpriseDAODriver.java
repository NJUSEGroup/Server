package hrs.StubAndDriver.DAO.HotelDiscountDAO;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.HotelDiscountDAO.EnterpriseDAO;
import hrs.common.PO.EnterprisePO;

public class EnterpriseDAODriver {
	private EnterpriseDAO dao;
	
	@Before
	public void launch(){
		dao = new EnterpriseDAOStub();
	}
	
	@Test
	public void testFindAll(){
		List<EnterprisePO> list=dao.findAll();
		for(EnterprisePO po : list){
			assertEquals(po.getName(),"21");
		}
		
	}
	

}
