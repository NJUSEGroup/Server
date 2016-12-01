package hrs.client.UI.HotelUI.HotelFrame.Listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import hrs.client.UI.HotelUI.HotelFrame.HotelFrame;

public class MenuListListener implements MouseListener{
		
		private HotelFrame frame;
		
		public MenuListListener(HotelFrame frame){
			this.frame = frame;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			String label = ((JLabel) e.getSource()).getText();
			
			frame.show(label);
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
			
			frame.changeColorWhenEnter(e);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
			frame.changeColorWhenExit(e);
		}

}

