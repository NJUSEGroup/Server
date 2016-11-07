package hrs.server.Service.Impl.HotelService;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.LocationVO;
import hrs.server.DAO.Interface.HotelDAO.LocationDAO;
import hrs.server.Service.Interface.HotelService.LocationService;

public class LocationServiceImpl implements LocationService{
	private LocationDAO dao;
	
	public void setDao(LocationDAO dao) {
		this.dao = dao;
	}
	@Transactional
	@Override
	public List<LocationVO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
