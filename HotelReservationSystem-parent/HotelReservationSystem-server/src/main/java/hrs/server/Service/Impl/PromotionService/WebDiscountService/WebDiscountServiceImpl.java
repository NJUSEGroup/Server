package hrs.server.Service.Impl.PromotionService.WebDiscountService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.Promotion.WebDiscountService.WebDiscountNotFoundException;
import hrs.common.POJO.WebDiscountPO;
import hrs.common.VO.WebDiscountVO;
import hrs.server.DAO.Interface.PromotionDAO.WebDiscountDAO;
import hrs.server.Service.Interface.PromotionService.WebDiscountService;
import hrs.server.util.DateFormatter;

@Service
public class WebDiscountServiceImpl implements WebDiscountService {
	@Autowired
	private WebDiscountDAO dao;

	@Transactional
	@Override
	public List<WebDiscountVO> findAll() {
		List<WebDiscountPO> pos = dao.findAll();
		List<WebDiscountVO> vos = null;
		if (pos.size() == 0) {
			throw new WebDiscountNotFoundException();
		} else {
			vos = new ArrayList<>();
			WebDiscountVO vo = null;
			for (WebDiscountPO po : pos) {
				vo = new WebDiscountVO(po);
				vos.add(vo);
			}
		}
		return vos;
	}

	@Transactional
	@Override
	public void add(WebDiscountVO vo) {
		try {
			if (vo.beginTime != null && vo.endTime != null) {
				vo.beginTime = DateFormatter.parse(DateFormatter.format(vo.beginTime));
				vo.endTime = DateFormatter.parse(DateFormatter.format(vo.endTime));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dao.add(new WebDiscountPO(vo));
	}

	@Transactional
	@Override
	public void update(WebDiscountVO vo) {
		dao.update(new WebDiscountPO(vo));
	}

	@Transactional
	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Transactional
	@Override
	public List<WebDiscount> createAllStrategies() {
		List<WebDiscountVO> vos = findAll();
		if (vos.size() == 0) {
			return new ArrayList<>();
		}
		List<WebDiscount> strategies = new ArrayList<>();
		Class<?> clazz = null;
		WebDiscount strategy = null;
		try {
			for (WebDiscountVO vo : vos) {
				clazz = Class.forName("hrs.server.Service.Impl.PromotionService.WebDiscountService."
						+ vo.type.toString() + "WebDiscount");
				strategy = (WebDiscount) clazz.newInstance();
				strategy.setWebDiscountVO(vo);
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
