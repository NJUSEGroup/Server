package hrs.client.UI.HotelUI.RoomUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RoomUIPanel extends JPanel {

	private JPanel jpRoom;
	private JPanel jpButton;
	private JButton jbAdd;
	
	/**
	 * Create the panel.
	 */
	public RoomUIPanel() {
		init();
	}
	
	public void init(){
		this.setSize(1080, 722);
		this.setLayout(null);
		
		jpRoom = new JPanel();
		jpRoom.setBounds(0, 0, 1080, 642);
		jpRoom.setBackground(new Color(211, 237, 249));
		jpRoom.setLayout(null);
		
		jpButton = new JPanel();
		jpButton.setBounds(0, 642, 1080, 80);
		jpButton.setBackground(new Color(211, 237, 249));
		jpButton.setLayout(null);
		
		jbAdd = new JButton();
		jbAdd.setBounds(887, 13, 90, 40);
		jbAdd.setText("添加");
		jbAdd.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		
		jpButton.add(jbAdd);
		
		this.add(jpRoom);
		this.add(jpButton);
	}

}
