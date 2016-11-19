package test.server.Service.PromotionService;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.PromotionService.EnterpriseNotFoundException;
import hrs.common.VO.EnterpriseVO;
import hrs.server.Service.Interface.PromotionService.EnterpriseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestEnterpriseService {
	@Autowired
	private EnterpriseService service;

	@Test
	public void testgetAllEnterprises() throws EnterpriseNotFoundException {
		List<EnterpriseVO> list = service.getAllEnterprises();
		for (EnterpriseVO vo : list) {
			System.out.println(vo);
		}
		assertNotNull(list);
	}

	@Test
	public void testAdd() throws EnterpriseNotFoundException {
		EnterpriseVO enterprise = new EnterpriseVO("华为");
		service.add(enterprise);
		List<EnterpriseVO> list = service.getAllEnterprises();
		for(EnterpriseVO vo:list){
			if(vo.name.equals("华为")){
				return;
			}
		}
		fail();
	}
	
}
