package hrs.server.Initial;

import hrs.server.Service.Interface.StaffService.StaffService;
import hrs.server.Service.Interface.UserService.UserService;
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
