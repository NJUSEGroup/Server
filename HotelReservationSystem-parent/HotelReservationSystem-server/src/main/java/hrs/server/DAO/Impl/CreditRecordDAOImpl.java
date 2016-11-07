package hrs.server.DAO.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.CreditRecordDAO;
import hrs.server.POJO.CreditRecordPO;

public class CreditRecordDAOImpl implements CreditRecordDAO {
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<CreditRecordPO> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(CreditRecordPO creditrecordpo) {
		// TODO Auto-generated method stub
		return null;
	}

}
