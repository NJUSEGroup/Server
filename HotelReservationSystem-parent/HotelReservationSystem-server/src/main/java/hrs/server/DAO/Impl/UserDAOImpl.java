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
		System.out.println("UserDAOImpl.findByUserName("+username+")");
		String hql = "from UserPO as user  where user.username = ?";
		return (UserPO) getSession().createQuery(hql).setParameter(0, username).getSingleResult();
	}

	@Override
	public ResultMessage add(UserPO userpo) {
		getSession().save(userpo);
		return ResultMessage.SUCCESS;
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
