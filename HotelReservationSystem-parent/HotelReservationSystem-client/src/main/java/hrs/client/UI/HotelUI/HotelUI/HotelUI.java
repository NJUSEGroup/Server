package hrs.client.UI.HotelUI.HotelUI;


import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class HotelUI extends JPanel {
	JTextField jtfHotelName;
	JTextField jtfAddress;
	JTextField jtfScore;
	JPanel jpHotel;
	JPanel jpButton;
	JLabel jlHotelName;
	JLabel jlCity;
	JLabel jlCircle;
	JLabel jladdress;
	JLabel jlIntro;
	JLabel jlService;
	JLabel jlStar;
	JLabel jlScore;
	JComboBox jcbCity;
	JComboBox jcbCircle;
	JTextArea jtaIntro;
	JTextArea jtaService;
	JComboBox jcbStar;
	JButton jbEdit;
	JButton jbCancel;

	/**
	 * Create the panel.
	 */
	public HotelUI() {
		setBackground(new Color(211, 237, 249));
		
		jpHotel = new JPanel();
		jpHotel.setBackground(new Color(211, 237, 249));
		
		jpButton = new JPanel();
		jpButton.setBackground(new Color(211, 237, 249));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jpButton, GroupLayout.PREFERRED_SIZE, 1067, GroupLayout.PREFERRED_SIZE)
						.addComponent(jpHotel, GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jpHotel, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jpButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		jbEdit = new JButton("修改");
		
		jbCancel = new JButton("取消");
		GroupLayout gl_jpButton = new GroupLayout(jpButton);
		gl_jpButton.setHorizontalGroup(
			gl_jpButton.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jpButton.createSequentialGroup()
					.addContainerGap(279, Short.MAX_VALUE)
					.addComponent(jbEdit, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(248)
					.addComponent(jbCancel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(330))
		);
		gl_jpButton.setVerticalGroup(
			gl_jpButton.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpButton.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpButton.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbEdit, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
						.addComponent(jbCancel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		jpButton.setLayout(gl_jpButton);
		
		jlHotelName = new JLabel("酒店名称");
		jlHotelName.setHorizontalAlignment(SwingConstants.CENTER);
		
		jtfHotelName = new JTextField();
		jtfHotelName.setColumns(10);
		
		jcbCity = new JComboBox();
		jcbCity.setOpaque(true);
		jcbCity.setBackground(Color.WHITE);
		jcbCity.setModel(new DefaultComboBoxModel(new String[] {"北京", "南京", "上海"}));//test
		
		jcbCircle = new JComboBox();
		jcbCircle.setOpaque(true);
		jcbCircle.setBackground(Color.WHITE);
		jcbCircle.setModel(new DefaultComboBoxModel(new String[] {"江宁区", "玄武区", "栖霞区"}));//test
		
		jlCity = new JLabel("城    市");
		jlCity.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlCircle = new JLabel("商    圈");
		jlCircle.setHorizontalAlignment(SwingConstants.CENTER);
		
		jladdress = new JLabel("地    址");
		jladdress.setHorizontalAlignment(SwingConstants.CENTER);
		
		jtfAddress = new JTextField();
		jtfAddress.setColumns(10);
		
		jlIntro = new JLabel("简    介");
		jlIntro.setHorizontalAlignment(SwingConstants.CENTER);
		
		jtaIntro = new JTextArea();
		
		jlService = new JLabel("设施服务");
		jlService.setHorizontalAlignment(SwingConstants.CENTER);
		
		jtaService = new JTextArea();
		
		jlStar = new JLabel("星    级");
		jlStar.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlScore = new JLabel("评    分");
		jlScore.setHorizontalAlignment(SwingConstants.CENTER);
		
		jcbStar = new JComboBox(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		jcbStar.setOpaque(true);
		jcbStar.setBackground(Color.WHITE);
		
		jtfScore = new JTextField();
		jtfScore.setBorder(new EmptyBorder(0,0,0,0));
		jtfScore.setBackground(new Color(211, 237, 249));
		jtfScore.setEditable(false);
		jtfScore.setColumns(10);
		GroupLayout gl_jpHotel = new GroupLayout(jpHotel);
		gl_jpHotel.setHorizontalGroup(
			gl_jpHotel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpHotel.createSequentialGroup()
					.addGap(59)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.LEADING)
						.addComponent(jlHotelName, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlCity, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlCircle, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(jladdress, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlIntro, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlService, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlStar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlScore, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpHotel.createSequentialGroup()
							.addComponent(jtfScore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(778))
						.addGroup(gl_jpHotel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_jpHotel.createSequentialGroup()
								.addComponent(jcbStar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_jpHotel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jpHotel.createSequentialGroup()
									.addGroup(gl_jpHotel.createParallelGroup(Alignment.LEADING)
										.addComponent(jcbCircle, 0, 252, Short.MAX_VALUE)
										.addComponent(jcbCity, 0, 252, Short.MAX_VALUE)
										.addComponent(jtfHotelName, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
									.addGap(612))
								.addGroup(Alignment.TRAILING, gl_jpHotel.createSequentialGroup()
									.addGroup(gl_jpHotel.createParallelGroup(Alignment.TRAILING)
										.addComponent(jtaIntro, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
										.addComponent(jtfAddress, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
										.addComponent(jtaService, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
									.addGap(150))))))
		);
		gl_jpHotel.setVerticalGroup(
			gl_jpHotel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpHotel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlHotelName, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(jtfHotelName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCity, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(jcbCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCircle, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(jcbCircle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jladdress, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(jtfAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlIntro, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(jtaIntro, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlService, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(jtaService, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlStar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(jcbStar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jpHotel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlScore, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(jtfScore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpHotel.setLayout(gl_jpHotel);
		setLayout(groupLayout);

	}
}
