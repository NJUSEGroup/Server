package hrs.server.Service.Impl.HotelService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.POJO.CommercialCirclePO;
import hrs.common.VO.CommercialCircleVO;
import hrs.server.DAO.Interface.HotelDAO.CommCircleDAO;
import hrs.server.Service.Interface.HotelService.CommCircleService;
@Service
public class CommCircleServiceImpl implements CommCircleService {
	@Autowired
	private CommCircleDAO dao;
	
	
	@Transactional
	@Override
	public List<CommercialCircleVO> findByLoc(int locID) {
		List<CommercialCirclePO> pos = dao.findByLoc(locID);
		List<CommercialCircleVO> vos = new ArrayList<>();
		CommercialCircleVO vo = null;
		for(CommercialCirclePO po:pos){
			vo = new CommercialCircleVO(po);
			vos.add(vo);
		}
		return vos;
	}
	

}
