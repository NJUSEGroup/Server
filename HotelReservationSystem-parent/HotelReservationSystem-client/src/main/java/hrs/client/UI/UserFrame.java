package hrs.client.UI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hrs.client.Controller.UserController;

public class UserFrame {
	@Autowired
	private UserController controller;
	
	public static void main(String[] args) {
		UserFrame frame = new UserFrame();
//		frame.controller.login("admin", "admin");
	}
}
