package hrs.StubAndDriver.Service.CreditRecordService;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.CreditRecordType;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;

public class CreditRecordServiceDriver {
	private CreditRecordService service;

	@Before
	public void launch() {
		service = new CreditRecordServiceStub();
	}

	@Test
	public void testfindByUsername() {
		List<CreditRecordVO> vos = service.findByUsername("admin");
		for (CreditRecordVO vo : vos) {
			assertEquals(vo.user.username, "admin");
		}
	}

	@Test
	public void testAdd() {
		OrderVO order = new OrderVO();
		order.id = 1;
		UserVO user = new UserVO();
		user.id = 1;
		assertTrue(service
				.add(new CreditRecordVO(0, order, user, CreditRecordType.Execute, 0, 0)) == ResultMessage.SUCCESS);
	}

}
