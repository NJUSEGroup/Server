package hrs.Mock.HotelDiscountService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.HotelDiscountDAO.HotelDiscountDAOStub;
import hrs.common.VO.HotelDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;
import hrs.server.DAO.Interface.PromotionDAO.HotelDiscountDAO;
import hrs.server.POJO.HotelDiscountPO;
import hrs.server.Service.Impl.PromotionService.HotelDiscountService.HotelDiscount;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;

public class HotelDiscountServiceMock implements HotelDiscountService {
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
		List<HotelDiscountPO> pos = hoteldiscountDAO.findAllByHotelID(hotelID);
		if(pos == null){
			return null;
		}
		List<HotelDiscountVO> vos = new ArrayList<>(pos.size());
		HotelDiscountVO vo = null;
		for(HotelDiscountPO po:pos){
			vo = new HotelDiscountVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
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

	@Override
	public List<HotelDiscount> createAllStrategies(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}
}
