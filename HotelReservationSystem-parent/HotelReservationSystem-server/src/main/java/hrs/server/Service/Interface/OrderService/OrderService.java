package hrs.server.Service.Interface.OrderService;

import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;

public interface OrderService {

	OrderVO placeOrder(OrderVO ordervo);
	ResultMessage add(OrderVO ordervo);
	ResultMessage checkin(OrderVO ordervo);
	ResultMessage checkout(OrderVO ordervo);
	ResultMessage revoke(OrderVO ordervo);
	ResultMessage remark(OrderVO ordervo);
	ResultMessage delayCheckin(OrderVO ordervo);
	void checkAbNormal();
}
