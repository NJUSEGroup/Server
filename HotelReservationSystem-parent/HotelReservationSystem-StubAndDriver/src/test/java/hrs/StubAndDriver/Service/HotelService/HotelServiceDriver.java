package hrs.StubAndDriver.Service.HotelService;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.HotelService.HotelService;
import hrs.client.VO.HotelVO;
import hrs.client.VO.OrderVO;

public class HotelServiceDriver {
	private HotelService service;
	private Date defaultDate;
	@Before
	public void launch(){
		service = new HotelServiceStub();
		Calendar c = Calendar.getInstance();
		c.set(2016,10,14,8,0);
		
	}
	@Test
	public void testFindByID(){
		HotelVO vo = service.findByID(0);
		assertEquals(vo,new HotelVO(0,"嘻嘻",0,0));
	}
	@Test
	public void testUpdate(){
		HotelVO vo = service.findByID(0);
		vo.name = "呼呼呼";
		assertEquals(vo, service.findByID(0));
	}
	@Test
	public void testAdd(){
		HotelVO vo = new HotelVO(1,"啦啦啦",1,1);
		service.add(vo);
		assertEquals(vo, service.findByID(1));
	}
	
	@Test
	public void testFindOrderedHotelAndOrder(){
		Map<HotelVO,List<OrderVO>> map = service.findOrderedHotelAndOrder("admin");
		for(HotelVO hotel:map.keySet()){
			for(OrderVO order:map.get(hotel)){
				assertEquals(order.username,"admin");
			}
		}
	}
}
