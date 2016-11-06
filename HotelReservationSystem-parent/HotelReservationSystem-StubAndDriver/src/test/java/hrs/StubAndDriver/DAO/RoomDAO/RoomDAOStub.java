package hrs.StubAndDriver.DAO.RoomDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;
import hrs.server.POJO.HotelPO;
import hrs.server.POJO.RoomPO;

public class RoomDAOStub implements RoomDAO {

	private RoomPO room;

	public RoomDAOStub() {
		HotelPO po = new HotelPO();
		po.setId(0);
		room = new RoomPO(po, RoomType.Single, 0, 0);

	}

	@Override
	public RoomPO findByHotelAndType(int hotelID, RoomType type) {
		return room;
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
	public List<RoomPO> findByHotel(int hotelID) {
		List<RoomPO> list = new ArrayList<>();
		list.add(room);
		return list;
	}

	@Override
	public int findAvailableRoom(int hotelID, RoomType type, Date date) {
		return 1;
	}
}
