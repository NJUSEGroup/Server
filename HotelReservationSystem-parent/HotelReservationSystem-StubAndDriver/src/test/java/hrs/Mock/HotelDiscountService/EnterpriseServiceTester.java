package hrs.Mock.HotelDiscountService;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.EnterpriseVO;
import hrs.server.Service.Interface.PromotionService.EnterpriseService;

public class EnterpriseServiceTester {
	private EnterpriseService enterpriseService;
	
	@Before
	public void launch(){
		enterpriseService=new EnterpriseServiceMock();
	}
	
	@Test
	public void testgetAllEnterprises(){
		List<EnterpriseVO> list=enterpriseService.getAllEnterprises();
		for(EnterpriseVO vo:list){
			assertEquals(vo.name,"21");
		}
	}

}
