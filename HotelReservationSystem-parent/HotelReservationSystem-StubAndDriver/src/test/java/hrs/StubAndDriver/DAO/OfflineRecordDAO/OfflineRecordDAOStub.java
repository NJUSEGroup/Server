package hrs.StubAndDriver.DAO.OfflineRecordDAO;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import hrs.common.POJO.HotelPO;
import hrs.common.POJO.OfflineRecordPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public class OfflineRecordDAOStub implements hrs.server.DAO.Interface.OfflineRecordDAO{
	private Map<Integer, OfflineRecordPO> map;
	private Date date;
	public OfflineRecordDAOStub(){
		map = new HashMap<>();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 15, 8, 0, 0);
		date = c.getTime();
		HotelPO hotel = new HotelPO();
		hotel.setId(1);
		map.put(0, new OfflineRecordPO(0, hotel, date, date, null, RoomType.Single, 1));
	}
	
	@Override
	public OfflineRecordPO findByID(int id) {
		return map.get(id);
	}

	@Override
	public ResultMessage add(OfflineRecordPO offlinerecordpo) {
		map.put(offlinerecordpo.getId(), offlinerecordpo);
		return ResultMessage.SUCCESS;
	}


	@Override
	public ResultMessage update(OfflineRecordPO offlinerecordpo) {
		// TODO Auto-generated method stub
		return null;
	}

}
