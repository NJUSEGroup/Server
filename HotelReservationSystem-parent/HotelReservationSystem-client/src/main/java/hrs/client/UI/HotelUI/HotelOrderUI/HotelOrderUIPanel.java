package hrs.client.UI.HotelUI.HotelOrderUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HotelOrderUIPanel extends JPanel {

	private JPanel jpSearch;
	private JPanel jpOrder;
	private JPanel jpButton;
	private JLabel jlOrderType;
	private JLabel jlSearch;
	private JComboBox jcbOrderType;
	private JComboBox jcbSearch;
	private JTextField jtfSearch;
	private JButton jbConfirm;
	private JButton jbDetail;
	private JButton jbCheckin;
	private JButton jbCheckout;
	private JButton jbDelay;
	
	/**
	 * Create the panel.
	 */
	public HotelOrderUIPanel() {
		init();
	}
	
	public void init(){
		this.setSize(1080, 722);
		this.setLayout(null);
		
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
		jlSearch.setBounds(20, 70, 90, 30);
		jlSearch.setText("搜索");
		jlSearch.setHorizontalAlignment(SwingConstants.CENTER);
		jlSearch.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jcbOrderType = new JComboBox();
		jcbOrderType.setBounds(130, 20, 230, 30);
		jcbOrderType.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbOrderType.setOpaque(true);
		jcbOrderType.setBackground(Color.WHITE);
		jcbOrderType.setEditable(false);
		
		jcbSearch = new JComboBox();
		jcbSearch.setBounds(130, 70, 230, 30);
		jcbSearch.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbSearch.setOpaque(true);
		jcbSearch.setBackground(Color.WHITE);
		jcbSearch.setEditable(false);
		
		jtfSearch = new JTextField();
		jtfSearch.setBounds(400, 70, 230, 30);
		jcbSearch.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbSearch.setEditable(true);
		
		jbConfirm = new JButton();
		jbConfirm.setBounds(20, 120, 90, 40);
		jbConfirm.setText("确认");
		jbConfirm.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
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
		
		jpSearch.add(jlOrderType);
		jpSearch.add(jlSearch);
		jpSearch.add(jcbOrderType);
		jpSearch.add(jcbSearch);
		jpSearch.add(jtfSearch);
		jpSearch.add(jbConfirm);
		
		jpButton.add(jbDetail);
		jpButton.add(jbCheckin);
		jpButton.add(jbCheckout);
		jpButton.add(jbDelay);
		
		this.add(jpSearch);
		this.add(jpOrder);
		this.add(jpButton);
	}

}
