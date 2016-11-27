package hrs.client.UI.HotelUI.Components;


import java.awt.Container;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.*;

import antlr.collections.impl.Vector;

public class OrderListTable extends AbstractTableModel{
	//单元格元素类型
	private Class []cellType = {int.class, Date.class, String.class, String.class, int.class, int.class, String.class};
	//表头
	private String title[] = {"订单号", "下单时间", "用户名", "房间类型", "房间数量", "金额", "订单状态"};
	private Vector data;
	public OrderListTable(){
		
	}
	@Override
	public Class<?> getColumnClass(int arg0){
		// TODO Auto-generated method stub
		return cellType[arg0];
	}
	@Override
	public String getColumnName(int arg0){
		// TODO Auto-generated method stub
		return title[arg0];
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;//要改
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return title.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;//要改！
	}
	public boolean isCellEditable(int r, int c){
		return false;
	}
}
