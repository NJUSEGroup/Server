package hrs.server.DAO.Interface.HotelDAO;

import java.util.List;

import hrs.server.POJO.LocationPO;

public interface LocationDAO {
	List<LocationPO> findAll();
}	
