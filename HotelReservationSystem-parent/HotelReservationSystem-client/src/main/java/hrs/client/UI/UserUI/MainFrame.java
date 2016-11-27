package hrs.client.UI.UserUI;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hrs.client.UI.UserUI.creditInfoUI.creditInfoPanel;
import hrs.client.UI.UserUI.userInfoUI.userInfoPanel;

public class MainFrame extends JFrame{
	Color frameColor = new Color(211, 237, 249);
	private int height, width;
	JPanel leftPanel = new leftPanel();
	
	JPanel userInfoPanel ;
	JPanel creditInfoPanel;
	
	JPanel cardPanel = new JPanel();
	
	private String username;
	
	public MainFrame(String username){
		this.username = username;
		userInfoPanel = new userInfoPanel(username);
		creditInfoPanel = new creditInfoPanel(username);
		//初始化操作
		Init();
		
		
		
		CardLayout card=new CardLayout();
		cardPanel.setLayout(card);
		cardPanel.setBounds(323,60,1043,688);
		cardPanel.add("userInfoPanel",userInfoPanel);
		cardPanel.add("creditInfoPanel",creditInfoPanel);
		card.show(cardPanel, "userInfoPanel");
	
		
		MyLabelListenerFactory.getListener().setCard(card,cardPanel);
		
		//设置左侧面板
		this.add(leftPanel);
		

		this.add(cardPanel);
//		this.add(userInfoPanel);
		
	}
	
	public static void main(String[] args){
		new MainFrame("admin");
	}
	private void Init() {
		height = 768;
		width = 1366;
		this.setSize(width,height);
		this.setLocationRelativeTo(null);
		this.setTitle("酒店预订系统");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//设置背景色
		this.getContentPane().setBackground(frameColor);
		//空布局
		this.setLayout(null);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
}
