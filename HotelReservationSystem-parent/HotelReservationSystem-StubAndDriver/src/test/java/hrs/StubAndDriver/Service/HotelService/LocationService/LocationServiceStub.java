package hrs.StubAndDriver.Service.HotelService.LocationService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.HotelDAO.LocationDAO.LocationDAOStub;
import hrs.common.VO.LocationVO;
import hrs.server.DAO.Interface.HotelDAO.LocationDAO;
import hrs.server.POJO.LocationPO;
import hrs.server.Service.Interface.HotelService.LocationService;

public class LocationServiceStub implements LocationService{
	private LocationDAO dao;
	public LocationServiceStub() {
		dao = new LocationDAOStub();
	}
	@Override
	public List<LocationVO> findAll() {
		List<LocationPO> pos = dao.findAll();
		if(pos == null){
			return null;
		}
		List<LocationVO> vos = new ArrayList<>();
		LocationVO vo;
		for(LocationPO po :pos){
			vo = new LocationVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}
	
}
