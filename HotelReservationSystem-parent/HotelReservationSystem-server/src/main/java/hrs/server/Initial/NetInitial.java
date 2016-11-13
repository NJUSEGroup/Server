package hrs.server.Initial;

import hrs.common.Controller.LoginController.ILoginController;
import hrs.server.Service.Interface.StaffService.StaffService;
import hrs.server.Service.Interface.UserService.UserService;
import hrs.server.util.SpringUtils;
/**
 * 负责初始化Controller
 * @author NewSong
 *
 */
@SuppressWarnings("all")
public class NetInitial {
	private static ILoginController controller;
	public static void init(){
		controller = SpringUtils.getBean("loginController");
	}

}
