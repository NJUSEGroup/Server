package hrs.Mock.RoomService;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.type.RoomType;
import hrs.server.Service.Interface.RoomService.RoomService;

public class RoomServiceTester {
	private RoomService service;
	@Before
	public void setUp() throws Exception {
		service = new RoomServiceMock();
	}

	@Test
	public void testUpdate() {
		HotelVO hotel = new HotelVO();
		hotel.id = 1;
		RoomVO vo = new RoomVO(hotel, RoomType.Single, 100, 0);
		service.update(vo);
		assertEquals(100, service.findByHotelAndType(1, RoomType.Single).roomNum);
	}
	
	@Test
	public void testAdd() {
		HotelVO hotel = new HotelVO();
		hotel.id = 2;
		RoomVO vo = new RoomVO(hotel, RoomType.Single, 0, 0);
		service.add(vo);
		assertEquals(vo, service.findByHotelAndType(2, RoomType.Single));
	}
	
	
	@Test
	public void testFindByHotelAndType() {
		RoomVO vo = service.findByHotelAndType(1, RoomType.Single);
		assertEquals(0, vo.roomNum);
	}
}
