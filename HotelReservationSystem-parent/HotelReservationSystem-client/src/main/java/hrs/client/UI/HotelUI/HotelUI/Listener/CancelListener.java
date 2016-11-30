package hrs.client.UI.HotelUI.HotelUI.Listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import hrs.client.UI.HotelUI.HotelUI.HotelUIPanel;
import hrs.common.VO.HotelVO;

public class CancelListener implements MouseListener{
	
	HotelUIPanel jpHotelInfo;
	
	public CancelListener(HotelUIPanel jpHotelInfo){
		this.jpHotelInfo = jpHotelInfo;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		jpHotelInfo.show();
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
