package hrs.StubAndDriver.Service.WebDiscountService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.WebDiscountDAO.WebDiscountDAOStub;
import hrs.client.Service.PromotionService.WebDiscountService;
import hrs.client.VO.WebDiscountVO;
import hrs.common.DAO.WebDiscountDAO;
import hrs.common.PO.WebDiscountPO;
import hrs.common.util.ResultMessage;

public class WebDiscountServiceStub implements WebDiscountService {
	private WebDiscountDAO dao;
	
	public WebDiscountServiceStub(){
		dao = new WebDiscountDAOStub();
	}
	
	@Override
	public List<WebDiscountVO> findAll() {
		List<WebDiscountPO> pos = dao.findAll();
		if(pos == null){
			return null;
		}
		List<WebDiscountVO> vos = new ArrayList<>(pos.size());
		WebDiscountVO vo = null;
		for(WebDiscountPO po:pos){
			vo = new WebDiscountVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public ResultMessage add(WebDiscountVO webdiscountvo) {
		WebDiscountPO po = new WebDiscountPO();
		BeanUtils.copyProperties(webdiscountvo, po);
		return dao.add(po);
	}

	@Override
	public ResultMessage update(WebDiscountVO webdiscountvo) {
		WebDiscountPO po = new WebDiscountPO();
		BeanUtils.copyProperties(webdiscountvo, po);
		return dao.update(po);
	}

	@Override
	public ResultMessage delete(int id) {
		return dao.delete(id);
	}

}
