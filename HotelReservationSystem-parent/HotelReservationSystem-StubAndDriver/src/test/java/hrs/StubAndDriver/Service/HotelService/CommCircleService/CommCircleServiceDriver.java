package hrs.StubAndDriver.Service.HotelService.CommCircleService;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.CommercialCircleVO;
import hrs.server.Service.Interface.HotelService.CommCircleService;

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
