package hrs.StubAndDriver.Service.HotelService.CommCircleService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.HotelDAO.CommCircleDAO.CommCircleDAOStub;
import hrs.common.POJO.CommercialCirclePO;
import hrs.common.VO.CommercialCircleVO;
import hrs.server.DAO.Interface.HotelDAO.CommCircleDAO;
import hrs.server.Service.Interface.HotelService.CommCircleService;

public class CommCircleServiceStub implements CommCircleService {
	private CommCircleDAO dao;

	public CommCircleServiceStub() {
		dao = new CommCircleDAOStub();
	}

	@Override
	public List<CommercialCircleVO> findByLoc(int locID) {
		List<CommercialCirclePO> pos = dao.findByLoc(locID);
		if(pos == null){
			return null;
		}
		List<CommercialCircleVO> vos = new ArrayList<>();
		CommercialCircleVO vo = null;
		for (CommercialCirclePO po : pos) {
			vo = new CommercialCircleVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

}
