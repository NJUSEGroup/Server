package hrs.StubAndDriver.DAO.HotelDAO.LocationDAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hrs.server.DAO.Interface.HotelDAO.LocationDAO;
import hrs.server.POJO.LocationPO;

public class LocationDAOStub implements LocationDAO{
	private Map<Integer,LocationPO> map;
	public LocationDAOStub() {
		map = new HashMap<>();
		map.put(0, new LocationPO(0,"南京"));
	}
	
	@Override
	public List<LocationPO> findAll() {
		Collection<LocationPO> c = map.values();
		List<LocationPO> list = new ArrayList<>(c);
		return list;
	}
	
}
