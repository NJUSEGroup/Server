package hrs.common.Controller.UserController;

import java.util.List;

import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;

public interface IUserOrderController {
	List<OrderVO> findOrdersByUsernameAndType(String username, OrderStatus type);
	OrderVO placeOrder(OrderVO ordervo);
	ResultMessage addOrder(OrderVO ordervo);
	ResultMessage remark(OrderVO ordervo);
	ResultMessage revoke(OrderVO ordervo);
	ResultMessage addCreditRecord(CreditRecordVO creditrecordvo);
}
