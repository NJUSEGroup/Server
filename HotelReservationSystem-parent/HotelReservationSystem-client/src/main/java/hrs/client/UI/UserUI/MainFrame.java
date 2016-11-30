package hrs.client.UI.UserUI;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hrs.client.util.ControllerFactory;
import hrs.common.Controller.UserController.IUserController;
import hrs.common.Exception.UserService.UserNotFoundException;
import hrs.common.VO.UserVO;
import hrs.client.UI.UserUI.CreditInfoUI.creditInfoPanel;
import hrs.client.UI.UserUI.OrderInfoUI.OrderInfoPanel;
import hrs.client.UI.UserUI.OrderInfoUI.OrderShowPanel;
import hrs.client.UI.UserUI.UserInfoUI.UserInfoPanel;

public class MainFrame extends JFrame{
	Color frameColor = new Color(211, 237, 249);
	private int height, width;
	JPanel leftPanel = new LeftPanel();
	
	JPanel userInfoPanel ;
	JPanel creditInfoPanel;
	JPanel orderInfoPanel;
	
	JPanel cardPanel = new JPanel();
	
	private UserVO userVO;
	private String username;
	
	public MainFrame(UserVO userVO){
		this.username = userVO.username;
		userInfoPanel = new UserInfoPanel(username);
		creditInfoPanel = new creditInfoPanel(username);
		orderInfoPanel = new OrderInfoPanel(userVO);
		//初始化操作
		Init();
		
		
		
		CardLayout card=new CardLayout();
		cardPanel.setLayout(card);
		cardPanel.setBounds(263,0,1103,768);
		cardPanel.add("userInfoPanel",userInfoPanel);
		cardPanel.add("creditInfoPanel",creditInfoPanel);
		cardPanel.add("orderInfoPanel",orderInfoPanel);
		card.show(cardPanel, "userInfoPanel");
	
		
		MyLabelListenerFactory.getListener().setCard(card,cardPanel);
		
		//设置左侧面板
		this.add(leftPanel);
		

		this.add(cardPanel);
//		this.add(userInfoPanel);
		
	}
	
	public static void main(String[] args){
		IUserController controller = ControllerFactory.getUserController();
		UserVO vo;
		try {
			vo = controller.findUserByUsername("admin");
			new MainFrame(vo);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
