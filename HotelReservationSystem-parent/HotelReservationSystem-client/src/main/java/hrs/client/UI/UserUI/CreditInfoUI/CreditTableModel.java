package hrs.client.UI.UserUI.CreditInfoUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import aj.org.objectweb.asm.Type;
import hrs.common.VO.CreditRecordVO;
import hrs.common.util.DateHelper;
import hrs.common.util.type.CreditRecordType;

public class CreditTableModel implements TableModel {
	private List<CreditRecordVO> creditList;

	public CreditTableModel(List<CreditRecordVO> creditList) {
		this.creditList = creditList;
	}

	@Override
	// 表格的行数（有几个对象就有几行）
	public int getRowCount() {
		// TODO Auto-generated method stub
		return creditList.size();
	}

	@Override
	// 每个creditVO对象有5个值，所以有5列
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	// 取每一列的列名
	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("时间");
		l.add("订单号");
		l.add("动作");
		l.add("信用值变化");
		l.add("当前信用值");
		return l.get(columnIndex);
	}

	// 得到某列的数据类型
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;

	}

	@Override
	// 全部不可编辑
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	// 得到第rowIndex行，第columnIndex列数据
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		CreditRecordVO info = creditList.get(rowIndex);
		
		// 第一列为日期
		if (columnIndex == 0) {
			Date d = info.date;
			String s = DateHelper.format(d);
			return s;
		
		}
		// 第二列为id
		else if (columnIndex == 1)
			return info.order.id;
		// 第三列为动作
		else if (columnIndex == 2) {
			CreditRecordType type = info.type;
			return type.toString();
		}

		// 第四列为信用值变化值
		else if (columnIndex == 3) {
			double x = info.variation;
			String s = "" + x;
			return s;
		}
		// 第五列为当前信用值
		else {
			double x = info.currCredit;
			String s = "" + x;
			return s;
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
