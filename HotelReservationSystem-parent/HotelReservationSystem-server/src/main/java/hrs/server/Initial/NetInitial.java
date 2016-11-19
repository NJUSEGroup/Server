package hrs.server.Initial;

import javax.swing.Spring;

import hrs.common.Controller.HotelController.IHotelController;
import hrs.common.Controller.HotelController.IHotelDiscountController;
import hrs.common.Controller.HotelController.IHotelOrderController;
import hrs.common.Controller.LoginController.ILoginController;
import hrs.common.Controller.UserController.IUserController;
import hrs.common.Controller.UserController.IUserHotelController;
import hrs.common.Controller.UserController.IUserOrderController;
import hrs.server.util.SpringUtils;
/**
 * 负责初始化Controller
 * @author NewSong
 *
 */
@SuppressWarnings("all")
public class NetInitial {
	private static ILoginController loginController;
	private static IUserController userController;
	private static IUserHotelController userHotelController;
	private static IUserOrderController userOrderController;
	private static IHotelController hotelController;
	private static IHotelDiscountController hotelDiscountController;
	private static IHotelOrderController hotelOrderController;
	
	
	public static void init(){
		loginController = SpringUtils.getBean("loginController");
		userController = SpringUtils.getBean("userController");
		userOrderController = SpringUtils.getBean("userOrderController");
		hotelController = SpringUtils.getBean("hotelController");
		hotelOrderController = SpringUtils.getBean("hotelOrderController");
		
	}

}
