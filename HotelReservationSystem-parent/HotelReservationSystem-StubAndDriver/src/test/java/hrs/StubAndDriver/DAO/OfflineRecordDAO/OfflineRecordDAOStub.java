package hrs.StubAndDriver.DAO.OfflineRecordDAO;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import hrs.common.DAO.OfflineRecordDAO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.POJO.OfflineRecordPO;

public class OfflineRecordDAOStub implements OfflineRecordDAO{
	private Map<Integer, OfflineRecordPO> map;
	private Date date;
	public OfflineRecordDAOStub(){
		map = new HashMap<>();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 15, 8, 0, 0);
		date = c.getTime();
		map.put(0, new OfflineRecordPO(0, 1, date, date, null, RoomType.Single, 1));
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
		map.put(offlinerecordpo.getId(), offlinerecordpo);
		return ResultMessage.SUCCESS;
	}

}
