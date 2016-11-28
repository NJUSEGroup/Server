package hrs.client.UI.HotelUI.HotelUI.Listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import hrs.client.UI.HotelUI.HotelUI.HotelUIPanel;
import hrs.client.util.ControllerFactory;
import hrs.common.Controller.HotelController.IHotelController;
import hrs.common.VO.HotelVO;

public class EditListener implements MouseListener{
	
	private IHotelController hotelController;
	private HotelVO hotel;
	
	public EditListener(HotelVO hotel){
		this.hotelController = ControllerFactory.getHotelController();
		this.hotel = hotel;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		hotelController.updateHotel(hotel);
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
