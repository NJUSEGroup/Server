package hrs.common.DAO.HotelDAO;

import java.util.List;

import hrs.common.PO.CommercialCirclePO;

public interface CommCircleDAO {
	List<CommercialCirclePO> findByLoc(int locID);
}
