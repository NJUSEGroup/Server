package hrs.StubAndDriver.Service.CreditRecordService;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.CreditRecordService;
import hrs.client.VO.CreditRecordVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.CreditRecordType;

public class CreditRecordServiceDriver {
	private CreditRecordService service;
	
	@Before
	public void launch(){
		service=new CreditRecordServiceStub();
	}
	
	@Test
	public void testfindByUsername(){
		List<CreditRecordVO> vos=service.findByUsername("admin");
		for(CreditRecordVO vo:vos){
			assertEquals(vo.getUsername(),"admin");
		}
	}
	
	@Test
	public void testAdd(){
		assertTrue(service.add(new CreditRecordVO(0, "admin", CreditRecordType.Execute, 0, 0))==ResultMessage.SUCCESS);
	}

}
