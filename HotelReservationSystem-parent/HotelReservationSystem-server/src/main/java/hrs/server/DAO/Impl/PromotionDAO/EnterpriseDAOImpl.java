package hrs.server.DAO.Impl.PromotionDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.EnterprisePO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.EnterpriseDAO;

@Repository
public class EnterpriseDAOImpl implements EnterpriseDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EnterprisePO> findAll() {
		String hql = "from EnterprisePO ";
		return getSession().createQuery(hql).getResultList();
	}

	@Override
	public ResultMessage add(EnterprisePO po) {
		getSession().save(po);
		return ResultMessage.SUCCESS;
	}

}
