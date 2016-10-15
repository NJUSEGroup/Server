package hrs.client.Service.HotelService;

import java.util.List;

import hrs.client.VO.CommercialCircleVO;

public interface CommCircleService {
	List<CommercialCircleVO> findByLoc(int locID);
}
