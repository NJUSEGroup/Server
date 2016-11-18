package hrs.server.Service.Interface.OrderService;

import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RestoreValueType;

public interface OrderService {

	OrderVO placeOrder(OrderVO ordervo);
	ResultMessage add(OrderVO ordervo);
	ResultMessage checkin(OrderVO ordervo);
	ResultMessage checkout(OrderVO ordervo);
	ResultMessage revokeByUser(OrderVO ordervo);
	ResultMessage revokeByWebMarketer(OrderVO ordervo,RestoreValueType type);
	ResultMessage remark(OrderVO ordervo,int score, String evaluation);
	ResultMessage delayCheckin(OrderVO ordervo);
	void checkAbNormalOrder();
}
