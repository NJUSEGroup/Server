package hrs.server.Service.Impl.PromotionService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.PromotionService.EnterpriseNotFoundException;
import hrs.common.POJO.EnterprisePO;
import hrs.common.VO.EnterpriseVO;
import hrs.server.DAO.Interface.PromotionDAO.EnterpriseDAO;
import hrs.server.Service.Interface.PromotionService.EnterpriseService;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
	
	@Autowired
	
	private EnterpriseDAO dao;
	/**
	 * 
	 * @Title: getAllEnterprises 
	 * @Description:返回所有企业
	 * @return 
	 * @see hrs.server.Service.Interface.PromotionService.EnterpriseService#getAllEnterprises()
	 */
	@Transactional
	@Override
	public List<EnterpriseVO> getAllEnterprises() {
		List<EnterprisePO> pos = dao.findAll();
		List<EnterpriseVO> vos = null;
		if(pos.size() == 0){
			throw new EnterpriseNotFoundException();
		}else{
			EnterpriseVO vo = null;
			vos = new ArrayList<>();
			for(EnterprisePO po:pos){
				vo = new EnterpriseVO(po);
				vos.add(vo);
			}
		}
		return vos;
	}
	
	@Transactional
	@Override
	public void add(EnterpriseVO vo) {
		dao.add(new EnterprisePO(vo));
	}

}
