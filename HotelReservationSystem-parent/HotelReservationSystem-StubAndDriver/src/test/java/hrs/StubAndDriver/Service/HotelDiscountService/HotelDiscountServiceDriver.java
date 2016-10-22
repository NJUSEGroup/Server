package hrs.StubAndDriver.Service.HotelDiscountService;

import static org.junit.Assert.*;

import java.security.Provider.Service;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.PromotionService.HotelDiscountService;
import hrs.client.VO.HotelDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;
import hrs.server.POJO.HotelDiscountPO;

public class HotelDiscountServiceDriver {
	private HotelDiscountService hotelDiscountService;
	
	@Before
	public void launch(){
		hotelDiscountService=new HotelDiscountServiceStub();
	}
	
	@Test
	public void testAdd(){
		assertTrue(hotelDiscountService.add(new HotelDiscountVO(0, 0, 0.95, HotelDiscountType.Birthday,0, 0, null, null))==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testUpdate(){
		assertTrue(hotelDiscountService.update(new HotelDiscountVO(0, 0, 0.9, HotelDiscountType.Birthday,0, 0, null, null))==ResultMessage.SUCCESS);
		
	}

	@Test
	public void testDelete(){
		assertTrue(hotelDiscountService.delete(0)==ResultMessage.SUCCESS);
	}
	
	@Test
	public void testFindAllByHotelID(){
		List<HotelDiscountVO> list=hotelDiscountService.findAllByHotelID(0);
		for(HotelDiscountVO vo:list){
			assertEquals(vo.hotelId,0);
		}
		
		
	}
}
