package hrs.server.Service.Impl.PromotionService.WebDiscountService;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.WebDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.WebDiscountDAO;
import hrs.server.Service.Interface.PromotionService.WebDiscountService;

public class WebDiscountServiceImpl implements WebDiscountService {
	private WebDiscountDAO dao;

	public void setDao(WebDiscountDAO dao) {
		this.dao = dao;
	}

	@Transactional
	@Override
	public List<WebDiscountVO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage add(WebDiscountVO webdiscountvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage update(WebDiscountVO webdiscountvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
