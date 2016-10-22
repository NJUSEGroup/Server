package hrs.server.DAO.Interface.HotelDAO;

import java.util.List;

import hrs.server.POJO.CommercialCirclePO;

public interface CommCircleDAO {
	List<CommercialCirclePO> findByLoc(int locID);
}
