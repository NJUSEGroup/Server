package hrs.client.UI.UserUI.userInfoUI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class userInfoLabel extends JLabel {
	public userInfoLabel(String s){
		setFont(new Font("微软雅黑",Font.PLAIN,24));
		
		//标签固定大小
		setPreferredSize(new Dimension(100,60));
		
		
		//设置显示的文字及居中
		setHorizontalAlignment(JLabel.CENTER);
		this.setText(s);
		
		
	}
}
