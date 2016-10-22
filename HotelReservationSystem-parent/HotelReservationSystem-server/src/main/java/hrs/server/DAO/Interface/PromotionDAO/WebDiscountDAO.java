package hrs.server.DAO.Interface.PromotionDAO;

import java.util.List;

import hrs.common.util.ResultMessage;
import hrs.server.POJO.WebDiscountPO;

public interface WebDiscountDAO {
	ResultMessage add(WebDiscountPO webdiscountpo);

	ResultMessage update(WebDiscountPO webdiscountpo);

	ResultMessage delete(int id);

	List<WebDiscountPO> findAll();

}
