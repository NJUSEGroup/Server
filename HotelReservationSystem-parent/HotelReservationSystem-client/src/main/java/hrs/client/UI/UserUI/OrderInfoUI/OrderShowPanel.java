package hrs.client.UI.UserUI.OrderInfoUI;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import hrs.client.UI.UserUI.CommonComponents.CommonLabel;
import hrs.client.UI.UserUI.CommonComponents.CommonPanel;
import hrs.client.UI.UserUI.OrderInfoUI.Listener.statusBoxListener;
import hrs.client.util.ControllerFactory;
import hrs.client.util.UIConstants;
import hrs.common.Controller.UserController.IUserOrderController;
import hrs.common.Exception.OrderService.OrderNotFoundException;
import hrs.common.VO.OrderVO;
import hrs.common.VO.UserVO;
import hrs.common.util.type.OrderStatus;

public class OrderShowPanel extends CommonPanel {
	/**
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = -1738046961448085289L;

	private UserVO userVO;
	
	private IUserOrderController controller = ControllerFactory.getUserOrderController();
	JComboBox<String> statusBox;
	private OrderTable table;
	
	Font font = UIConstants.jlabelChinese;
	private JScrollPane scrollPane;
	
	private static int GAP_WIDTH = 30;
	public OrderShowPanel(UserVO userVO) {
		this.userVO = userVO;
		
		//选框设置
		setCombox();
		
		Init();
	}
	
	@Override
	public void Init() {
		
		
		//标签设置
		setLabel();
		
		//设置表格
		SetTable();
		// TODO Auto-generated method stub

	}

	private void SetTable() {
		table = new OrderTable(getOrderList(OrderStatus.Unexecuted));
		
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		scrollPane.setBounds(30, 80, 1043,600);
		scrollPane.setBorder(new EmptyBorder(0,0,0,0));
		scrollPane.getViewport().setBackground(new Color(211, 237, 249));
		scrollPane.setOpaque(true);
		
		add(scrollPane);
		
	}

	private void setCombox() {
		statusBox = new JComboBox<>();
		statusBox.setBounds(GAP_WIDTH*2 + 126,10,168,40);
		statusBox.setFont(font);
		statusBox.addItem("未执行");
		statusBox.addItem("已执行");
		statusBox.addItem("异常");
		statusBox.addItem("已撤销");
		statusBox.setSelectedItem("未执行");
		
		
		statusBox.addItemListener(new statusBoxListener(statusBox, this));
		
		add(statusBox);
	}

	private void setLabel() {
		// TODO Auto-generated method stub
		JLabel label = new CommonLabel();
		label.setText("选择订单类型");
		label.setBounds(GAP_WIDTH, 0, 126, 60);
//		label.setOpaque(true);
		this.add(label);
	}

	//得到表需要显示的订单
	private List<OrderVO> getOrderList(OrderStatus status){
		try {
			return controller.findOrdersByUsernameAndStatus(userVO.username, status);
		} catch (OrderNotFoundException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	public void setStatus(OrderStatus status) {
		
		table.setModel(getOrderList(status));;
			
	}
	
}
