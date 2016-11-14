package hrs.server.DAO.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.CreditRecordPO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.CreditRecordDAO;


@SuppressWarnings("all")
@Repository
public class CreditRecordDAOImpl implements CreditRecordDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<CreditRecordPO> findByUsername(String username) {
		String hql = "from CreditRecordPO c inner join fetch c.user user "
											+ "where user.username = :username";
		List<CreditRecordPO> list = getSession().createQuery(hql)
												.setParameter("username", username)
												.getResultList();
		return list;
	}

	@Override
	public ResultMessage add(CreditRecordPO creditrecordpo) {
		getSession().save(creditrecordpo);
		return ResultMessage.SUCCESS;
	}

}
