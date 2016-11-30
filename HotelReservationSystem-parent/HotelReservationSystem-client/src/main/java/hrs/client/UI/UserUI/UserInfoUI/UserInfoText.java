package hrs.client.UI.UserUI.UserInfoUI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import hrs.common.util.constants;

public class UserInfoText extends JTextField {
	Font font = constants.jlabelChinese;
	public UserInfoText(){
		setFont(font);
		setPreferredSize(new Dimension(180,40));
	}
}
