package hrs.StubAndDriver.DAO.StaffDAO;

import java.util.HashMap;
import java.util.Map;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.StaffType;
import hrs.server.DAO.Interface.StaffDAO;
import hrs.server.POJO.StaffPO;

public class StaffDAOStub implements StaffDAO {
	private Map<Integer,StaffPO> map;
	
	public StaffDAOStub(){
		map = new HashMap<>();
		map.put(0,new StaffPO(0,"staff", "110", "staff", StaffType.WebsiteMarketer, null));
	}
	@Override
	public ResultMessage update(StaffPO staffpo) {
		map.put(staffpo.getId(), staffpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(StaffPO staffpo) {
		if(findByUsername(staffpo.getUsername()) == null){
			map.put(staffpo.getId(), staffpo);
				return ResultMessage.SUCCESS;
		}else{
			return ResultMessage.EXISTED;
		}
	}

	@Override
	public StaffPO findByUsername(String username) {
		return map.get(username);
	}
	@Override
	public StaffPO findByHotelName(String hotelName) {
		for(Integer i:map.keySet()){
			StaffPO po = map.get(i);
			if(po.getHotel().getName().equals(hotelName)){
				return po;
			}
		}
		return null;
	}
	
}
