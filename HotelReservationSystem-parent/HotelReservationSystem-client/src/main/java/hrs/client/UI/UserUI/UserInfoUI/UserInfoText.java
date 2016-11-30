package hrs.client.UI.UserUI.UserInfoUI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import hrs.client.util.UIConstants;

public class UserInfoText extends JTextField {
	Font font = UIConstants.jlabelChinese;
	public UserInfoText(){
		setFont(font);
		setPreferredSize(new Dimension(180,40));
	}
}
