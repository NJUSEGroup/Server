package hrs.common.Controller.WebMarketController;

import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;

public interface IWebCreditController {

	UserVO findUserByUsername(String username);

	ResultMessage addCreditRecord(CreditRecordVO creditrecordvo);
}
