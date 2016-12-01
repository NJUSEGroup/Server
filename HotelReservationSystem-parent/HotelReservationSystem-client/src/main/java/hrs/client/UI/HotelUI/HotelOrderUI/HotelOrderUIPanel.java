package hrs.client.UI.HotelUI.HotelOrderUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;
import javax.swing.table.JTableHeader;

import hrs.client.UI.HotelUI.Components.OrderListTableModel;
import hrs.client.UI.HotelUI.HotelOrderUI.Listener.SearchByIdOrUsernameListener;
import hrs.client.UI.HotelUI.HotelOrderUI.Listener.SearchByOrderTypeListener;
import hrs.client.util.ControllerFactory;
import hrs.common.Controller.HotelController.IHotelOrderController;
import hrs.common.Exception.OrderService.OrderNotFoundException;
import hrs.common.VO.HotelVO;
import hrs.common.VO.OrderVO;
import hrs.common.util.type.OrderStatus;

public class HotelOrderUIPanel extends JPanel {

	private JPanel jpSearch;
	private JPanel jpOrder;
	private JPanel jpButton;
	private JLabel jlOrderType;
	private JLabel jlSearch;
	private JComboBox jcbOrderType;
	private JComboBox jcbSearch;
	private JTextField jtfSearch;
	private JButton jbConfirm1;
	private JButton jbConfirm2;
	private JButton jbDetail;
	private JButton jbCheckin;
	private JButton jbCheckout;
	private JButton jbDelay;
	private JTable jtOrderList;
	private JTableHeader jthOrderList;
	private OrderListTableModel orderListTableModel;
	private IHotelOrderController hotelOrderController;
	private SearchByOrderTypeListener searchListener1;
	private SearchByIdOrUsernameListener searchListener2;
	private HotelVO hotel;
	
	/**
	 * Create the panel.
	 */
	public HotelOrderUIPanel() {
		
	}
	
	public HotelOrderUIPanel(HotelVO hotel) {
		init(hotel);
	}
	
