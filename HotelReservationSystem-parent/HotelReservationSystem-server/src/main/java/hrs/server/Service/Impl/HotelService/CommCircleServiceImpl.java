package hrs.server.Service.Impl.HotelService;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.CommercialCircleVO;
import hrs.server.DAO.Interface.HotelDAO.CommCircleDAO;
import hrs.server.Service.Interface.HotelService.CommCircleService;

public class CommCircleServiceImpl implements CommCircleService {
	private CommCircleDAO dao;
	
	public void setDao(CommCircleDAO dao) {
		this.dao = dao;
	}
	@Transactional
	@Override
	public List<CommercialCircleVO> findByLoc(int locID) {
		// TODO Auto-generated method stub
		return null;
	}

}
