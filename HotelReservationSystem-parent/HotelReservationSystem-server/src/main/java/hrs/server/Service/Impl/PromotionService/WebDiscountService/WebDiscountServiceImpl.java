package hrs.server.Service.Impl.PromotionService.WebDiscountService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.Promotion.WebDiscountService.WebDiscountNotFoundException;
import hrs.common.POJO.WebDiscountPO;
import hrs.common.VO.WebDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.WebDiscountDAO;
import hrs.server.Service.Interface.PromotionService.WebDiscountService;
@Service
public class WebDiscountServiceImpl implements WebDiscountService {
	@Autowired
	private WebDiscountDAO dao;


	@Transactional
	@Override
	public List<WebDiscountVO> findAll() {
		List<WebDiscountPO> pos = dao.findAll();
		List<WebDiscountVO> vos = null;
		if(pos.size() == 0){
			throw new WebDiscountNotFoundException();
		}else{
			vos = new ArrayList<>();
			WebDiscountVO vo = null;
			for(WebDiscountPO po:pos){
				vo = new WebDiscountVO(po);
				vos.add(vo);
			}
		}
		return vos;
	}

	@Transactional
	@Override
	public ResultMessage add(WebDiscountVO vo) {
		return dao.add(new WebDiscountPO(vo));
	}

	@Transactional
	@Override
	public ResultMessage update(WebDiscountVO vo) {
		return dao.update(new WebDiscountPO(vo));
	}

	@Transactional
	@Override
	public ResultMessage delete(int id) {
		return dao.delete(id);
	}

	@Override
	public List<WebDiscount> createAllStrategies() {
		
		return null;
	}
}
