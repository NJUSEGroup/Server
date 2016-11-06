package hrs.Mock.HotelService;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.HotelVO;
import hrs.common.VO.OrderVO;
import hrs.server.Service.Interface.HotelService.HotelService;

public class HotelServiceTester {
	private HotelService service;
	@Before
	public void launch(){
		service = new HotelServiceMock();
	}
	
	@Test
	public void testFindByID(){
		HotelVO vo = service.findByID(0);
		assertEquals(vo,new HotelVO(0,"嘻嘻",0,0,"",""));
	}
	
	@Test
	public void testUpdate(){
		HotelVO vo = service.findByID(0);
		vo.name = "呼呼呼";
		service.update(vo);
		assertEquals(vo, service.findByID(0));
	}
	@Test
	public void testAdd(){
		HotelVO vo = new HotelVO(3,"啦啦啦",1,1,"","");
		service.add(vo);
		assertEquals(vo, service.findByID(3));
	}
	
	@Test
	public void testFindOrderedHotelAndOrder(){
		Map<HotelVO,List<OrderVO>> map = service.findOrderedHotelAndOrder("admin");
		for(HotelVO hotel:map.keySet()){
			for(OrderVO order:map.get(hotel)){
				assertEquals(order.user.username,"admin");
			}
		}
	}
}
