package hrs.common.Service.StaffService;

import hrs.common.VO.StaffVO;
import hrs.common.util.ResultMessage;

public interface StaffService {
	StaffVO login(String username, String password);
	ResultMessage update(StaffVO staffvo);
	ResultMessage add(StaffVO staffvo);
}
