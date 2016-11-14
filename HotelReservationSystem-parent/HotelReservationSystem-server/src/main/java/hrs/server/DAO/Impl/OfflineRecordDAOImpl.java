package hrs.server.DAO.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.OfflineRecordDAO;
import hrs.server.POJO.OfflineRecordPO;
@Repository
public class OfflineRecordDAOImpl implements OfflineRecordDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public OfflineRecordPO findByID(int id) {
		return getSession().get(OfflineRecordPO.class,id);
	}

	@Override
	public ResultMessage add(OfflineRecordPO offlinerecordpo) {
		getSession().save(offlinerecordpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage update(OfflineRecordPO offlinerecordpo) {
		getSession().update(offlinerecordpo);
		return ResultMessage.SUCCESS;
	}

}
