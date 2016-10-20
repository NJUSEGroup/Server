package hrs.StubAndDriver.Service.HotelDiscountService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.HotelDiscountDAO.EnterpriseDAOStub;
import hrs.client.Service.HotelDiscountService.EnterpriseService;
import hrs.client.VO.EnterpriseVO;
import hrs.common.DAO.HotelDiscountDAO.EnterpriseDAO;
import hrs.common.PO.EnterprisePO;

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

}
