package hrs.client.UI.HotelUI.HotelFrame.Listener;


import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import android.graphics.Color;
import hrs.client.UI.HotelUI.HotelFrame.HotelFrame;
import hrs.client.UI.HotelUI.HotelUI.HotelUIPanel;
import hrs.client.util.ControllerFactory;
import hrs.common.Controller.HotelController.IHotelController;
import hrs.common.Exception.HotelService.HotelNotFoundException;
import hrs.common.VO.HotelVO;
import hrs.common.VO.StaffVO;

public class HotelUIListener implements MouseListener{
	
	private HotelFrame frame;
	
	public HotelUIListener(HotelFrame frame){
		this.frame = frame;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		frame.showHotelInfo();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
