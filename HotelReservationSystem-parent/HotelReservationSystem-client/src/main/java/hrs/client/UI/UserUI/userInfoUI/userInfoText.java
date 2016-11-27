package hrs.client.UI.UserUI.userInfoUI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

public class userInfoText extends JTextField {
	public userInfoText(){
		setFont(new Font("微软雅黑",Font.PLAIN,24));
		setPreferredSize(new Dimension(180,40));
	}
}
