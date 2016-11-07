package hrs.server.DAO.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.OfflineRecordDAO;
import hrs.server.POJO.OfflineRecordPO;

public class OfflineRecordDAOImpl implements OfflineRecordDAO {
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public OfflineRecordPO findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(OfflineRecordPO offlinerecordpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(OfflineRecordPO offlinerecordpo) {
		// TODO Auto-generated method stub
		return null;
	}

}
