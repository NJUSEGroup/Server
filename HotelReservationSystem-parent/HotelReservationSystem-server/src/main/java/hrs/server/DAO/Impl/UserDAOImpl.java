package hrs.server.DAO.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.UserDAO;
import hrs.server.POJO.UserPO;
public class UserDAOImpl implements UserDAO {
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public UserPO findByUserName(String username) {
		String hql = "from user where user.user_username = ?";
		return (UserPO) getSession().createQuery(hql).setParameter(0, username).getSingleResult();
	}

	@Override
	public ResultMessage add(UserPO userpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(UserPO userpo) {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
