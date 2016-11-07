package hrs.Mock.HotelDiscountService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.HotelDiscountVO;
import hrs.common.VO.HotelVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;

public class HotelDiscountServiceTester {
	private HotelDiscountService hotelDiscountService;

	@Before
	public void launch() {
		hotelDiscountService = new HotelDiscountServiceMock();
	}

	@Test
	public void testAdd() {
		HotelVO vo = new HotelVO();
		vo.id = 0;
		assertTrue(hotelDiscountService.add(new HotelDiscountVO(0, vo, 0.95, HotelDiscountType.Birthday, null, 0, null,
				null)) == ResultMessage.SUCCESS);
	}

	@Test
	public void testUpdate() {
		HotelVO vo = new HotelVO();
		vo.id = 0;
		assertTrue(hotelDiscountService.add(new HotelDiscountVO(0, vo, 0.9, HotelDiscountType.Birthday, null, 0, null,
				null)) == ResultMessage.SUCCESS);

	}

	@Test
	public void testDelete() {
		assertTrue(hotelDiscountService.delete(0) == ResultMessage.SUCCESS);
	}

	@Test
	public void testFindAllByHotelID() {
		List<HotelDiscountVO> list = hotelDiscountService.findAllByHotelID(0);
		for (HotelDiscountVO vo : list) {
			assertEquals(vo.hotel.id, 0);
		}

	}
}
