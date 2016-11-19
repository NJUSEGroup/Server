package hrs.server.Service.Interface.PromotionService;

import java.util.List;

import hrs.common.VO.EnterpriseVO;

public interface EnterpriseService {
	List<EnterpriseVO> getAllEnterprises();
	void add(EnterpriseVO vo);
}
