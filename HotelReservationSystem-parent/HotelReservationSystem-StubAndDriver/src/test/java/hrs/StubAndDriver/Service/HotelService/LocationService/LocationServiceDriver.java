package hrs.StubAndDriver.Service.HotelService.LocationService;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.HotelService.LocationService;
import hrs.client.VO.LocationVO;

public class LocationServiceDriver {
	private LocationService service;
	@Before
	public void launch(){
		service = new LocationServiceStub();
	}
	@Test
	public void testFindAll(){
		List<LocationVO> list = service.findAll();
		assertNotNull(list);
	}
}
