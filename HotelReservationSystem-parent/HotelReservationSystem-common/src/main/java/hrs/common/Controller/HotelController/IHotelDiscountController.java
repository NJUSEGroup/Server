package hrs.common.Controller.HotelController;

import java.util.List;

import hrs.common.VO.EnterpriseVO;
import hrs.common.VO.HotelDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;

public interface IHotelDiscountController {
	List<EnterpriseVO> getAllEnterprises();
	ResultMessage add(HotelDiscountVO hoteldiscountvo);
	ResultMessage update(HotelDiscountVO hoteldiscountvo);
	ResultMessage delete(int id);
	List<HotelDiscountVO> findAllByHotelID(int hotelID);
	List<HotelDiscountType> findNotAddedType(int hotelID);
}
