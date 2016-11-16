package hrs.server.Service.Impl.HotelService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.POJO.LocationPO;
import hrs.common.VO.LocationVO;
import hrs.server.DAO.Interface.HotelDAO.LocationDAO;
import hrs.server.Service.Interface.HotelService.LocationService;
@Service
public class LocationServiceImpl implements LocationService{
	@Autowired
	private LocationDAO dao;
	
	
	@Transactional
	@Override
	public List<LocationVO> findAll() {
		List<LocationPO> pos = dao.findAll();
		List<LocationVO> vos = new ArrayList<>();
		LocationVO vo = null;
		for(LocationPO po: pos){
			vo = new LocationVO(po);
			vos.add(vo);
		}
		return vos;
	}

}
