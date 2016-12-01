package hrs.client.UI.HotelUI.HotelOrderUI.Listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import hrs.client.UI.HotelUI.HotelOrderUI.HotelOrderUIPanel;
import hrs.common.Exception.OrderService.OrderNotFoundException;

public class SearchByOrderTypeListener implements MouseListener{

	HotelOrderUIPanel jpHotelOrder;
	
	public SearchByOrderTypeListener(HotelOrderUIPanel jpHotelOrder){
		this.jpHotelOrder = jpHotelOrder;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		try {
			jpHotelOrder.searchByOrderType();
		} catch (OrderNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
