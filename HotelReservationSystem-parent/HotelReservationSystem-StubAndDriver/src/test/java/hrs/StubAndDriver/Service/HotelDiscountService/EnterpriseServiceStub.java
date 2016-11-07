package hrs.StubAndDriver.Service.HotelDiscountService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.HotelDiscountDAO.EnterpriseDAOStub;
import hrs.common.VO.EnterpriseVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.EnterpriseDAO;
import hrs.server.POJO.EnterprisePO;
import hrs.server.Service.Interface.PromotionService.EnterpriseService;

public class EnterpriseServiceStub implements EnterpriseService {
	private EnterpriseDAO enterpriseDAO = new EnterpriseDAOStub();

	@Override
	public List<EnterpriseVO> getAllEnterprises() {
		List<EnterprisePO> pos = enterpriseDAO.findAll();
		List<EnterpriseVO> vos = new ArrayList<>(pos.size());
		EnterpriseVO vo = null;
		for (EnterprisePO po : pos) {
			vo = new EnterpriseVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public ResultMessage add(EnterpriseVO vo) {
		EnterprisePO po = new EnterprisePO();
		BeanUtils.copyProperties(vo, po);
		return enterpriseDAO.add(po);
	}

}
