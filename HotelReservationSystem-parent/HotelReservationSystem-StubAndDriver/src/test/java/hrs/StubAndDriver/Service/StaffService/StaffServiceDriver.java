package hrs.StubAndDriver.Service.StaffService;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.StaffService;
import hrs.client.VO.StaffVO;
import hrs.client.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.StaffType;

public class StaffServiceDriver {
	private StaffService service;
	
	@Before
	public void setUp() throws Exception {
		service = new StaffServiceStub();
	}

	@Test
	public void testLogin() {
		assertNull(service.login("staff", "aaa"));
	}
	
	@Test
	public void testAdd() {
		assertTrue(service.add(new StaffVO("staff233", "110", "老王", StaffType.WebsiteMarketer, null)) == ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate() {
		assertTrue(service.update(new StaffVO("staff233", "110", "老王", StaffType.WebsiteMarketer, null)) == ResultMessage.SUCCESS);
	}
}
