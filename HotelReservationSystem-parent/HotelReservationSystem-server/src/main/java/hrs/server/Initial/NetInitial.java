package hrs.server.Initial;

import hrs.common.Service.StaffService.StaffService;
import hrs.common.Service.UserService.UserService;
import hrs.server.util.SpringUtils;

@SuppressWarnings("all")
public class NetInitial {
	private static UserService userService;
	private static StaffService staffService;

	public static void init(){
		userService = SpringUtils.getBean("userService");
		staffService = SpringUtils.getBean("staffService");
	}

}
