package hrs.client.UI.UserUI;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Controller;

import hrs.client.util.ControllerFactory;
import hrs.common.Controller.UserController.IUserController;
import hrs.common.Exception.CreditRecordService.CreditRecordNotFoundException;
import hrs.common.VO.CreditRecordVO;

public class mainclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IUserController controller = ControllerFactory.getUserController();
		List<CreditRecordVO> list = new ArrayList<>();
		try {
			controller.findCreditRecordByUsername("admin");
		} catch (CreditRecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
