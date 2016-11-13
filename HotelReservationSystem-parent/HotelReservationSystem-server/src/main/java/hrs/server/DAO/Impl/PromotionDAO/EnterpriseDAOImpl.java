package hrs.server.DAO.Impl.PromotionDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.EnterpriseDAO;
import hrs.server.POJO.EnterprisePO;
@Repository
public class EnterpriseDAOImpl implements EnterpriseDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	/*public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	@Override
	public List<EnterprisePO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(EnterprisePO po) {
		// TODO Auto-generated method stub
		return null;
	}

}
