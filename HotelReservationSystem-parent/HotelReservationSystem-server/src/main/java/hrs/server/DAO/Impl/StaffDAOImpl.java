package hrs.server.DAO.Impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.StaffPO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.StaffDAO;
@Repository
public class StaffDAOImpl implements StaffDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override	
	public ResultMessage update(StaffPO staffpo) {
		getSession().update(staffpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(StaffPO staffpo) {
		if(findByUsername(staffpo.getUsername()) != null){
			return ResultMessage.EXISTED;
		}else{
			getSession().save(staffpo);
			return ResultMessage.SUCCESS;
		}
	}

	@Override
	public StaffPO findByUsername(String username) {
		String hql = "from StaffPO staff where staff.username = :username";
		StaffPO po = null;
		try{
			po = (StaffPO) getSession().createQuery(hql).setParameter("username", username).getSingleResult();
		}catch(NoResultException e){}
		return po;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StaffPO> findByHotelName(String hotelName) {
		String hql = "from StaffPO staff inner join fetch staff.hotel hotel where hotel.name like :hotelName";
		return getSession().createQuery(hql)
				.setParameter("hotelName", "%"+hotelName+"%")
				.getResultList();
	}

}
