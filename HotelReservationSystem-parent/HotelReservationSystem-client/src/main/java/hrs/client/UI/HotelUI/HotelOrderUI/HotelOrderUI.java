package hrs.client.UI.HotelUI.HotelOrderUI;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import hrs.client.UI.HotelUI.Components.*;

import java.awt.Color;
import java.util.Date;

public class HotelOrderUI extends JPanel {
	private JTextField jtfSearch;
	private JPanel jpSearch;
	private JLabel jlOrderType;
	private JComboBox jcbSearch;
	private JLabel jlSearch;
	private JComboBox jcbOrderType;
	private JButton jbConfirm;
	private JPanel jpTable;
	private JTable jtOrderList;
	private OrderListTable orderListModel;
	private JPanel jpButton;
	private JButton jbDetail;
	private JButton jbCheckIn;
	private JButton jbCheckOut;
	private JButton jbDelay;
	private JScrollPane jspTable;

	/**
	 * Create the panel.
	 */
	public HotelOrderUI() {
		setSize(1067, 714);
		
		jpSearch = new JPanel();
		jpSearch.setBackground(new Color(211, 237, 249));
		
		jpTable = new JPanel();
		jpTable.setBackground(new Color(211, 237, 249));
		
		jpButton = new JPanel();
		jpButton.setBackground(new Color(211, 237, 249));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(jpSearch, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
				.addComponent(jpButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
				.addComponent(jpTable, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jpSearch, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jpTable, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jpButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
		);
		
		jbDetail = new JButton("查看详细");
		
		jbCheckIn = new JButton("入住");
		
		jbCheckOut = new JButton("退房");
		
		jbDelay = new JButton("延迟入住");
		GroupLayout gl_jpButton = new GroupLayout(jpButton);
		gl_jpButton.setHorizontalGroup(
			gl_jpButton.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jpButton.createSequentialGroup()
					.addContainerGap(577, Short.MAX_VALUE)
					.addComponent(jbDetail)
					.addGap(18)
					.addComponent(jbCheckIn, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jbCheckOut, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jbDelay, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
		);
		gl_jpButton.setVerticalGroup(
			gl_jpButton.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpButton.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpButton.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbCheckIn)
						.addComponent(jbCheckOut)
						.addComponent(jbDelay)
						.addComponent(jbDetail))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		jpButton.setLayout(gl_jpButton);
		GroupLayout gl_jpTable = new GroupLayout(jpTable);
		gl_jpTable.setHorizontalGroup(
			gl_jpTable.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1039, Short.MAX_VALUE)
		);
		gl_jpTable.setVerticalGroup(
			gl_jpTable.createParallelGroup(Alignment.LEADING)
				.addGap(0, 553, Short.MAX_VALUE)
		);
		jpTable.setLayout(gl_jpTable);
		
		orderListModel = new OrderListTable();
		jtOrderList = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BA2\u5355\u53F7", "\u4E0B\u5355\u65F6\u95F4", "\u7528\u6237\u540D", "\u623F\u95F4\u7C7B\u578B", "\u623F\u95F4\u6570\u91CF", "\u91D1\u989D", "\u8BA2\u5355\u72B6\u6001"
			}
		) {
			Class[] columnTypes = new Class[] {
				int.class, Date.class, String.class, String.class, int.class, int.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jtOrderList.setSize(1065, 477);
		jspTable = new JScrollPane(jtOrderList);
		jpTable.add(jspTable);
		
		
		jlOrderType = new JLabel("选择订单类型");
		
		jcbSearch = new JComboBox();
		
		jlSearch = new JLabel("搜        索");
		
		jcbOrderType = new JComboBox();
		
		jtfSearch = new JTextField();
		jtfSearch.setColumns(10);
		
		jbConfirm = new JButton("确认");
		GroupLayout gl_jpSearch = new GroupLayout(jpSearch);
		gl_jpSearch.setHorizontalGroup(
			gl_jpSearch.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpSearch.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpSearch.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpSearch.createSequentialGroup()
							.addGroup(gl_jpSearch.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_jpSearch.createSequentialGroup()
									.addComponent(jlOrderType)
									.addGap(18)
									.addComponent(jcbSearch, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_jpSearch.createSequentialGroup()
									.addComponent(jlSearch)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(jcbOrderType, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGap(26)
							.addComponent(jtfSearch, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
						.addComponent(jbConfirm, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(441, Short.MAX_VALUE))
		);
		gl_jpSearch.setVerticalGroup(
			gl_jpSearch.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpSearch.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpSearch.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlOrderType)
						.addComponent(jcbSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jpSearch.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlSearch)
						.addComponent(jcbOrderType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jtfSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(jbConfirm)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpSearch.setLayout(gl_jpSearch);
		setLayout(groupLayout);
	}
}
