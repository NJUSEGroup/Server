package hrs.server.Service.Impl.PromotionService;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.EnterpriseVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.EnterpriseDAO;
import hrs.server.Service.Interface.PromotionService.EnterpriseService;

public class EnterpriseServiceImpl implements EnterpriseService{
	private EnterpriseDAO dao;
	
	public void setDao(EnterpriseDAO dao) {
		this.dao = dao;
	}
	@Transactional
	@Override
	public List<EnterpriseVO> getAllEnterprises() {
		return null;
	}
	@Transactional
	@Override
	public ResultMessage add(EnterpriseVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
