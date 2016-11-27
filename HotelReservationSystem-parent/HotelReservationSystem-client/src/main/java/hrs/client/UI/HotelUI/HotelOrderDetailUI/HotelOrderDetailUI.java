package hrs.client.UI.HotelUI.HotelOrderDetailUI;


import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class HotelOrderDetailUI extends JPanel {
	private JPanel jpDetail;
	private JPanel jpButton;
	private JTextField jtfID;
	private JLabel jlID;
	private JLabel jlPlaceOrder;
	private JLabel jlExecute;
	private JTextField jtfCheckIn;
	private JLabel jlCheckIn;
	private JLabel jlExpectedCheckOut;
	private JTextField jtfExecute;
	private JTextField jtfPlaceOrder;
	private JTextField jtfExpectedCheckOut;
	private JLabel jlCheckOut;
	private JTextField jtfCheckOut;
	private JLabel jlCancel;
	private JTextField jtfCancel;
	private JLabel jlRoomType;
	private JTextField jtfRoomType;
	private JLabel jlRoomNum;
	private JTextField jtfRoomNum;
	private JLabel jlPeopleNum;
	private JTextField jtfPeopleNum;
	private JLabel jlChildren;
	private JTextField jtfChildren;
	private JLabel jlMoney;
	private JTextField jtfMoney;
	private JLabel jlOrderType;
	private JTextField jtfOrderType;
	private JLabel jlUsername;
	private JTextField jtfUsername;
	private JLabel jlName;
	private JTextField jtfName;
	private JLabel jlBirthday;
	private JTextField jtfBirthday;
	private JLabel jlPhoneNum;
	private JTextField jtfPhoneNum;
	private JLabel jlFirmName;
	private JTextField jtfFirmName;
	private JLabel jlCredit;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public HotelOrderDetailUI() {
		setSize(1067, 714);
		setBackground(new Color(211, 237, 249));
		
		jpButton = new JPanel();
		jpButton.setBackground(new Color(211, 237, 249));
		
		jpDetail = new JPanel();
		jpDetail.setBackground(new Color(211, 237, 249));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jpButton, GroupLayout.PREFERRED_SIZE, 1067, GroupLayout.PREFERRED_SIZE)
						.addComponent(jpDetail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jpDetail, GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jpButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton jbReturn = new JButton("返回");
		GroupLayout gl_jpButton = new GroupLayout(jpButton);
		gl_jpButton.setHorizontalGroup(
			gl_jpButton.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpButton.createSequentialGroup()
					.addGap(484)
					.addComponent(jbReturn)
					.addContainerGap(520, Short.MAX_VALUE))
		);
		gl_jpButton.setVerticalGroup(
			gl_jpButton.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpButton.createSequentialGroup()
					.addContainerGap()
					.addComponent(jbReturn)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		jpButton.setLayout(gl_jpButton);
		GridBagLayout gbl_jpDetail = new GridBagLayout();
		gbl_jpDetail.columnWidths = new int[]{160, 190, 160, 356, 90, 0};
		gbl_jpDetail.rowHeights = new int[]{45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45};
		gbl_jpDetail.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_jpDetail.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		jpDetail.setLayout(gbl_jpDetail);
		
		jlID = new JLabel("订单号");
		jlID.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_jlID = new GridBagConstraints();
		gbc_jlID.insets = new Insets(0, 0, 5, 5);
		gbc_jlID.gridx = 0;
		gbc_jlID.gridy = 0;
		jpDetail.add(jlID, gbc_jlID);
		
		jtfID = new JTextField();
		jtfID.setHorizontalAlignment(SwingConstants.LEFT);
		jtfID.setOpaque(true);
		jtfID.setBackground(new Color(211, 237, 249));
		jtfID.setBorder(new EmptyBorder(0,0,0,0));
		jtfID.setEditable(false);
		jtfID.setColumns(10);
		GridBagConstraints gbc_jtfID = new GridBagConstraints();
		gbc_jtfID.insets = new Insets(0, 0, 5, 5);
		gbc_jtfID.gridx = 1;
		gbc_jtfID.gridy = 0;
		jpDetail.add(jtfID, gbc_jtfID);
		
		jlUsername = new JLabel("用户名");
		jlUsername.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_jlUsername = new GridBagConstraints();
		gbc_jlUsername.insets = new Insets(0, 0, 5, 5);
		gbc_jlUsername.gridx = 2;
		gbc_jlUsername.gridy = 0;
		jpDetail.add(jlUsername, gbc_jlUsername);
		
		jtfUsername = new JTextField();
		jtfUsername.setOpaque(true);
		jtfUsername.setHorizontalAlignment(SwingConstants.LEFT);
		jtfUsername.setEditable(false);
		jtfUsername.setColumns(10);
		jtfUsername.setBorder(new EmptyBorder(0,0,0,0));
		jtfUsername.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfUsername = new GridBagConstraints();
		gbc_jtfUsername.insets = new Insets(0, 0, 5, 5);
		gbc_jtfUsername.gridx = 3;
		gbc_jtfUsername.gridy = 0;
		jpDetail.add(jtfUsername, gbc_jtfUsername);
		
		jlPlaceOrder = new JLabel("下单时间");
		jlPlaceOrder.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_jlPlaceOrder = new GridBagConstraints();
		gbc_jlPlaceOrder.insets = new Insets(0, 0, 5, 5);
		gbc_jlPlaceOrder.gridx = 0;
		gbc_jlPlaceOrder.gridy = 1;
		jpDetail.add(jlPlaceOrder, gbc_jlPlaceOrder);
		
		jtfPlaceOrder = new JTextField();
		jtfPlaceOrder.setHorizontalAlignment(SwingConstants.LEFT);
		jtfPlaceOrder.setOpaque(true);
		jtfPlaceOrder.setEditable(false);
		jtfPlaceOrder.setColumns(10);
		jtfPlaceOrder.setBorder(new EmptyBorder(0,0,0,0));
		jtfPlaceOrder.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfPlaceOrder = new GridBagConstraints();
		gbc_jtfPlaceOrder.insets = new Insets(0, 0, 5, 5);
		gbc_jtfPlaceOrder.gridx = 1;
		gbc_jtfPlaceOrder.gridy = 1;
		jpDetail.add(jtfPlaceOrder, gbc_jtfPlaceOrder);
		
		jlName = new JLabel("真实姓名");
		jlName.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_jlName = new GridBagConstraints();
		gbc_jlName.insets = new Insets(0, 0, 5, 5);
		gbc_jlName.gridx = 2;
		gbc_jlName.gridy = 1;
		jpDetail.add(jlName, gbc_jlName);
		
		jtfName = new JTextField();
		jtfName.setOpaque(true);
		jtfName.setHorizontalAlignment(SwingConstants.LEFT);
		jtfName.setEditable(false);
		jtfName.setColumns(10);
		jtfName.setBorder(new EmptyBorder(0,0,0,0));
		jtfName.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfName = new GridBagConstraints();
		gbc_jtfName.insets = new Insets(0, 0, 5, 5);
		gbc_jtfName.gridx = 3;
		gbc_jtfName.gridy = 1;
		jpDetail.add(jtfName, gbc_jtfName);
		
		jlCheckIn = new JLabel("入住时间");
		jlCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_jlCheckIn = new GridBagConstraints();
		gbc_jlCheckIn.insets = new Insets(0, 0, 5, 5);
		gbc_jlCheckIn.gridx = 0;
		gbc_jlCheckIn.gridy = 2;
		jpDetail.add(jlCheckIn, gbc_jlCheckIn);
		
		jtfCheckIn = new JTextField();
		jtfCheckIn.setHorizontalAlignment(SwingConstants.LEFT);
		jtfCheckIn.setOpaque(true);
		jtfCheckIn.setEditable(false);
		jtfCheckIn.setColumns(10);
		jtfCheckIn.setBorder(new EmptyBorder(0,0,0,0));
		jtfCheckIn.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfCheckIn = new GridBagConstraints();
		gbc_jtfCheckIn.insets = new Insets(0, 0, 5, 5);
		gbc_jtfCheckIn.gridx = 1;
		gbc_jtfCheckIn.gridy = 2;
		jpDetail.add(jtfCheckIn, gbc_jtfCheckIn);
		
		jlBirthday = new JLabel("生日");
		GridBagConstraints gbc_jlBirthday = new GridBagConstraints();
		gbc_jlBirthday.insets = new Insets(0, 0, 5, 5);
		gbc_jlBirthday.gridx = 2;
		gbc_jlBirthday.gridy = 2;
		jpDetail.add(jlBirthday, gbc_jlBirthday);
		
		jtfBirthday = new JTextField();
		jtfBirthday.setOpaque(true);
		jtfBirthday.setHorizontalAlignment(SwingConstants.LEFT);
		jtfBirthday.setEditable(false);
		jtfBirthday.setColumns(10);
		jtfBirthday.setBorder(new EmptyBorder(0,0,0,0));
		jtfBirthday.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfBirthday = new GridBagConstraints();
		gbc_jtfBirthday.insets = new Insets(0, 0, 5, 5);
		gbc_jtfBirthday.gridx = 3;
		gbc_jtfBirthday.gridy = 2;
		jpDetail.add(jtfBirthday, gbc_jtfBirthday);
		
		jlExecute = new JLabel("执行时间");
		GridBagConstraints gbc_jlExecute = new GridBagConstraints();
		gbc_jlExecute.insets = new Insets(0, 0, 5, 5);
		gbc_jlExecute.gridx = 0;
		gbc_jlExecute.gridy = 3;
		jpDetail.add(jlExecute, gbc_jlExecute);
		
		jtfExecute = new JTextField();
		jtfExecute.setHorizontalAlignment(SwingConstants.LEFT);
		jtfExecute.setOpaque(true);
		jtfExecute.setEditable(false);
		jtfExecute.setColumns(10);
		jtfExecute.setBorder(new EmptyBorder(0,0,0,0));
		jtfExecute.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfExecute = new GridBagConstraints();
		gbc_jtfExecute.insets = new Insets(0, 0, 5, 5);
		gbc_jtfExecute.gridx = 1;
		gbc_jtfExecute.gridy = 3;
		jpDetail.add(jtfExecute, gbc_jtfExecute);
		
		jlPhoneNum = new JLabel("联系方式");
		GridBagConstraints gbc_jlPhoneNum = new GridBagConstraints();
		gbc_jlPhoneNum.insets = new Insets(0, 0, 5, 5);
		gbc_jlPhoneNum.gridx = 2;
		gbc_jlPhoneNum.gridy = 3;
		jpDetail.add(jlPhoneNum, gbc_jlPhoneNum);
		
		jtfPhoneNum = new JTextField();
		jtfPhoneNum.setOpaque(true);
		jtfPhoneNum.setHorizontalAlignment(SwingConstants.LEFT);
		jtfPhoneNum.setEditable(false);
		jtfPhoneNum.setColumns(10);
		jtfPhoneNum.setBorder(new EmptyBorder(0,0,0,0));
		jtfPhoneNum.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfPhoneNum = new GridBagConstraints();
		gbc_jtfPhoneNum.insets = new Insets(0, 0, 5, 5);
		gbc_jtfPhoneNum.gridx = 3;
		gbc_jtfPhoneNum.gridy = 3;
		jpDetail.add(jtfPhoneNum, gbc_jtfPhoneNum);
		
		jlExpectedCheckOut = new JLabel("预计离开时间");
		GridBagConstraints gbc_jlExpectedCheckOut = new GridBagConstraints();
		gbc_jlExpectedCheckOut.insets = new Insets(0, 0, 5, 5);
		gbc_jlExpectedCheckOut.gridx = 0;
		gbc_jlExpectedCheckOut.gridy = 4;
		jpDetail.add(jlExpectedCheckOut, gbc_jlExpectedCheckOut);
		
		jtfExpectedCheckOut = new JTextField();
		jtfExpectedCheckOut.setHorizontalAlignment(SwingConstants.LEFT);
		jtfExpectedCheckOut.setOpaque(true);
		jtfExpectedCheckOut.setEditable(false);
		jtfExpectedCheckOut.setColumns(10);
		jtfExpectedCheckOut.setBorder(new EmptyBorder(0,0,0,0));
		jtfExpectedCheckOut.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfExpectedCheckOut = new GridBagConstraints();
		gbc_jtfExpectedCheckOut.insets = new Insets(0, 0, 5, 5);
		gbc_jtfExpectedCheckOut.gridx = 1;
		gbc_jtfExpectedCheckOut.gridy = 4;
		jpDetail.add(jtfExpectedCheckOut, gbc_jtfExpectedCheckOut);
		
		jlFirmName = new JLabel("企业名称");
		GridBagConstraints gbc_jlFirmName = new GridBagConstraints();
		gbc_jlFirmName.insets = new Insets(0, 0, 5, 5);
		gbc_jlFirmName.gridx = 2;
		gbc_jlFirmName.gridy = 4;
		jpDetail.add(jlFirmName, gbc_jlFirmName);
		
		jtfFirmName = new JTextField();
		jtfFirmName.setOpaque(true);
		jtfFirmName.setHorizontalAlignment(SwingConstants.LEFT);
		jtfFirmName.setEditable(false);
		jtfFirmName.setColumns(10);
		jtfFirmName.setBorder(new EmptyBorder(0,0,0,0));
		jtfFirmName.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfFirmName = new GridBagConstraints();
		gbc_jtfFirmName.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFirmName.gridx = 3;
		gbc_jtfFirmName.gridy = 4;
		jpDetail.add(jtfFirmName, gbc_jtfFirmName);
		
		jlCheckOut = new JLabel("退房时间");
		GridBagConstraints gbc_jlCheckOut = new GridBagConstraints();
		gbc_jlCheckOut.insets = new Insets(0, 0, 5, 5);
		gbc_jlCheckOut.gridx = 0;
		gbc_jlCheckOut.gridy = 5;
		jpDetail.add(jlCheckOut, gbc_jlCheckOut);
		
		jtfCheckOut = new JTextField();
		jtfCheckOut.setHorizontalAlignment(SwingConstants.LEFT);
		jtfCheckOut.setOpaque(true);
		jtfCheckOut.setEditable(false);
		jtfCheckOut.setColumns(10);
		jtfCheckOut.setBorder(new EmptyBorder(0,0,0,0));
		jtfCheckOut.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfCheckOut = new GridBagConstraints();
		gbc_jtfCheckOut.insets = new Insets(0, 0, 5, 5);
		gbc_jtfCheckOut.gridx = 1;
		gbc_jtfCheckOut.gridy = 5;
		jpDetail.add(jtfCheckOut, gbc_jtfCheckOut);
		
		jlCredit = new JLabel("信用值");
		GridBagConstraints gbc_jlCredit = new GridBagConstraints();
		gbc_jlCredit.insets = new Insets(0, 0, 5, 5);
		gbc_jlCredit.gridx = 2;
		gbc_jlCredit.gridy = 5;
		jpDetail.add(jlCredit, gbc_jlCredit);
		
		textField = new JTextField();
		textField.setOpaque(true);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new EmptyBorder(0,0,0,0));
		textField.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 5;
		jpDetail.add(textField, gbc_textField);
		
		jlCancel = new JLabel("撤销时间");
		GridBagConstraints gbc_jlCancel = new GridBagConstraints();
		gbc_jlCancel.insets = new Insets(0, 0, 5, 5);
		gbc_jlCancel.gridx = 0;
		gbc_jlCancel.gridy = 6;
		jpDetail.add(jlCancel, gbc_jlCancel);
		
		jtfCancel = new JTextField();
		jtfCancel.setHorizontalAlignment(SwingConstants.LEFT);
		jtfCancel.setOpaque(true);
		jtfCancel.setEditable(false);
		jtfCancel.setColumns(10);
		jtfCancel.setBorder(new EmptyBorder(0,0,0,0));
		jtfCancel.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfCancel = new GridBagConstraints();
		gbc_jtfCancel.insets = new Insets(0, 0, 5, 5);
		gbc_jtfCancel.gridx = 1;
		gbc_jtfCancel.gridy = 6;
		jpDetail.add(jtfCancel, gbc_jtfCancel);
		
		jlRoomType = new JLabel("房间类型");
		GridBagConstraints gbc_jlRoomType = new GridBagConstraints();
		gbc_jlRoomType.insets = new Insets(0, 0, 5, 5);
		gbc_jlRoomType.gridx = 0;
		gbc_jlRoomType.gridy = 7;
		jpDetail.add(jlRoomType, gbc_jlRoomType);
		
		jtfRoomType = new JTextField();
		jtfRoomType.setHorizontalAlignment(SwingConstants.LEFT);
		jtfRoomType.setOpaque(true);
		jtfRoomType.setEditable(false);
		jtfRoomType.setColumns(10);
		jtfRoomType.setBorder(new EmptyBorder(0,0,0,0));
		jtfRoomType.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfRoomType = new GridBagConstraints();
		gbc_jtfRoomType.insets = new Insets(0, 0, 5, 5);
		gbc_jtfRoomType.gridx = 1;
		gbc_jtfRoomType.gridy = 7;
		jpDetail.add(jtfRoomType, gbc_jtfRoomType);
		
		jlRoomNum = new JLabel("房间数量");
		GridBagConstraints gbc_jlRoomNum = new GridBagConstraints();
		gbc_jlRoomNum.insets = new Insets(0, 0, 5, 5);
		gbc_jlRoomNum.gridx = 0;
		gbc_jlRoomNum.gridy = 8;
		jpDetail.add(jlRoomNum, gbc_jlRoomNum);
		
		jtfRoomNum = new JTextField();
		jtfRoomNum.setHorizontalAlignment(SwingConstants.LEFT);
		jtfRoomNum.setOpaque(true);
		jtfRoomNum.setEditable(false);
		jtfRoomNum.setColumns(10);
		jtfRoomNum.setBorder(new EmptyBorder(0,0,0,0));
		jtfRoomNum.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfRoomNum = new GridBagConstraints();
		gbc_jtfRoomNum.insets = new Insets(0, 0, 5, 5);
		gbc_jtfRoomNum.gridx = 1;
		gbc_jtfRoomNum.gridy = 8;
		jpDetail.add(jtfRoomNum, gbc_jtfRoomNum);
		
		jlPeopleNum = new JLabel("入住人数");
		GridBagConstraints gbc_jlPeopleNum = new GridBagConstraints();
		gbc_jlPeopleNum.insets = new Insets(0, 0, 5, 5);
		gbc_jlPeopleNum.gridx = 0;
		gbc_jlPeopleNum.gridy = 9;
		jpDetail.add(jlPeopleNum, gbc_jlPeopleNum);
		
		jtfPeopleNum = new JTextField();
		jtfPeopleNum.setHorizontalAlignment(SwingConstants.LEFT);
		jtfPeopleNum.setOpaque(true);
		jtfPeopleNum.setEditable(false);
		jtfPeopleNum.setColumns(10);
		jtfPeopleNum.setBorder(new EmptyBorder(0,0,0,0));
		jtfPeopleNum.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfPeopleNum = new GridBagConstraints();
		gbc_jtfPeopleNum.insets = new Insets(0, 0, 5, 5);
		gbc_jtfPeopleNum.gridx = 1;
		gbc_jtfPeopleNum.gridy = 9;
		jpDetail.add(jtfPeopleNum, gbc_jtfPeopleNum);
		
		jlChildren = new JLabel("有无儿童");
		GridBagConstraints gbc_jlChildren = new GridBagConstraints();
		gbc_jlChildren.insets = new Insets(0, 0, 5, 5);
		gbc_jlChildren.gridx = 0;
		gbc_jlChildren.gridy = 10;
		jpDetail.add(jlChildren, gbc_jlChildren);
		
		jtfChildren = new JTextField();
		jtfChildren.setHorizontalAlignment(SwingConstants.LEFT);
		jtfChildren.setOpaque(true);
		jtfChildren.setEditable(false);
		jtfChildren.setColumns(10);
		jtfChildren.setBorder(new EmptyBorder(0,0,0,0));
		jtfChildren.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfChildren = new GridBagConstraints();
		gbc_jtfChildren.insets = new Insets(0, 0, 5, 5);
		gbc_jtfChildren.gridx = 1;
		gbc_jtfChildren.gridy = 10;
		jpDetail.add(jtfChildren, gbc_jtfChildren);
		
		jlMoney = new JLabel("金额");
		GridBagConstraints gbc_jlMoney = new GridBagConstraints();
		gbc_jlMoney.insets = new Insets(0, 0, 5, 5);
		gbc_jlMoney.gridx = 0;
		gbc_jlMoney.gridy = 11;
		jpDetail.add(jlMoney, gbc_jlMoney);
		
		jtfMoney = new JTextField();
		jtfMoney.setHorizontalAlignment(SwingConstants.LEFT);
		jtfMoney.setOpaque(true);
		jtfMoney.setEditable(false);
		jtfMoney.setColumns(10);
		jtfMoney.setBorder(new EmptyBorder(0,0,0,0));
		jtfMoney.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfMoney = new GridBagConstraints();
		gbc_jtfMoney.insets = new Insets(0, 0, 5, 5);
		gbc_jtfMoney.gridx = 1;
		gbc_jtfMoney.gridy = 11;
		jpDetail.add(jtfMoney, gbc_jtfMoney);
		
		jlOrderType = new JLabel("订单状态");
		GridBagConstraints gbc_jlOrderType = new GridBagConstraints();
		gbc_jlOrderType.insets = new Insets(0, 0, 0, 5);
		gbc_jlOrderType.gridx = 0;
		gbc_jlOrderType.gridy = 12;
		jpDetail.add(jlOrderType, gbc_jlOrderType);
		
		jtfOrderType = new JTextField();
		jtfOrderType.setHorizontalAlignment(SwingConstants.LEFT);
		jtfOrderType.setOpaque(true);
		jtfOrderType.setEditable(false);
		jtfOrderType.setColumns(10);
		jtfOrderType.setBorder(new EmptyBorder(0,0,0,0));
		jtfOrderType.setBackground(new Color(211, 237, 249));
		GridBagConstraints gbc_jtfOrderType = new GridBagConstraints();
		gbc_jtfOrderType.insets = new Insets(0, 0, 0, 5);
		gbc_jtfOrderType.gridx = 1;
		gbc_jtfOrderType.gridy = 12;
		jpDetail.add(jtfOrderType, gbc_jtfOrderType);
		setLayout(groupLayout);
	}
}
