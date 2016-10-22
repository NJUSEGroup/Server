package hrs.StubAndDriver.DAO.HotelDAO.CommCircleDAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.HotelDAO.CommCircleDAO;
import hrs.server.POJO.CommercialCirclePO;

public class CommCircleDAODriver {
	private CommCircleDAO dao;
	@Before
	public void launch(){
		dao = new CommCircleDAOStub();
	}
	@Test
	public void testFindByLocID(){
		List<CommercialCirclePO> list = dao.findByLoc(0);
		for(CommercialCirclePO po:list){
			assertEquals(po.getId(),0);
		}
	}
	
}
