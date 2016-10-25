package hrs.common.Controller.WebMarketController;

import java.util.List;

import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;

public interface WebMarketController {
	List<OrderVO> findOrderByOrderType(OrderStatus status);
	OrderVO findOrderByID(int id);
	ResultMessage revokeOrder(OrderVO ordervo);
	List<OrderVO> findOrderByUsername(String username);
	UserVO findUserByUsername(String username);
	ResultMessage addCreditRecord(CreditRecordVO creditrecordvo);
}
