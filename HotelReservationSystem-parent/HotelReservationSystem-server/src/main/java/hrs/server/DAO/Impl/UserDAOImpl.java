package hrs.server.DAO.Impl;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.UserDAO;
import hrs.server.POJO.UserPO;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public UserPO findByUserName(String username) {
		String hql = "from UserPO as user  where user.username = ?";
		UserPO po = null;
		try{
			po = (UserPO) getSession().createQuery(hql).setParameter(0, username).getSingleResult();
		}catch(NoResultException e){}
		return po;
	}

	@Override
	public ResultMessage add(UserPO userpo) {
		if(findByUserName(userpo.getUsername()) != null){
			return ResultMessage.EXISTED;
		}else{
			getSession().save(userpo);
			return ResultMessage.SUCCESS;
		}
	}

	@Override
	public ResultMessage update(UserPO userpo) {
		getSession().update(userpo);
		return ResultMessage.SUCCESS;
	}

}
