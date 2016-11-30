package hrs.client.UI.UserUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import hrs.common.util.constants;

public class MyLabel extends JLabel {
	Color color = constants.jlabel;
	private MyLabelListener listener = MyLabelListenerFactory.getListener();
	
	public MyLabel(String s){
		this.setFont(new Font("微软雅黑",Font.PLAIN,24));
		
		//标签固定大小
		setPreferredSize(new Dimension(260,70)); 
		
		this.setText(s);
		this.setOpaque(true);
		
		//初始背景色
		this.setBackground(color);
		//初始字体色
		this.setForeground(Color.white);
		//设置文字居中
		setHorizontalAlignment(JLabel.CENTER);
		
		this.addMouseListener(listener);
	}
	
	
}
