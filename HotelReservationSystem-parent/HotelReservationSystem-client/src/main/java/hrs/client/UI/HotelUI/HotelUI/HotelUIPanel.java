package hrs.client.UI.HotelUI.HotelUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import hrs.client.UI.HotelUI.HotelUI.Listener.CancelListener;
import hrs.client.UI.HotelUI.HotelUI.Listener.EditListener;
import hrs.client.util.ControllerFactory;
import hrs.common.Controller.HotelController.IHotelController;
import hrs.common.VO.HotelVO;

public class HotelUIPanel extends JPanel {

	private JPanel jpHotelInfo;
	private JPanel jpButton;
	private JLabel jlHotelName;
	private JLabel jlCity;
	private JLabel jlCircle;
	private JLabel jlAddress;
	private JLabel jlIntro;
	private JLabel jlService;
	private JLabel jlStar;
	private JLabel jlScore;
	private JTextField jtfHotelName;
	private JTextField jtfAddress;
	private JTextField jtfScore;
	private JComboBox jcbCity;
	private JComboBox jcbCircle;
	private JTextArea jtaIntro;
	private JTextArea jtaService;
	private JComboBox jcbStar;
	private JButton jbEdit;
	private JButton jbCancel;
	private EditListener editListener;
	private CancelListener cancelListener;
	private HotelVO hotel;
	
	/**
	 * Create the panel.
	 */
	public HotelUIPanel(HotelVO hotel) {
		init(hotel);
	}

	public void init(HotelVO hotel){
		this.hotel = hotel;
		this.setSize(1080, 722);
		this.setLayout(null);
		
		jpHotelInfo = new JPanel();
		jpHotelInfo.setBounds(0, 0, 1080, 642);
		jpHotelInfo.setBackground(new Color(211, 237, 249));
		jpHotelInfo.setLayout(null);
		
		jpButton = new JPanel();
		jpButton.setBounds(0, 642, 1080, 80);
		jpButton.setBackground(new Color(211, 237, 249));
		jpButton.setLayout(null);
		
		jlHotelName = new JLabel();
		jlHotelName.setBounds(30, 20, 90, 30);
		jlHotelName.setText("酒店名称");
		jlHotelName.setHorizontalAlignment(SwingConstants.CENTER);
		jlHotelName.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jlCity = new JLabel();
		jlCity.setBounds(30, 70, 90, 30);
		jlCity.setText("城市");
		jlCity.setHorizontalAlignment(SwingConstants.CENTER);
		jlCity.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jlCircle = new JLabel();
		jlCircle.setBounds(30, 120, 90, 30);
		jlCircle.setText("商圈");
		jlCircle.setHorizontalAlignment(SwingConstants.CENTER);
		jlCircle.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jlAddress = new JLabel();
		jlAddress.setBounds(30, 170, 90, 30);
		jlAddress.setText("地址");
		jlAddress.setHorizontalAlignment(SwingConstants.CENTER);
		jlAddress.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jlIntro = new JLabel();
		jlIntro.setBounds(30, 220, 90, 30);
		jlIntro.setText("简介");
		jlIntro.setHorizontalAlignment(SwingConstants.CENTER);
		jlIntro.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jlService = new JLabel();
		jlService.setBounds(30, 420, 90, 30);
		jlService.setText("设施服务");
		jlService.setHorizontalAlignment(SwingConstants.CENTER);
		jlService.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jlStar = new JLabel();
		jlStar.setBounds(30, 550, 90, 30);
		jlStar.setText("星级");
		jlStar.setHorizontalAlignment(SwingConstants.CENTER);
		jlStar.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jlScore = new JLabel();
		jlScore.setBounds(30, 600, 90, 30);
		jlScore.setText("评分");
		jlScore.setHorizontalAlignment(SwingConstants.CENTER);
		jlScore.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jtfHotelName = new JTextField();
		jtfHotelName.setBounds(150, 20, 359, 30);
		jtfHotelName.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jtfHotelName.setEditable(true);
		
		jcbCity = new JComboBox();
		jcbCity.setBounds(150, 70, 172, 30);
		jcbCity.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbCity.setOpaque(true);
		jcbCity.setBackground(Color.WHITE);
		jcbCity.setEditable(false);
		
		jcbCircle = new JComboBox();
		jcbCircle.setBounds(150, 120, 172, 30);
		jcbCircle.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbCircle.setOpaque(true);
		jcbCircle.setBackground(Color.WHITE);
		jcbCircle.setEditable(false);
		
		jtfAddress = new JTextField();
		jtfAddress.setBounds(150, 170, 853, 30);
		jtfAddress.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jtfAddress.setEditable(true);
		
		jtaIntro = new JTextArea();
		jtaIntro.setBounds(150, 220, 853, 180);
		jtaIntro.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jtaIntro.setEditable(true);
		
		jtaService = new JTextArea();
		jtaService.setBounds(150, 420, 853, 110);
		jtaService.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jtaService.setEditable(true);
		
		jcbStar = new JComboBox(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		jcbStar.setBounds(150, 550, 105, 30);
		jcbStar.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jcbStar.setOpaque(true);
		jcbStar.setBackground(Color.WHITE);
		jcbStar.setEditable(false);
		
		jtfScore = new JTextField();
		jtfScore.setBounds(150, 600, 105, 30);
		jtfScore.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jtfScore.setBorder(new EmptyBorder(0, 0, 0, 0));
		jtfScore.setBackground(new Color(211, 237, 249));
		jtfScore.setEditable(false);
		
		editListener = new EditListener(hotel);
		
		cancelListener = new CancelListener(this);
		
		jbEdit = new JButton();
		jbEdit.setBounds(251, 17, 110, 50);
		jbEdit.setText("修改");
		jbEdit.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jbEdit.addMouseListener(editListener);
		
		jbCancel = new JButton();
		jbCancel.setBounds(606, 17, 110, 50);
		jbCancel.setText("取消");
		jbCancel.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jpHotelInfo.add(jlHotelName);
		jpHotelInfo.add(jlCity);
		jpHotelInfo.add(jlCircle);
		jpHotelInfo.add(jlAddress);
		jpHotelInfo.add(jlIntro);
		jpHotelInfo.add(jlService);
		jpHotelInfo.add(jlStar);
		jpHotelInfo.add(jlScore);
		jpHotelInfo.add(jtfHotelName);
		jpHotelInfo.add(jcbCity);
		jpHotelInfo.add(jcbCircle);
		jpHotelInfo.add(jtfAddress);
		jpHotelInfo.add(jtaIntro);
		jpHotelInfo.add(jtaService);
		jpHotelInfo.add(jcbStar);
		jpHotelInfo.add(jtfScore);
		
		jpButton.add(jbEdit);
		jpButton.add(jbCancel);
		
		this.add(jpHotelInfo);
		this.add(jpButton);
	}
	
	public void show(){
		this.jtfHotelName.setText(hotel.name);
		this.jcbCity.setSelectedItem(hotel.location.name);
		this.jcbCircle.setSelectedItem(hotel.commercialCircle.name);
		this.jtfAddress.setText(hotel.street);
		this.jtaIntro.setText(hotel.profile);
		this.jtaService.setText(hotel.service);
		this.jcbStar.setSelectedItem(Integer.toString(hotel.star));
		this.jtfScore.setText(Double.toString(hotel.score));
	}
}
