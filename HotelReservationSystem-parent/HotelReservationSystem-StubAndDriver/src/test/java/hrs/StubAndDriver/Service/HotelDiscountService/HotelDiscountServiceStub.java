package hrs.StubAndDriver.Service.HotelDiscountService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.HotelDiscountDAO.HotelDiscountDAOStub;
import hrs.client.Service.HotelDiscountService.HotelDiscountService;
import hrs.client.VO.HotelDiscountVO;
import hrs.common.DAO.HotelDiscountDAO.HotelDiscountDAO;
import hrs.common.PO.HotelDiscountPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;

public class HotelDiscountServiceStub implements HotelDiscountService {
	private HotelDiscountDAO hoteldiscountDAO = new HotelDiscountDAOStub();

	@Override
	public ResultMessage add(HotelDiscountVO vo) {
		HotelDiscountPO po = new HotelDiscountPO();
		BeanUtils.copyProperties(vo, po);
		return hoteldiscountDAO.add(po);
	}

	@Override
	public ResultMessage update(HotelDiscountVO hoteldiscountvo) {
		HotelDiscountPO po = new HotelDiscountPO();
		BeanUtils.copyProperties(hoteldiscountvo, po);
		return hoteldiscountDAO.update(po);
	}

	@Override
	public ResultMessage delete(int id) {
		return hoteldiscountDAO.delete(id);
	}

	@Override
	public List<HotelDiscountVO> findAllByHotelID(int hotelID) {
		List<HotelDiscountPO> po = hoteldiscountDAO.findAllByHotelID(hotelID);
		List<HotelDiscountVO> vo = new ArrayList<>(po.size());
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

	@Override
	public List<HotelDiscountType> findNotAddedType(int hotelID) {
		List<HotelDiscountType> list = new ArrayList<>();
		HotelDiscountType[] types = HotelDiscountType.values();
		for(int i = 0; i < types.length ;i++){
			list.add(types[i]);
		}
		List<HotelDiscountVO> vos = findAllByHotelID(hotelID);
		for(HotelDiscountVO vo:vos){
			list.remove(vo.type);
		}
		return list;
	}
}
