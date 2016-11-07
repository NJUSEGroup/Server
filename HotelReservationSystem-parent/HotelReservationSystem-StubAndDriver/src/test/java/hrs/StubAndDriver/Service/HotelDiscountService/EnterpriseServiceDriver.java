package hrs.StubAndDriver.Service.HotelDiscountService;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.EnterpriseVO;
import hrs.server.Service.Interface.PromotionService.EnterpriseService;

public class EnterpriseServiceDriver {
	private EnterpriseService enterpriseService;
	
	@Before
	public void launch(){
		enterpriseService=new EnterpriseServiceStub();
	}
	
	@Test
	public void testgetAllEnterprises(){
		List<EnterpriseVO> list=enterpriseService.getAllEnterprises();
		for(EnterpriseVO vo:list){
			assertEquals(vo.name,"21");
		}
	}

}
