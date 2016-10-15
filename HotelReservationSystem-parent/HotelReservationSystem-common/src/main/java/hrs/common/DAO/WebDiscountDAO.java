package hrs.common.DAO;

import java.util.List;

import hrs.common.PO.WebDiscountPO;
import hrs.common.util.ResultMessage;

public interface WebDiscountDAO {
	ResultMessage add(WebDiscountPO webdiscountpo);

	ResultMessage update(WebDiscountPO webdiscountpo);

	ResultMessage delete(int id);

	List<WebDiscountPO> findAll();

}
