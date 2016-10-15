package hrs.StubAndDriver.DAO.RoomDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hrs.common.DAO.RoomDAO;
import hrs.common.PO.RoomPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public class RoomDAOStub implements RoomDAO{
	private Map<Integer,RoomPO> map;
	private RoomPO rp;
	private List<RoomPO> l;
	public RoomDAOStub(){
		rp = new RoomPO(1,RoomType.Single, 0, 0);
		l = new ArrayList<RoomPO>();
		map = new HashMap<>();
		map.put(1, rp);
		
	}
	@Override
	public RoomPO findByHotelAndType(int hotelID,RoomType type){
		return map.get(hotelID);
	}
	@Override
	public ResultMessage update(RoomPO roompo){
		map.put(roompo.getHotelId(), roompo);
		return ResultMessage.SUCCESS;
	}
	@Override
	public ResultMessage add(RoomPO roompo){
		if(findByHotelAndType(roompo.getHotelId(),roompo.getType()) == null){
			map.put(roompo.getHotelId(), roompo);
				return ResultMessage.SUCCESS;
		}else{
			return ResultMessage.EXISTED;
		}
	}
	@Override
	public List<RoomPO> findByHotelID(int hotelID){
		l.add(rp);
		return l;
	}
}
