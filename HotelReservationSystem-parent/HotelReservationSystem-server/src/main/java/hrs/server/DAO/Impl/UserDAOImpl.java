package hrs.server.DAO.Impl;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.UserPO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public UserPO findByUserName(String username) {
		String hql = "from UserPO as user  where user.username = :username";
		UserPO po = null;
		try {
			po = (UserPO) getSession().createQuery(hql).setParameter("username", username).getSingleResult();
		} catch (NoResultException e) {
			
		}
		return po;
	}

	@Override
	public ResultMessage add(UserPO userpo) {
		if (findByUserName(userpo.getUsername()) != null) {
			return ResultMessage.EXISTED;
		} else {
			getSession().save(userpo);
			return ResultMessage.SUCCESS;
		}
	}

	@Override
	public ResultMessage update(UserPO userpo) {
		getSession().merge(userpo);
		return ResultMessage.SUCCESS;
	}

}
