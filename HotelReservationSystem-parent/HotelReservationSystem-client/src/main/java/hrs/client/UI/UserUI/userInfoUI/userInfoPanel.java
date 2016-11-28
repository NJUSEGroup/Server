package hrs.client.UI.UserUI.userInfoUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class userInfoPanel extends JPanel {
	
	private JLabel userLabel = new userInfoLabel("用户名");
	private JLabel nameLabel = new userInfoLabel("真实姓名");
	private JLabel birthLabel = new userInfoLabel("生日");
	private JLabel contactLabel = new userInfoLabel("联系方式");
	private JLabel enterpriseLabel = new userInfoLabel("企业名称");
	private JLabel creditLabel = new userInfoLabel("信用值");
	
	private JTextField userTextField = new userInfoText();//用户名文本框
	private JTextField nameTextField = new userInfoText();//真实姓名
	private JTextField contactTextField = new userInfoText();//联系方式
	private JTextField enterpriseField = new userInfoText();//企业
	private JLabel creditJL;
	
	private JComboBox yearBox = new JComboBox();//出生年份选框
	private JComboBox monthBox = new JComboBox();//出生月份选框
	private JComboBox dayBox = new JComboBox();//出生日期选框
	
	private String username;
	private Date date;
	
	
	
	public userInfoPanel(String username){

		this.username = username;
		
		setLayout(null);
		setBackground(new Color(211, 237, 249));
		setSize(1043,688);
		
		JButton cancelJB = new JButton("取消");
		cancelJB.setPreferredSize(new Dimension(180,80));
		cancelJB.setFont(new Font("微软雅黑",Font.PLAIN,24));
		cancelJB.setBounds(160, 500, 180, 70);
		this.add(cancelJB);
		
		JButton confirmJB = new JButton("确认");
		confirmJB.setPreferredSize(new Dimension(180,80));
		confirmJB.setFont(new Font("微软雅黑",Font.PLAIN,24));
		confirmJB.setBounds(560, 500, 180, 70);
		this.add(confirmJB);
		
		
		//从数据库获得用户信息
		getInfo();
		
		//设置信息标签
		setLabel();
		
		//信息展示
		setInfo();
	}
	
	public String getUsername(){
		return username;
	}
	
	/*
	 * 从数据库获得真实姓名，生日，联系方式，企业，信用值
	 */
	private void getInfo() {
		userTextField.setText(username);
		nameTextField.setText("宋欣健");
		contactTextField.setText("1392131042");
		enterpriseField.setText("南京大学");
		creditJL = new JLabel("200");
		
		creditJL.setFont(new Font("微软雅黑",Font.PLAIN,24));
		creditJL.setPreferredSize(new Dimension(100,60));
		
        date = new Date(1997,1,1);
	}

	/*
	 * 展示信息：
	 * 
	 * 用户名，真实姓名，企业，联系方式为文本框
	 * 生日按年，月，日为选框形式
	 * 信用值为标签，不可更改
	 * 
	 */
	private void setInfo() {
		//设置位置
		userTextField.setBounds(130, 10, 180, 40);
		nameTextField.setBounds(130, 70, 180, 40);
		contactTextField.setBounds(130, 190, 180, 40);
		enterpriseField.setBounds(130, 250, 180, 40);
		creditJL.setBounds(130, 300, 100, 60);
		yearBox.setBounds(130, 130, 100, 40);
		monthBox.setBounds(310, 130, 80, 40);
		dayBox.setBounds(430, 130, 80, 40);
		
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDay();
		yearBox.setFont(new Font("微软雅黑",Font.PLAIN,24));
		monthBox.setFont(new Font("微软雅黑",Font.PLAIN,24));
		dayBox.setFont(new Font("微软雅黑",Font.PLAIN,24));
		
		//年份可选值，从1960-2010
		//TODO
		for(int i = 0;i<50;i++){
			int y = 1960+i;
			String s = ""+y;
			yearBox.addItem(s);
		}
		
		//月份可选值
		for(int i = 1;i<13;i++){
			String s = ""+i;
			monthBox.addItem(s);
		}
		
		//日期可选值
		for(int i = 1;i<32;i++){
			String s = ""+i;
			dayBox.addItem(s);
		}
		
		yearBox.setPreferredSize(new Dimension(100,40));
		monthBox.setPreferredSize(new Dimension(80,40));
		dayBox.setPreferredSize(new Dimension(80,40));
		String yearS = "" + year;
		String monthS = "" + month;
		String dayS = "" + day;
		yearBox.setSelectedItem(yearS);
		monthBox.setSelectedItem(monthS);
		dayBox.setSelectedItem(dayS);
		
		this.add(userTextField);
		this.add(nameTextField);
		this.add(contactTextField);
		this.add(enterpriseField);
		this.add(creditJL);
		this.add(yearBox);
		this.add(monthBox);
		this.add(dayBox);
		
	}
	
	
	/**
	 * 设置信息标签
	 * 即：
	 * 用户名
	 * 真实姓名
	 * 生日
	 * 联系方式
	 * 企业名称
	 * 信用值
	 *
	 */
	private void setLabel() {
		userLabel.setBounds(0, 0, 100, 60);
		nameLabel.setBounds(0, 60, 100, 60);
		birthLabel.setBounds(0, 120, 100, 60);
		contactLabel.setBounds(0, 180, 100, 60);
		enterpriseLabel.setBounds(0, 240, 100, 60);
		creditLabel.setBounds(0, 300, 100, 60);
		
		this.add(userLabel);
		this.add(nameLabel);
		this.add(birthLabel);
		this.add(contactLabel);
		this.add(enterpriseLabel);
		this.add(creditLabel);
	}
}
