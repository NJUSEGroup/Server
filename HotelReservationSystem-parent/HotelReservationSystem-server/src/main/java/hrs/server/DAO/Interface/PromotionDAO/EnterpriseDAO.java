package hrs.server.DAO.Interface.PromotionDAO;

import java.util.List;

import hrs.common.util.ResultMessage;
import hrs.server.POJO.EnterprisePO;

public interface EnterpriseDAO {
	List<EnterprisePO> findAll();
	ResultMessage add(EnterprisePO po);
}
