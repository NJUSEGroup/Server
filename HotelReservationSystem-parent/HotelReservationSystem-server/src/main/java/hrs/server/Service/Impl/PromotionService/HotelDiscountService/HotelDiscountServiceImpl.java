package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.Promotion.HotelDiscountService.HotelDiscountNotFoundException;
import hrs.common.POJO.HotelDiscountPO;
import hrs.common.VO.HotelDiscountVO;
import hrs.server.DAO.Interface.PromotionDAO.HotelDiscountDAO;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;
import hrs.server.util.DateHelper;

@Service
public class HotelDiscountServiceImpl implements HotelDiscountService {
	@Autowired
	private HotelDiscountDAO dao;

	@Transactional
	@Override
	public void add(HotelDiscountVO vo) {
		try {
			if (vo.beginTime != null && vo.endTime != null) {
				vo.beginTime = DateHelper.parse(DateHelper.format(vo.beginTime));
				vo.endTime = DateHelper.parse(DateHelper.format(vo.endTime));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dao.add(new HotelDiscountPO(vo));
	}

	@Transactional
	@Override
	public void update(HotelDiscountVO vo) {
		dao.update(new HotelDiscountPO(vo));
	}

	@Transactional
	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Transactional
	@Override
	public List<HotelDiscountVO> findAllByHotelID(int hotelID) throws HotelDiscountNotFoundException {
		List<HotelDiscountPO> pos = dao.findAllByHotelID(hotelID);
		List<HotelDiscountVO> vos = null;
		if (pos.size() == 0) {
			throw new HotelDiscountNotFoundException();
		} else {
			vos = new ArrayList<>();
			HotelDiscountVO vo = null;
			for (HotelDiscountPO po : pos) {
				vo = new HotelDiscountVO(po);
				vos.add(vo);
			}
		}
		return vos;
	}

	/**
	 * 使用反射实现动态性
	 * @throws HotelDiscountNotFoundException 
	 */
	@Transactional
	@Override
	public List<HotelDiscount> createAllStrategies(int hotelID) {
		List<HotelDiscountVO> vos;
		try {
			vos = findAllByHotelID(hotelID);
		} catch (HotelDiscountNotFoundException e1) {
			return new ArrayList<>();
		}
		List<HotelDiscount> strategies = new ArrayList<>();
		Class<?> clazz = null;
		HotelDiscount strategy = null;
		try {
			for (HotelDiscountVO vo : vos) {
				clazz = Class.forName("hrs.server.Service.Impl.PromotionService.HotelDiscountService."
						+ vo.type.toString() + "HotelDiscount");
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
