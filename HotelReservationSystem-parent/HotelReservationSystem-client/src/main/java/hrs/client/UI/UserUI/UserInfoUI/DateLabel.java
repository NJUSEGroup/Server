package hrs.client.UI.UserUI.UserInfoUI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

import hrs.common.util.constants;

public class DateLabel extends JLabel {
	Font font = constants.jzoneChinese;
	public DateLabel(String s){
		setFont(font);
	
		//设置显示的文字及居中
		setHorizontalAlignment(JLabel.CENTER);
		this.setText(s);
		
		
	}
}
