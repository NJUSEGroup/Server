package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.Promotion.HotelDiscountService.HotelDiscountNotFoundException;
import hrs.common.POJO.HotelDiscountPO;
import hrs.common.VO.HotelDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.HotelDiscountDAO;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;
@Service
public class HotelDiscountServiceImpl implements HotelDiscountService {
	@Autowired
	private HotelDiscountDAO dao;
	
	@Transactional
	@Override
	public ResultMessage add(HotelDiscountVO vo) {
		return dao.add(new HotelDiscountPO(vo));
	}

	@Transactional
	@Override
	public ResultMessage update(HotelDiscountVO vo) {
		return dao.update(new HotelDiscountPO(vo));
	}

	@Transactional
	@Override
	public ResultMessage delete(int id) {
		return dao.delete(id);
	}

	@Transactional
	@Override
	public List<HotelDiscountVO> findAllByHotelID(int hotelID) {
		List<HotelDiscountPO> pos  = dao.findAllByHotelID(hotelID);
		List<HotelDiscountVO> vos = null;
		if(pos.size() == 0){
			throw new HotelDiscountNotFoundException();
		}else{
			vos = new ArrayList<>();
			HotelDiscountVO vo = null;
			for(HotelDiscountPO po:pos){
				vo = new HotelDiscountVO(po);
				vos.add(vo);
			}
		}
		return vos;
	}

	/**
	 * 使用反射实现动态性
	 */
	@Transactional
	@Override
	public List<HotelDiscount> createAllStrategies(int hotelID) {
		List<HotelDiscountVO> vos = findAllByHotelID(hotelID);
		if(vos.size() == 0){
			return new ArrayList<>();
		}
		List<HotelDiscount> strategies = new ArrayList<>();
		Class<?> clazz = null;
		HotelDiscount strategy = null;
		try {
			for (HotelDiscountVO vo : vos) {
				clazz = Class.forName("hrs.server.Service.Impl.PromotionService.HotelDiscountService."
										+vo.type.toString() + "HotelDiscount");
				strategy = (HotelDiscount) clazz.newInstance();
				strategy.setHotelDiscount(vo);
				strategies.add(strategy);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return strategies;
	}

}
