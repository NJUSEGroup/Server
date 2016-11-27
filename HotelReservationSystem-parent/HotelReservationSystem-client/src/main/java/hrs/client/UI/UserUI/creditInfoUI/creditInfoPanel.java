package hrs.client.UI.UserUI.creditInfoUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import hrs.client.util.ControllerFactory;
import hrs.common.Controller.UserController.IUserController;
import hrs.common.Exception.CreditRecordService.CreditRecordNotFoundException;
import hrs.common.VO.CreditRecordVO;

public class creditInfoPanel extends JPanel {
	private IUserController controller = ControllerFactory.getUserController();
	
	private String username;
	private JScrollPane scrollPane;
	private JPanel contentPane; 
	
	public creditInfoPanel(String username){
		
		this.username = username;
		
		setLayout(null);
		setBackground(new Color(211, 237, 249));
		setSize(1043,688);
		
		//创建表格
		JTable table = new JTable();
		List<CreditRecordVO> creditList = getCreditList();//需要显示的数据
		creditTableModel model = new creditTableModel(creditList);
		table.setModel(model);
		table.setBackground(new Color(211, 237, 249));//背景色
		table.setFont(new Font("微软雅黑",Font.PLAIN,24));//字体
		table.setRowHeight(40);//行高
		table.setShowVerticalLines(false);//不显示数列线
		table.setShowHorizontalLines(false);

		
		
		//设置表头
		JTableHeader tableHeader = table.getTableHeader(); 
		tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(),40)); //设定表头高度
		tableHeader.setBackground(new Color(222, 237, 249));//设定表头背景色
		tableHeader.setEnabled(false);//设置表头不可编辑
		tableHeader.setBorder(new EmptyBorder(0,0,0,0));
		tableHeader.setFont(new Font("微软雅黑",Font.PLAIN,24));
		
//		contentPane=new JPanel();
//		contentPane.setBackground(new Color(211, 237, 249));
//		contentPane.setSize(1043,600);
//		contentPane.setBounds(0, 0, 1043,600);
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		scrollPane.setBounds(0, 0, 1043,600);
		scrollPane.setBorder(new EmptyBorder(0,0,0,0));
		scrollPane.getViewport().setBackground(new Color(211, 237, 249));
		scrollPane.setOpaque(true);


//		contentPane.add(table);
		
		add(scrollPane);
	}

	private List<CreditRecordVO> getCreditList() {
		List<CreditRecordVO> list = new ArrayList<>();
		try {
			list = controller.findCreditRecordByUsername(this.username);
			if(list.isEmpty())
			System.out.println("空");
		} catch (CreditRecordNotFoundException e) {
			System.out.println("搜索信用记录发生错误");
			e.printStackTrace();
		}
		return list;
	}
}
