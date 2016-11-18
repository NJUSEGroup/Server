package hrs.StubAndDriver.DAO.HotelDAO.CommCircleDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hrs.server.DAO.Interface.HotelDAO.CommCircleDAO;
import hrs.server.POJO.CommercialCirclePO;
import hrs.server.POJO.LocationPO;

public class CommCircleDAOStub implements CommCircleDAO{
	private Map<Integer,CommercialCirclePO> map;
	public CommCircleDAOStub() {
		map = new HashMap<>();
		LocationPO loc = new LocationPO();
		loc.setId(0);
		map.put(0, new CommercialCirclePO(0,loc,"仙林"));
	}
	@Override
	public List<CommercialCirclePO> findByLoc(int locID) {
		List<CommercialCirclePO> list = new ArrayList<>();
		for(Integer i:map.keySet()){
			CommercialCirclePO po = map.get(i);
			if(po.getLocation().getId() == locID){
				list.add(po);
			}
		}
		return list;
	}

}
