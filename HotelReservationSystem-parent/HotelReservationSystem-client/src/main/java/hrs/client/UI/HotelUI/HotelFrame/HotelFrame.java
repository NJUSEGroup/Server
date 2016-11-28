package hrs.client.UI.HotelUI.HotelFrame;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import hrs.client.UI.HotelUI.HotelDiscountUI.HotelDiscountUIPanel;
import hrs.client.UI.HotelUI.HotelFrame.Listener.HotelDiscountUIListener;
import hrs.client.UI.HotelUI.HotelFrame.Listener.HotelOrderUIListener;
import hrs.client.UI.HotelUI.HotelFrame.Listener.HotelUIListener;
import hrs.client.UI.HotelUI.HotelFrame.Listener.OfflineRecordUIListener;
import hrs.client.UI.HotelUI.HotelFrame.Listener.RoomUIListener;
import hrs.client.UI.HotelUI.HotelOrderUI.HotelOrderUIPanel;
import hrs.client.UI.HotelUI.HotelUI.HotelUIPanel;
import hrs.client.UI.HotelUI.OfflineRecordUI.OfflineRecordUIPanel;
import hrs.client.UI.HotelUI.RoomUI.RoomUIPanel;
import hrs.client.UI.UserUI.leftPanel;
import hrs.client.util.ControllerFactory;
import hrs.common.Controller.HotelController.IHotelController;
import hrs.common.Exception.HotelService.HotelNotFoundException;
import hrs.common.POJO.OfflineRecordPO;
import hrs.common.VO.HotelVO;
import hrs.common.VO.StaffVO;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HotelFrame extends JFrame {
	
	private CardLayout card;
	private JPanel jpMenuList;
	private JPanel jpCard;
	private JLabel jlZone;
	private JLabel jlIdentity;
	private JLabel jlUsername;
	private JLabel jlHotelInfo;
	private JLabel jlHotelOrder;
	private JLabel jlRoom;
	private JLabel jlHotelDiscount;
	private JLabel jlOfflineRecord;
	private HotelUIPanel jpHotelUI;
	private HotelOrderUIPanel jpHotelOrderUI;
	private RoomUIPanel jpRoomUI;
	private HotelDiscountUIPanel jpHotelDiscountUI;
	private OfflineRecordUIPanel jpOfflineRecordUI;
	private HotelUIListener hotelUIListener;
	private HotelOrderUIListener hotelOrderUIListener;
	private RoomUIListener roomUIListener;
	private HotelDiscountUIListener hotelDiscountUIListener;
	private OfflineRecordUIListener offlineRecordUIListener;
	private StaffVO staff;
	private HotelVO hotel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelFrame frame = new HotelFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws HotelNotFoundException 
	 */
	public HotelFrame(/**StaffVO staff**/) throws HotelNotFoundException {
		init(/**staff**/);
	}
	
	public void init(/**StaffVO staff**/) throws HotelNotFoundException{
		//this.staff = staff;
		//this.hotel = staff.hotel;
		this.setSize(1366, 768);
		this.setLocationRelativeTo(null);
		this.setTitle("酒店预订系统");
		getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(211, 237, 249));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
		card = new CardLayout();
		
		jpHotelUI = new HotelUIPanel(hotel);
		jpHotelOrderUI = new HotelOrderUIPanel();
		jpRoomUI = new RoomUIPanel();
		jpHotelDiscountUI = new HotelDiscountUIPanel();
		jpOfflineRecordUI = new OfflineRecordUIPanel();
		
		hotelUIListener = new HotelUIListener(this);
		hotelOrderUIListener = new HotelOrderUIListener(this);
		roomUIListener = new RoomUIListener(this);
		hotelDiscountUIListener = new HotelDiscountUIListener(this);
		offlineRecordUIListener = new OfflineRecordUIListener(this);
		
		jpMenuList = new JPanel();
		jpMenuList.setBounds(5, 5, 263, 722);
		jpMenuList.setBackground(new Color(211, 237, 249));
		jpMenuList.setLayout(null);
		
		jpCard = new JPanel();
		jpCard.setBounds(273, 5, 1080, 722);
		jpCard.setBackground(new Color(211, 237, 249));
		jpCard.setLayout(card);
		jpCard.add(jpHotelUI, "1");
		jpCard.add(jpHotelOrderUI, "2");
		jpCard.add(jpRoomUI, "3");
		jpCard.add(jpHotelDiscountUI, "4");
		jpCard.add(jpOfflineRecordUI, "5");
		
		jlZone = new JLabel();
		jlZone.setBounds(0, 0, 263, 79);
		jlZone.setText("酒店管理中心");
		jlZone.setHorizontalAlignment(SwingConstants.CENTER);
		jlZone.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 25));
		
		jlIdentity = new JLabel();
		jlIdentity.setBounds(0, 79, 263, 29);
		jlIdentity.setText("酒店工作人员");
		jlIdentity.setHorizontalAlignment(SwingConstants.CENTER);
		jlIdentity.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 21));
		
		jlUsername = new JLabel();
		jlUsername.setBounds(0, 108, 263, 29);
		jlUsername.setText("Username");//要改:staff.username
		jlUsername.setHorizontalAlignment(SwingConstants.CENTER);
		jlUsername.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 21));
		
		jlHotelInfo = new JLabel();
		jlHotelInfo.setBounds(0, 200, 263, 65);
		jlHotelInfo.setText("酒店信息");
		jlHotelInfo.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 21));
		jlHotelInfo.setForeground(Color.WHITE);
		jlHotelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		jlHotelInfo.setOpaque(true);
		jlHotelInfo.setBackground(new Color(0, 160, 233));
		jlHotelInfo.addMouseListener(hotelUIListener);
		
		jlHotelOrder = new JLabel();
		jlHotelOrder.setBounds(0, 265, 263, 65);
		jlHotelOrder.setText("订单管理");
		jlHotelOrder.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 21));
		jlHotelOrder.setForeground(Color.WHITE);
		jlHotelOrder.setHorizontalAlignment(SwingConstants.CENTER);
		jlHotelOrder.setOpaque(true);
		jlHotelOrder.setBackground(new Color(0, 160, 233));
		jlHotelOrder.addMouseListener(hotelOrderUIListener);
		
		jlRoom = new JLabel();
		jlRoom.setBounds(0, 330, 263, 65);
		jlRoom.setText("录入客房");
		jlRoom.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 21));
		jlRoom.setForeground(Color.WHITE);
		jlRoom.setHorizontalAlignment(SwingConstants.CENTER);
		jlRoom.setOpaque(true);
		jlRoom.setBackground(new Color(0, 160, 233));
		jlRoom.addMouseListener(roomUIListener);
		
		jlHotelDiscount = new JLabel();
		jlHotelDiscount.setBounds(0, 395, 263, 65);
		jlHotelDiscount.setText("促销策略");
		jlHotelDiscount.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 21));
		jlHotelDiscount.setForeground(Color.WHITE);
		jlHotelDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		jlHotelDiscount.setOpaque(true);
		jlHotelDiscount.setBackground(new Color(0, 160, 233));
		jlHotelDiscount.addMouseListener(hotelDiscountUIListener);
		
		jlOfflineRecord = new JLabel();
		jlOfflineRecord.setBounds(0, 460, 263, 65);
		jlOfflineRecord.setText("线下记录");
		jlOfflineRecord.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 21));
		jlOfflineRecord.setForeground(Color.WHITE);
		jlOfflineRecord.setHorizontalAlignment(SwingConstants.CENTER);
		jlOfflineRecord.setOpaque(true);
		jlOfflineRecord.setBackground(new Color(0, 160, 233));
		jlOfflineRecord.addMouseListener(offlineRecordUIListener);
		
		jpMenuList.add(jlZone);
		jpMenuList.add(jlIdentity);
		jpMenuList.add(jlUsername);
		jpMenuList.add(jlHotelInfo);
		jpMenuList.add(jlHotelOrder);
		jpMenuList.add(jlRoom);
		jpMenuList.add(jlHotelDiscount);
		jpMenuList.add(jlOfflineRecord);
		
		this.getContentPane().add(jpMenuList);
		this.getContentPane().add(jpCard);
	}
	
	public void showHotelInfo(){
		card.show(jpCard, "1");
		jpHotelUI.show();
	}
	
	public void showHotelOrder(){
		card.show(jpCard, "2");
		//jpHotelOrderUI.show();还没写= =
	}
	
	public void showRoomInfo(){
		card.show(jpCard, "3");
		//jpRoomUI.show();
	}
	
	public void showHotelDiscount(){
		card.show(jpCard, "4");
		//jpHotelDiscountUI.show();
	}
	
	public void showOfflineRecord(){
		card.show(jpCard, "5");	
		//jpOfflineRecordUI.show();
	}
}
