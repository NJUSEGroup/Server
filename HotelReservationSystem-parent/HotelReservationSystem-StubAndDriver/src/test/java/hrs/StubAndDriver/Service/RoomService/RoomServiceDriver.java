package hrs.StubAndDriver.Service.RoomService;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.RoomService.RoomService;
import hrs.client.VO.RoomVO;
import hrs.common.util.type.RoomType;

public class RoomServiceDriver {
	private RoomService service;
	@Before
	public void setUp() throws Exception {
		service = new RoomServiceStub();
	}

	@Test
	public void testUpdate() {
		RoomVO vo = new RoomVO(1, RoomType.Single, 100, 0);
		service.update(vo);
		assertEquals(100, service.findByHotelAndType(1, RoomType.Single).roomNum);
	}
	
	@Test
	public void testAdd() {
		RoomVO vo = new RoomVO(2, RoomType.Single, 0, 0);
		service.add(vo);
		assertEquals(vo, service.findByHotelAndType(2, RoomType.Single));
	}
	
	
	@Test
	public void testFindByHotelAndType() {
		RoomVO vo = service.findByHotelAndType(1, RoomType.Single);
		assertEquals(0, vo.roomNum);
	}
}
