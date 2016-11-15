package hrs.StubAndDriver.DAO.HotelDiscountDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hrs.common.POJO.EnterprisePO;
import hrs.common.POJO.HotelDiscountPO;
import hrs.common.POJO.HotelPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;
import hrs.server.DAO.Interface.PromotionDAO.HotelDiscountDAO;

public class HotelDiscountDAOStub implements HotelDiscountDAO {
	private Map<Integer, HotelDiscountPO> map;

	public HotelDiscountDAOStub() {
		map = new HashMap<>();
		HotelPO hotel = new HotelPO();
		hotel.setId(0);
		EnterprisePO enterprise = new EnterprisePO();
		enterprise.setId(0);
		map.put(0, new HotelDiscountPO(1,hotel , 0.9, HotelDiscountType.Birthday, enterprise, 0 ,null, null));
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
		for (Integer integer : map.keySet()) {
			po = map.get(integer);
			if (po.getHotel().getId() == hotelID)
				list.add(po);
		}
		return list;
	}
}
