package hrs.StubAndDriver.Service.HotelService.LocationService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.HotelDAO.LocationDAO.LocationDAOStub;
import hrs.client.Service.HotelService.LocationService;
import hrs.client.VO.LocationVO;
import hrs.common.DAO.HotelDAO.LocationDAO;
import hrs.common.PO.LocationPO;

public class LocationServiceStub implements LocationService{
	private LocationDAO dao;
	public LocationServiceStub() {
		dao = new LocationDAOStub();
	}
	@Override
	public List<LocationVO> findAll() {
		List<LocationPO> pos = dao.findAll();
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
