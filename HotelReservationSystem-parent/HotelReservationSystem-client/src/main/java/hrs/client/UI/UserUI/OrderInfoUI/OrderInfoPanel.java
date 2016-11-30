package hrs.client.UI.UserUI.OrderInfoUI;

import java.awt.CardLayout;

import javax.swing.JPanel;

import hrs.client.UI.UserUI.CommonComponents.CommonPanel;
import hrs.common.VO.UserVO;

public class OrderInfoPanel extends CommonPanel {
	private JPanel cardPanel = new JPanel();
	CardLayout card = new CardLayout();
	private JPanel detailedOrderPanel;//订单详细信息面板
	private JPanel orderShowPanel;//订单列表的面板
	private UserVO userVO;
	public OrderInfoPanel(UserVO userVO){
		
		this.userVO = userVO;
		Init();
		
	}
	@Override
	public void Init() {
		
		//面板初始化
		setPanel();
		
		//卡片布局初始化
		setCard();
		
		
	}
	private void setPanel() {
		detailedOrderPanel = new DetailedOrderPanel();
		orderShowPanel = new OrderShowPanel(userVO);
	}
	
	private void setCard() {
		cardPanel.setLayout(card);
		cardPanel.setBounds(0,0,1043,768);
		cardPanel.add("detailedOrderPanel",detailedOrderPanel);
		cardPanel.add("orderShowPanel",orderShowPanel);
		card.show(cardPanel, "orderShowPanel");
		
		add(cardPanel);
	}

}
