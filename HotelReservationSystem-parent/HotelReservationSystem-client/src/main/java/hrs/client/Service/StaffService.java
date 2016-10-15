package hrs.client.Service;

import hrs.client.VO.StaffVO;
import hrs.common.util.ResultMessage;

public interface StaffService {
	StaffVO login(String username, String password);
	ResultMessage update(StaffVO staffvo);
	ResultMessage add(StaffVO staffvo);
}
