package hrs.client.UI.UserUI.CommonComp;

import java.awt.Font;

import javax.swing.JLabel;

import hrs.common.util.constants;

public class CommonLabel extends JLabel {
	Font font = constants.jlabelChinese;
	public CommonLabel(){
		
		//设置字体
		setFont(font);
		
		//文字居中
		setHorizontalAlignment(JLabel.CENTER);
		
	}
}
