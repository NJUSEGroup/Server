package hrs.client.UI.UserUI.CommonComponents;

import java.awt.Font;

import javax.swing.JLabel;

import hrs.client.util.UIConstants;

public class CommonLabel extends JLabel {
	Font font = UIConstants.jlabelChinese;
	public CommonLabel(){
		
		//设置字体
		setFont(font);
		
		//文字居中
		setHorizontalAlignment(JLabel.CENTER);
		
	}
}
