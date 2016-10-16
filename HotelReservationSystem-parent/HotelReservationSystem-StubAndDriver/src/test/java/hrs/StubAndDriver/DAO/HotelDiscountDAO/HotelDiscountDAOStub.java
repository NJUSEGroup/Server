package hrs.StubAndDriver.DAO.HotelDiscountDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import hrs.common.DAO.HotelDiscountDAO.HotelDiscountDAO;
import hrs.common.PO.HotelDiscountPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;

public class HotelDiscountDAOStub implements HotelDiscountDAO {
	private Map<Integer, HotelDiscountPO> map;

	public HotelDiscountDAOStub() {
		map = new HashMap<>();
		map.put(0, new HotelDiscountPO(0, 0, 0.85, HotelDiscountType.Birthday, 0, 0, null, null));
	}

	@Override
	public ResultMessage add(HotelDiscountPO hoteldiscountpo) {
		map.put(hoteldiscountpo.getId(), hoteldiscountpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage update(HotelDiscountPO hoteldiscountpo) {
		map.put(hoteldiscountpo.getId(), hoteldiscountpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage delete(int id) {// 折扣的ID
		map.remove(id);
		return ResultMessage.SUCCESS;
	}

	@Override
	public List<HotelDiscountPO> findAllByHotelID(int hotelID) {
		List<HotelDiscountPO> list = new ArrayList<>();
		HotelDiscountPO po = null;
		Set<Integer> set = map.keySet();
		for (Integer integer : set) {
			po = map.get(integer);
			if (po.getHotelId() == hotelID)
				list.add(po);
		}
		return list;
	}
}
