package hrs.StubAndDriver.DAO.StaffDAO;

import java.util.HashMap;
import java.util.Map;

import hrs.common.DAO.StaffDAO;
import hrs.common.PO.StaffPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.StaffType;

public class StaffDAOStub implements StaffDAO {
	private Map<String,StaffPO> map;
	
	public StaffDAOStub(){
		map = new HashMap<>();
		map.put("staff",new StaffPO("staff", "110", "staff", StaffType.WebsiteMarketer, null));
	}
	@Override
	public ResultMessage update(StaffPO staffpo) {
		map.put(staffpo.getUsername(), staffpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(StaffPO staffpo) {
		if(findByUsername(staffpo.getUsername()) == null){
			map.put(staffpo.getUsername(), staffpo);
				return ResultMessage.SUCCESS;
		}else{
			return ResultMessage.EXISTED;
		}
	}

	@Override
	public StaffPO findByUsername(String username) {
		return map.get(username);
	}

}
