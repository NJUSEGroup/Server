package hrs.client.UI.UserUI;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Controller;

import hrs.client.util.ControllerFactory;
import hrs.common.Controller.UserController.IUserController;
import hrs.common.Exception.CreditRecordService.CreditRecordNotFoundException;
import hrs.common.Exception.UserService.UserNotFoundException;
import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.UserVO;

public class MainClass {
	
	public static void main(String[] args) throws CreditRecordNotFoundException {
		// TODO Auto-generated method stub
		IUserController controller = ControllerFactory.getUserController();
		List<CreditRecordVO> list = new ArrayList<>();
		try {
			UserVO vo = controller.findUserByUsername("admin");
			System.out.println(vo.name);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
