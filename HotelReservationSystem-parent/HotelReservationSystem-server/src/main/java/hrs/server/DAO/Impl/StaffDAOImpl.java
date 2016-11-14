package hrs.server.DAO.Impl;

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
		String hql = "from StaffPO staff where staff.username = ?";
		StaffPO po = null;
		try{
			po = (StaffPO) getSession().createQuery(hql).setParameter(0, username).getSingleResult();
		}catch(NoResultException e){}
		return po;
	}

	@Override
	public StaffPO findByHotelName(String hotelName) {
		String hql = "from StaffPO staff inner join fetch staff.hotel hotel where hotel.name = ?";
		StaffPO po = null;
		try{
			po = (StaffPO) getSession().createQuery(hql).setParameter(0, hotelName).getSingleResult();
		}catch(NoResultException e){}
		return po;
	}

}
