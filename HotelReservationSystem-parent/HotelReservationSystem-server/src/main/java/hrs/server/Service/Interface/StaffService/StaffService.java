package hrs.server.Service.Interface.StaffService;

import java.util.List;

import hrs.common.VO.StaffVO;

public interface StaffService {
	StaffVO login(String username, String password);
	void update(StaffVO staffvo);
	void add(StaffVO staffvo);
	StaffVO findByUsername(String username);
	List<StaffVO> findByHotelName(String hotelName);
	
}
