package hrs.common.Controller.WebMarketController;

import hrs.common.VO.UserVO;

public interface IWebCreditController {

	UserVO findUserByUsername(String username);
	void recharge(UserVO user,int money);
}
