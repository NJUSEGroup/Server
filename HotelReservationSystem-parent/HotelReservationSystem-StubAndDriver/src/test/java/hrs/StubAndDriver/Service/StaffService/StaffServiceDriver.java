package hrs.StubAndDriver.Service.StaffService;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.HotelVO;
import hrs.common.VO.StaffVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.StaffType;
import hrs.server.Service.Interface.StaffService.StaffService;

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
		HotelVO vo = new HotelVO();
		vo.id = 0;
		assertTrue(service.add(new StaffVO("staff233", "110", "老王", StaffType.WebsiteMarketer, vo)) == ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate() {
		HotelVO vo = new HotelVO();
		vo.id = 0;
		assertTrue(service.update(new StaffVO("staff233", "110", "老王", StaffType.WebsiteMarketer, vo)) == ResultMessage.SUCCESS);
	}
}
