package hrs.client.UI.HotelUI.HotelDiscountUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HotelDiscountUIPanel extends JPanel {

	private JPanel jpDiscount;
	private JPanel jpButton;
	private JButton jbAdd;
	private JButton jbEdit;
	private JButton jbDelete;
	
	/**
	 * Create the panel.
	 */
	public HotelDiscountUIPanel() {
		init();
	}
	
	public void init(){
		this.setSize(1080, 722);
		this.setLayout(null);
		
		jpDiscount = new JPanel();
		jpDiscount.setBounds(0, 0, 1080, 642);
		jpDiscount.setBackground(new Color(211, 237, 249));
		jpDiscount.setLayout(null);
		
		jpButton = new JPanel();
		jpButton.setBounds(0, 642, 1080, 80);
		jpButton.setBackground(new Color(211, 237, 249));
		jpButton.setLayout(null);
		
		jbAdd = new JButton();
		jbAdd.setBounds(570, 13, 90, 40);
		jbAdd.setText("添加");
		jbAdd.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jbEdit = new JButton();
		jbEdit.setBounds(710, 13, 90, 40);
		jbEdit.setText("修改");
		jbEdit.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jbDelete = new JButton();
		jbDelete.setBounds(850, 13, 90, 40);
		jbDelete.setText("删除");
		jbDelete.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jpButton.add(jbAdd);
		jpButton.add(jbEdit);
		jpButton.add(jbDelete);
		
		this.add(jpDiscount);
		this.add(jpButton);
	}

}
