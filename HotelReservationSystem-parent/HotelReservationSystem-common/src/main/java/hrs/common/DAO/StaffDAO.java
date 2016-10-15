package hrs.common.DAO;

import hrs.common.PO.StaffPO;
import hrs.common.util.ResultMessage;

public interface StaffDAO {
	 ResultMessage update(StaffPO staffpo);
	 ResultMessage add(StaffPO staffpo);
	 StaffPO findByUsername(String username);
}
