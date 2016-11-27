package hrs.client.UI.HotelUI.HotelFrame;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hrs.client.UI.HotelUI.HotelDiscountUI.HotelDiscountUI;
import hrs.client.UI.HotelUI.HotelDiscountUI.Listener.HotelDiscountUIListener;
import hrs.client.UI.HotelUI.HotelOrderUI.HotelOrderUI;
import hrs.client.UI.HotelUI.HotelOrderUI.Listener.HotelOrderUIListener;
import hrs.client.UI.HotelUI.HotelUI.HotelUI;
import hrs.client.UI.HotelUI.HotelUI.Listener.HotelUIListener;
import hrs.client.UI.HotelUI.OfflineRecordUI.OfflineRecordUI;
import hrs.client.UI.HotelUI.OfflineRecordUI.Listener.OfflineRecordUIListener;
import hrs.client.UI.HotelUI.RoomUI.RoomUI;
import hrs.client.UI.HotelUI.RoomUI.Listener.RoomUIListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class HotelFrame extends JFrame {

	JPanel contentPane;
	JPanel jpMenuList;
	JPanel jpCard;
	JLabel jlZone;
	JLabel jlIdentity;
	JLabel jlUsername;
	JLabel jlHotelInfo;
	JLabel jlHotelOrder;
	JLabel jlRoomInput;
	JLabel jlHotelDiscount;
	JLabel jlOfflineRecord;
	CardLayout card;
	HotelUI jpCard1;
	HotelOrderUI jpCard2;
	RoomUI jpCard3;
	HotelDiscountUI jpCard4;
	OfflineRecordUI jpCard5;
	HotelUIListener hotelUIListener;
	HotelOrderUIListener hotelOrderUIListener;
	RoomUIListener roomUIListener;
	HotelDiscountUIListener hotelDiscountUIListener;
	OfflineRecordUIListener offlineRecordUIListener;
	//StaffVO vo;

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
	 */
	public HotelFrame(/**StaffVO vo**/) {
		//this.vo = vo;
		setResizable(false);
		setTitle("酒店预订系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		jpMenuList = new JPanel();
		jpMenuList.setBackground(new Color(211, 237, 249));
		
		jpCard = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(jpMenuList, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jpCard, GroupLayout.PREFERRED_SIZE, 1067, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(jpCard, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jpMenuList, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 714, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		card = new CardLayout();
		jpCard.setLayout(card);
		jpCard1 = new HotelUI();
		jpCard2 = new HotelOrderUI();
		jpCard3 = new RoomUI();
		jpCard4 = new HotelDiscountUI();
		jpCard5 = new OfflineRecordUI();
		jpCard.add(jpCard1, "1");
		jpCard.add(jpCard2, "2");
		jpCard.add(jpCard3, "3");
		jpCard.add(jpCard4, "4");
		jpCard.add(jpCard5, "5");
		
		
		jlZone = new JLabel("酒店管理中心");
		jlZone.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlUsername = new JLabel("Un");
		jlUsername.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlHotelInfo = new JLabel("酒店信息");
		jlHotelInfo.setOpaque(true);
		jlHotelInfo.setBackground(new Color(0, 160, 233));
		hotelUIListener = new HotelUIListener(card, jpCard, jpCard1 /**vo**/);
		jlHotelInfo.addMouseListener(hotelUIListener);
		jlHotelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlIdentity = new JLabel("酒店管理人员");
		jlIdentity.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlHotelOrder = new JLabel("订单管理");
		jlHotelOrder.setOpaque(true);
		jlHotelOrder.setBackground(new Color(0, 160, 233));
		hotelOrderUIListener = new HotelOrderUIListener(card, jpCard);
		jlHotelOrder.addMouseListener(hotelOrderUIListener);
		jlHotelOrder.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlRoomInput = new JLabel("录入客房");
		jlRoomInput.setOpaque(true);
		jlRoomInput.setBackground(new Color(0, 160, 233));
		roomUIListener = new RoomUIListener(card, jpCard);
		jlRoomInput.addMouseListener(roomUIListener);
		jlRoomInput.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlHotelDiscount = new JLabel("促销策略");
		jlHotelDiscount.setOpaque(true);
		jlHotelDiscount.setBackground(new Color(0, 160, 233));
		hotelDiscountUIListener = new HotelDiscountUIListener(card, jpCard);
		jlHotelDiscount.addMouseListener(hotelDiscountUIListener);
		jlHotelDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlOfflineRecord = new JLabel("线下入住");
		jlOfflineRecord.setOpaque(true);
		jlOfflineRecord.setBackground(new Color(0, 160, 233));
		offlineRecordUIListener = new OfflineRecordUIListener(card, jpCard);
		jlOfflineRecord.addMouseListener(offlineRecordUIListener);
		jlOfflineRecord.setHorizontalAlignment(SwingConstants.CENTER);
		
		GroupLayout gl_jpMenuList = new GroupLayout(jpMenuList);
		gl_jpMenuList.setHorizontalGroup(
			gl_jpMenuList.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_jpMenuList.createSequentialGroup()
					.addGroup(gl_jpMenuList.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_jpMenuList.createParallelGroup(Alignment.LEADING, false)
							.addComponent(jlZone, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
							.addComponent(jlUsername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jlIdentity, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
						.addComponent(jlOfflineRecord, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(jlHotelDiscount, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(jlRoomInput, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(jlHotelOrder, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(jlHotelInfo, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_jpMenuList.setVerticalGroup(
			gl_jpMenuList.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpMenuList.createSequentialGroup()
					.addComponent(jlZone, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jlIdentity, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jlUsername, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(jlHotelInfo, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jlHotelOrder, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jlRoomInput, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jlHotelDiscount, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jlOfflineRecord, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(177, Short.MAX_VALUE))
		);
		jpMenuList.setLayout(gl_jpMenuList);
		contentPane.setLayout(gl_contentPane);
	}

}
