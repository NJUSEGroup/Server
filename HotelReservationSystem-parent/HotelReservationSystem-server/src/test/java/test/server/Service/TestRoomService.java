package test.server.Service;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.type.RoomType;
import hrs.server.Service.Interface.RoomService.RoomService;
import hrs.server.util.DateFormatter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestRoomService {
	@Autowired
	private RoomService service;
	@Transactional
	@Test
	public void testUpdate() {
		RoomVO vo = service.findByHotelAndType(1, RoomType.Single);
		vo.roomNum = 9;
		service.update(vo);
		assertEquals(9, service.findByHotelAndType(1, RoomType.Single).roomNum);
	}

	@Test
	public void testAdd() {
		HotelVO hotel = new HotelVO();
		hotel.id = 6;
		RoomVO vo = new RoomVO(hotel, RoomType.Business, 20, 800);
		service.add(vo);
		assertEquals(vo, service.findByHotelAndType(6, RoomType.Business));
	}

	@Test
	public void testFindByHotelAndType() {
		RoomVO vo = service.findByHotelAndType(1, RoomType.Single);
		assertEquals(8, vo.roomNum);
	}

	@Test
	public void testFindNotAddedRoomType() {
		List<RoomType> types = service.findNotAddedRoomType(1);
		for (RoomType type : types) {
			System.out.println(type);
		}
		assertFalse(types.contains(RoomType.Single));
	}

	@Test
	public void testFindAvailableByHotelID() throws ParseException {
		Date begin = DateFormatter.parseWithHMS("2016-10-05 12:00:00");
		Date end = DateFormatter.parseWithHMS("2016-10-28 00:00:00");
		List<RoomVO> list = service.findAvailableByHotelID(1, begin, end);
		for (RoomVO vo : list) {
			System.out.println(vo);
		}
		assertNotNull(list);
	}

	@Test
	public void testFindAvailableRoomNum() throws ParseException {
		Date begin = DateFormatter.parseWithHMS("2016-10-05 12:00:00");
		Date end = DateFormatter.parseWithHMS("2016-10-28 00:00:00");
		assertEquals(service.findAvailableRoomNum(1, RoomType.Single, begin, end), 5);
	}

	@Test
	public void testFindByHotelID() {
		List<RoomVO> list = service.findByHotelID(4);
		for (RoomVO vo : list) {
			System.out.println(vo);
			assertEquals(vo.hotel.id, 4);
		}
	}

}
