package hrs.StubAndDriver.DAO.HotelDAO.CommCircleDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hrs.common.DAO.HotelDAO.CommCircleDAO;
import hrs.server.POJO.CommercialCirclePO;

public class CommCircleDAOStub implements CommCircleDAO{
	private Map<Integer,CommercialCirclePO> map;
	public CommCircleDAOStub() {
		map = new HashMap<>();
		map.put(0, new CommercialCirclePO(0,0,"仙林"));
	}
	@Override
	public List<CommercialCirclePO> findByLoc(int locID) {
		List<CommercialCirclePO> list = new ArrayList<>();
		for(Integer i:map.keySet()){
			CommercialCirclePO po = map.get(i);
			if(po.getLocId() == locID){
				list.add(po);
			}
		}
		return list;
	}

}
