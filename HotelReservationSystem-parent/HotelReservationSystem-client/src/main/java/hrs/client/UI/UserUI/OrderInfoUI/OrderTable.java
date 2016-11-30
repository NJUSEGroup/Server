package hrs.client.UI.UserUI.OrderInfoUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import hrs.common.VO.OrderVO;
import hrs.common.util.constants;
import javafx.scene.control.SelectionModel;

public class OrderTable extends JTable {
	Font font = constants.jlabelChinese;
	private OrderTableModel model;
	public OrderTable(List<OrderVO> orders){
		
		model = new OrderTableModel(orders);
		setModel(model);
		setBackground(new Color(211, 237, 249));//背景色
		setFont(font);//字体
		setRowHeight(40);//行高
		setShowVerticalLines(false);//不显示数列线
//		setShowHorizontalLines(false);
		
		//设置表头
		JTableHeader tableHeader = this.getTableHeader(); 
		tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(),40)); //设定表头高度
		tableHeader.setBackground(new Color(222, 237, 249));//设定表头背景色
		tableHeader.setEnabled(false);//设置表头不可编辑
//		tableHeader.setBorder(new EmptyBorder(0,0,0,0));
		tableHeader.setFont(font);
		((DefaultTableCellRenderer)tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT); 
		
//		tableHeader.
		
		
	}
	
	public void setModel(List<OrderVO> orders){
		model = new OrderTableModel(orders);
		setModel(model);
	}
	
	
}
