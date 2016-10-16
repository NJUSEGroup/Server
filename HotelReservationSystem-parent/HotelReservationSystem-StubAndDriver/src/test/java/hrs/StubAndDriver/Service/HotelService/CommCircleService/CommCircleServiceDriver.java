package hrs.StubAndDriver.Service.HotelService.CommCircleService;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.HotelService.CommCircleService;
import hrs.client.VO.CommercialCircleVO;

public class CommCircleServiceDriver {
	private CommCircleService service;
	@Before
	public void launch(){
		service = new CommCircleServiceStub();
	}
	
	@Test
	public void testFindByLoc(){
		List<CommercialCircleVO> list = service.findByLoc(0);
		for(CommercialCircleVO vo:list){
			assertEquals(vo.id,0);
		}
	}
}
