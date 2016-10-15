package hrs.StubAndDriver.DAO.HotelDiscountDAO;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import hrs.common.DAO.HotelDiscountDAO.EnterpriseDAO;
import hrs.common.PO.EnterprisePO;

public class EnterpriseDAOStub implements EnterpriseDAO {
	private Map<Integer, EnterprisePO> map;
	public EnterpriseDAOStub(){
		map=new HashMap<>();
		map.put(0, new EnterprisePO(0, "21"));
	}

	@Override
	public List<EnterprisePO> findAll() {
		List<EnterprisePO> list = new ArrayList<>();
		EnterprisePO po = null;
		Set<Integer> set = map.keySet();
		for(Integer i:set){
			po=map.get(i);
			list.add(po);
			}
		return list;
	}

}
