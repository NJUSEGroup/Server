package hrs.client.UI.HotelUI.HotelUI.Listener;


import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import android.graphics.Color;
import hrs.client.UI.HotelUI.HotelUI.HotelUI;
import hrs.client.util.ControllerFactory;
import hrs.common.Controller.HotelController.IHotelController;
import hrs.common.Exception.HotelService.HotelNotFoundException;
import hrs.common.VO.HotelVO;
import hrs.common.VO.StaffVO;

public class HotelUIListener implements MouseListener{
	private CardLayout card;
	private JPanel cardPane;
	private HotelUI hotelui;
	//private IHotelController controller;
	//private HotelVO hotelvo;
	
	public HotelUIListener(CardLayout card, JPanel cardPane, HotelUI hotelui){
		this.card = card;
		this.cardPane = cardPane;
		//this.controller = ControllerFactory.getHotelController();
		this.hotelui = hotelui;
		//this.hotelvo = staffvo.hotel;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		card.show(cardPane,"1");
		//hotelui.jtfHotelName.setText(hotelvo.name);
		//hotelui.jcbCity.setSelectedItem(hotelvo.location.name);
		//hotelui.jcbCircle.setSelectedItem(hotelvo.commercialCircle.name);
		//hotelui.jtfAddress.setText(hotelvo.street);
		//hotelui.jtaIntro.setText(hotelvo.profile);
		//hotelui.jtaService.setText(hotelvo.service);
		//hotelui.jcbStar.setSelectedItem(Integer.toString(hotelvo.star));
		//hotelui.jtfScore.setText(Double.toString(hotelvo.score));
		//hotelui.jtfHotelName.setText("一个酒店");//test
		//hotelui.jcbCity.setSelectedItem("南京");//test
		//hotelui.jcbCircle.setSelectedItem("栖霞区");//test
		//hotelui.jtfAddress.setText("仙林大道163号");//test
		//hotelui.jtaIntro.setText("哈哈哈");//test
		//hotelui.jtaService.setText("略略略");//test
		//hotelui.jcbStar.setSelectedItem(3);//test
		//hotelui.jtfScore.setText("9.8");//test
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
