package hrs.server.DAO.Interface.PromotionDAO;

import java.util.List;

import hrs.common.util.ResultMessage;
import hrs.server.POJO.HotelDiscountPO;

public interface HotelDiscountDAO {
	 ResultMessage add (HotelDiscountPO hoteldiscountpo);
	 ResultMessage update(HotelDiscountPO hoteldiscountpo);
	 ResultMessage delete(int id);
	 List<HotelDiscountPO> findAllByHotelID(int hotelID);
}
