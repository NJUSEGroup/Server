package hrs.client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.client.Service.OfflineRecordService;
import hrs.client.Service.HotelService.HotelService;
import hrs.client.Service.PromotionService.EnterpriseService;
import hrs.client.Service.PromotionService.HotelDiscountService;
import hrs.client.Service.RoomService.RoomService;
@Controller
public class HotelController {
	@Autowired
	private HotelService hotelService;
	@Autowired
	private RoomService roomService;
	@Autowired
	private HotelDiscountService hotelDiscountService;
	@Autowired
	private EnterpriseService enterpriseService;
	@Autowired
	private OfflineRecordService offlineRecordService;
	
}
