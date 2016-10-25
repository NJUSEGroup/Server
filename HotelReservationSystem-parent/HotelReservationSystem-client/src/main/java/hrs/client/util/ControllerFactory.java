package hrs.client.util;

import hrs.common.Controller.LoginController.ILoginController;
import hrs.common.Controller.UserController.IUserController;
/**
 * 工厂模式，单例模式
 * @author songx
 *
 */
public class ControllerFactory {
	private static ILoginController loginController;
	private static IUserController userController;
	
	public static ILoginController getLoginController(){
		if(loginController == null){
			loginController = SpringUtils.getBean("loginController");
		}
		return loginController;
	}
	
}
