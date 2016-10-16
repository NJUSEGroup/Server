package hrs.StubAndDriver.Service.RoomService.AvailableRoomService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import hrs.StubAndDriver.DAO.RoomDAO.AvailableRoomDAO.AvailableRoomDAOStub;
import hrs.client.Service.RoomService.AvailableRoomService;
import hrs.common.DAO.HotelDAO.AvailableRoomDAO;
import hrs.common.util.type.RoomType;

public class AvailableRoomServiceStub implements AvailableRoomService{
	private AvailableRoomDAO dao;
	private SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
	public AvailableRoomServiceStub() {
		dao = new AvailableRoomDAOStub();
	}
	@Override
	public int findAvailableRoomNum(int hotelID, RoomType type, Date begin, Date end) {
		int minRoomNum = Integer.MAX_VALUE,roomNum = 0;
		try {
			begin = formatter.parse(formatter.format(begin));
			end = formatter.parse(formatter.format(end));
			while(!begin.equals(end)){
				roomNum = dao.findAvailableRoom(hotelID, type, begin);
				if(roomNum == 0){
					return 0;
				}
				if(roomNum < minRoomNum){
					minRoomNum = roomNum;
				}
				begin = incOneDay(begin);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return minRoomNum;
	}
	
	private Date incOneDay(Date date){
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		c.add(Calendar.DATE	, 1);
		return c.getTime();
	}
}
