package hrs.StubAndDriver.DAO.HotelDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import hrs.common.DAO.HotelDAO.HotelDAO;
import hrs.common.util.ResultMessage;
import hrs.server.POJO.HotelPO;

public class HotelDAOStub implements HotelDAO {
	private Map<Integer,HotelPO> map;
	public HotelDAOStub() {
		map = new HashMap<>();
		map.put(0, new HotelPO(0,"嘻嘻",0,0,"",""));
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
			if(po.getLoc() == loc && po.getCommCircle() == circle ){
				list.add(po);
			}
		}
		return list;
	}
}
