package hrs.StubAndDriver.DAO.HotelDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import hrs.common.POJO.CommercialCirclePO;
import hrs.common.POJO.HotelPO;
import hrs.common.POJO.LocationPO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.HotelDAO.HotelDAO;

public class HotelDAOStub implements HotelDAO {
	private Map<Integer,HotelPO> map;
	public HotelDAOStub() {
		map = new HashMap<>();
		LocationPO loc = new LocationPO();
		loc.setId(0);
		CommercialCirclePO circle = new CommercialCirclePO();
		circle.setId(0);
		map.put(0, new HotelPO(0,"嘻嘻",loc,circle,"",""));
	}
	@Override
	public HotelPO findByID(int hotelID) {
		return map.get(hotelID);
	}

	@Override
	public ResultMessage update(HotelPO hotelpo) {
		map.put(hotelpo.getId(), hotelpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(HotelPO hotelpo) {
		map.put(hotelpo.getId(), hotelpo);
		return ResultMessage.SUCCESS;
	}
	
	@Override
	public List<HotelPO> find(int loc, int circle) {
		List<HotelPO> list = new ArrayList<>(); 
		Set<Integer> iSet = map.keySet();
		for(Integer i: iSet){
			HotelPO po = map.get(i);
			if(po.getLocation().getId() == loc && po.getCommercialCircle().getId() == circle ){
				list.add(po);
			}
		}
		return list;
	}
}