	public void init(HotelVO hotel){
		this.setSize(1080, 722);
		this.setLayout(null);
		
		this.hotel = hotel;
		
		hotelOrderController = ControllerFactory.getHotelOrderController();
		
		searchListener1 = new SearchByOrderTypeListener(this);
		searchListener2 = new SearchByIdOrUsernameListener(this);
		
		jpSearch = new JPanel();
		jpSearch.setBounds(0, 0, 1080, 170);
		jpSearch.setBackground(new Color(211, 237, 249));
		jpSearch.setLayout(null);
		
		jpOrder = new JPanel();
		jpOrder.setBounds(0, 170, 1080, 472);
		jpOrder.setBackground(new Color(211, 237, 249));
		jpOrder.setLayout(null);
		
		jpButton = new JPanel();
		jpButton.setBounds(0, 642, 1080, 80);
		jpButton.setBackground(new Color(211, 237, 249));
		jpButton.setLayout(null);
		
		jlOrderType = new JLabel();
		jlOrderType.setBounds(20, 20, 90, 30);
		jlOrderType.setText("订单类型");
		jlOrderType.setHorizontalAlignment(SwingConstants.CENTER);
		jlOrderType.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jlSearch = new JLabel();
		jlSearch.setBounds(20, 100, 90, 30);
		jlSearch.setText("搜索");
		jlSearch.setHorizontalAlignment(SwingConstants.CENTER);
		jlSearch.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jcbOrderType = new JComboBox(new DefaultComboBoxModel(new String[] {"未执行", "已执行", "异常和已撤销"}));
		jcbOrderType.setBounds(130, 20, 230, 30);
		jcbOrderType.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbOrderType.setOpaque(true);
		jcbOrderType.setBackground(Color.WHITE);
		jcbOrderType.setEditable(false);
		
		jcbSearch = new JComboBox(new DefaultComboBoxModel(new String[] {"用户名", "订单号"}));
		jcbSearch.setBounds(130, 100, 230, 30);
		jcbSearch.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbSearch.setOpaque(true);
		jcbSearch.setBackground(Color.WHITE);
		jcbSearch.setEditable(false);
		
		jtfSearch = new JTextField();
		jtfSearch.setBounds(400, 100, 230, 30);
		jcbSearch.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbSearch.setEditable(true);
		
		jbConfirm1 = new JButton();
		jbConfirm1.setBounds(681, 15, 90, 40);
		jbConfirm1.setText("确认");
		jbConfirm1.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jbConfirm1.addMouseListener(searchListener1);
		
		jbConfirm2 = new JButton();
		jbConfirm2.setBounds(681, 95, 90, 40);
		jbConfirm2.setText("确认");
		jbConfirm2.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jbConfirm2.addMouseListener(searchListener2);
		
		jbDetail = new JButton();
		jbDetail.setBounds(410, 13, 110, 40);
		jbDetail.setText("查看详细");
		jbDetail.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jbCheckin = new JButton();
		jbCheckin.setBounds(550, 13, 110, 40);
		jbCheckin.setText("入住");
		jbCheckin.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jbCheckout = new JButton();
		jbCheckout.setBounds(690, 13, 110, 40);
		jbCheckout.setText("退房");
		jbCheckout.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jbDelay = new JButton();
		jbDelay.setBounds(830, 13, 110, 40);
		jbDelay.setText("延迟入住");
		jbDelay.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jtOrderList = new JTable();
		jtOrderList.setBackground(new Color(211, 237, 249));
		jtOrderList.setFont(new Font("方正兰亭超细黑简体",Font.PLAIN,16));
		jtOrderList.setRowHeight(40);
		jtOrderList.setShowVerticalLines(false);
		
		jthOrderList = jtOrderList.getTableHeader(); 
		jthOrderList.setPreferredSize(new Dimension(jtOrderList.getWidth(),40)); 
		jthOrderList.setBackground(new Color(222, 237, 249));
		jthOrderList.setEnabled(false);
		jthOrderList.setBorder(new EmptyBorder(0,0,0,0));
		jthOrderList.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 16));
		
		jpSearch.add(jlOrderType);
		jpSearch.add(jlSearch);
		jpSearch.add(jcbOrderType);
		jpSearch.add(jcbSearch);
		jpSearch.add(jtfSearch);
		jpSearch.add(jbConfirm1);
		jpSearch.add(jbConfirm2);
		
		jpOrder.add(jtOrderList);
		
		jpButton.add(jbDetail);
		jpButton.add(jbCheckin);
		jpButton.add(jbCheckout);
		jpButton.add(jbDelay);
		
		this.add(jpSearch);
		this.add(jpOrder);
		this.add(jpButton);
	}
	
	public void show(){
		//表格
	}
	
	public void searchByOrderType() throws OrderNotFoundException{
		String type = (String) jcbOrderType.getSelectedItem();
		List<OrderVO> orderList = null;
		
		if(type.equals("未执行")){
			try {
				orderList = hotelOrderController.findOrderByHotelAndStatus(hotel.id, OrderStatus.Unexecuted);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(type.equals("已执行")){
			try {
				orderList = hotelOrderController.findOrderByHotelAndStatus(hotel.id, OrderStatus.Executed);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(type.equals("异常和已撤销")){
			try {
				orderList = hotelOrderController.findOrderByHotelAndStatus(hotel.id, OrderStatus.Abnormal);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		orderListTableModel = new OrderListTableModel(orderList);
		jtOrderList.setModel(orderListTableModel);
		
	}
	
	public void searchByIdOrUsername() throws OrderNotFoundException{
		String search = (String) jcbSearch.getSelectedItem();
		List<OrderVO> orderList = null;
		OrderVO order;
		
		if(search.equals("用户名")){
			orderList = hotelOrderController.findOrderByHotelAndUsername(hotel.id, jtfSearch.getText());
			orderListTableModel = new OrderListTableModel(orderList);
		}
		else if(search.equals("订单号")){
			String id = jtfSearch.getText();
			orderList = new ArrayList<>();
			order = hotelOrderController.findOrderByID(Integer.parseInt(id));
			orderList.add(order);
		}
		
		orderListTableModel = new OrderListTableModel(orderList);
		jtOrderList.setModel(orderListTableModel);
	}
}
