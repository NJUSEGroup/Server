package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.HotelDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;
import hrs.server.DAO.Interface.PromotionDAO.HotelDiscountDAO;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;

public class HotelDiscountServiceImpl implements HotelDiscountService {
	private HotelDiscountDAO dao;

	@Transactional
	@Override
	public ResultMessage add(HotelDiscountVO hoteldiscountvo) {
		return null;
	}

	@Transactional
	@Override
	public ResultMessage update(HotelDiscountVO hoteldiscountvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<HotelDiscountVO> findAllByHotelID(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<HotelDiscountType> findNotAddedType(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 使用反射实现动态性
	 */
	@Transactional
	@Override
	public List<HotelDiscount> createAllStrategies(int hotelID) {
		List<HotelDiscountVO> vos = findAllByHotelID(hotelID);
		List<HotelDiscount> strategies = new ArrayList<>();
		Class<?> clazz = null;
		HotelDiscount strategy = null;
		try {
			for (HotelDiscountVO vo : vos) {
				clazz = Class.forName(vo.type.toString() + "HotelDiscount");
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

	public void setDao(HotelDiscountDAO dao) {
		this.dao = dao;
	}
}
