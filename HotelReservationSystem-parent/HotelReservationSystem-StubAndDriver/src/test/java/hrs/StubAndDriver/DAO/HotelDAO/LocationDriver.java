package hrs.StubAndDriver.DAO.HotelDAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.PO.LocationPO;

public class LocationDriver {
	private LocationDAOStub dao;
	
	@Before
	public void launch(){
		dao = new LocationDAOStub();
	}
	
	@Test
	public void testFindAll(){
		List<LocationPO> list = dao.findAll();
		for(LocationPO po:list){
			assertEquals(po,new LocationPO(0,"南京"));
		}
	}
}
