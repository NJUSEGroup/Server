package hrs.client.UI.HotelUI.RoomUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import hrs.client.UI.HotelUI.Components.AddRoomDialog;
import hrs.client.UI.HotelUI.Components.RoomTableModel;
import hrs.client.UI.HotelUI.RoomUI.Listener.AddListener;
import hrs.client.util.ControllerFactory;
import hrs.common.Controller.HotelController.IRoomController;
import hrs.common.Exception.RoomService.RoomNotFoundException;
import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.type.RoomType;

public class RoomUIPanel extends JPanel {

	private JPanel jpRoom;
	private JPanel jpButton;
	private JScrollPane jspRoom;
	private JTable jtRoom;
	private JTableHeader jthOrderList;
	private RoomTableModel roomTableModel;
	private JButton jbAdd;
	private HotelVO hotel;
	private IRoomController roomController;
	private AddListener addListener;
	
	/**
	 * Create the panel.
	 * @throws RoomNotFoundException 
	 */
	public RoomUIPanel(HotelVO hotel) throws RoomNotFoundException{
		init(hotel);
	}
	
	public void init(HotelVO hotel) throws RoomNotFoundException{
		this.hotel = hotel;
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
		
		roomController = ControllerFactory.getRoomController();
		List<RoomVO> rooms= roomController.findByHotelID(hotel.id);
		
		roomTableModel = new RoomTableModel(rooms);
		
		jtRoom = new JTable(roomTableModel);
		jtRoom.setBackground(new Color(211, 237, 249));
		jtRoom.setFont(new Font("方正兰亭超细黑简体",Font.PLAIN,16));
		jtRoom.setRowHeight(40);
		jtRoom.setShowVerticalLines(false);
		
		jthOrderList = jtRoom.getTableHeader(); 
		jthOrderList.setPreferredSize(new Dimension(jtRoom.getWidth(),40)); 
		jthOrderList.setBackground(new Color(222, 237, 249));
		jthOrderList.setEnabled(false);
		jthOrderList.setBorder(new EmptyBorder(0,0,0,0));
		jthOrderList.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 16));
		
		jspRoom = new JScrollPane(jtRoom);
		jspRoom.setBounds(10, 10, 1060, 622);
		jspRoom.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jspRoom.setOpaque(false);
		jspRoom.getViewport().setOpaque(false);
		jspRoom.setBackground(Color.WHITE);
		
		addListener = new AddListener(this);
		
		jbAdd = new JButton();
		jbAdd.setBounds(887, 13, 90, 40);
		jbAdd.setText("添加");
		jbAdd.setFont(new Font("方正兰亭超细黑简体", Font.PLAIN, 19));
		jbAdd.addMouseListener(addListener);
		
		jpRoom.add(jspRoom);
		
		jpButton.add(jbAdd);
		
		this.add(jpRoom);
		this.add(jpButton);
	}
	
	public void addRoom(){
		List<RoomType> notAddedRoom = roomController.findNotAddedRoomType(hotel.id);
		
		AddRoomDialog addRoomDialog = new AddRoomDialog(notAddedRoom, hotel);
	}
}
