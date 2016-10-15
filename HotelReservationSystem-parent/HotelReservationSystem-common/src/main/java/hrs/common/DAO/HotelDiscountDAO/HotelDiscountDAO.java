package hrs.common.DAO.HotelDiscountDAO;

import java.util.List;

import hrs.common.PO.HotelDiscountPO;
import hrs.common.util.ResultMessage;

public interface HotelDiscountDAO {
	 ResultMessage add (HotelDiscountPO hoteldiscountpo);
	 ResultMessage update(HotelDiscountPO hoteldiscountpo);
	 ResultMessage delete(int id);
	 List<HotelDiscountPO> findAllByHotelID(int hotelID);
}
