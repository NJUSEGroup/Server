package hrs.StubAndDriver.DAO.RoomDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hrs.common.POJO.HotelPO;
import hrs.common.POJO.RoomPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;

public class RoomDAOStub implements RoomDAO {

	private RoomPO room;

	public RoomDAOStub() {
		HotelPO po = new HotelPO();
		po.setId(0);
		room = new RoomPO(po, RoomType.Single, 0, 0);

	}

	
	@Override
	public ResultMessage update(RoomPO roompo) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(RoomPO roompo) {
		// 注意检查是否已存在同类型的房间
		return ResultMessage.SUCCESS;
	}

	@Override
	public List<RoomPO> findByHotelID(int hotelID) {
		List<RoomPO> list = new ArrayList<>();
		list.add(room);
		return list;
	}

	@Override
	public int findAvailableRoom(int hotelID, RoomType type, Date date) {
		return 1;
	}
}
