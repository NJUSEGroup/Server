package hrs.server.Service.Impl.OfflineRecordService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.OfflineRecordService.OfflineRecordNotFoundException;
import hrs.common.POJO.OfflineRecordPO;
import hrs.common.VO.OfflineRecordVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.OfflineRecordDAO;
import hrs.server.Service.Interface.OfflineRecordService.OfflineRecordService;
@Service
public class OfflineRecordServiceImpl implements OfflineRecordService {
	@Autowired
	private OfflineRecordDAO dao;
	
	/**
	 * 
	 * @Title: findByID 
	 * @Description: 按id查找线下订单
	 * @param id
	 * @return 
	 * @throws OfflineRecordNotFoundException 
	 * @see hrs.server.Service.Interface.OfflineRecordService.OfflineRecordService#findByID(int)
	 */
	@Transactional	
	@Override
	public OfflineRecordVO findByID(int id) throws OfflineRecordNotFoundException {
		OfflineRecordPO po = dao.findByID(id);
		if(po == null){
			throw new OfflineRecordNotFoundException();
		}else{
			return new OfflineRecordVO(po);
		}
	}
	
	/**
	 * @Title: checkin 
	 * @Description:入住/添加线下入住记录  vo要求已经设置了入住时间
	 * @param vo
	 * @return ResultMessage
	 * @see hrs.server.Service.Interface.OfflineRecordService.OfflineRecordService#checkin(hrs.common.VO.OfflineRecordVO)
	 */
	@Transactional
	@Override
	public void checkin(OfflineRecordVO vo) {
		dao.add(new OfflineRecordPO(vo));
	}
	
	/**
	 * 
	 * @Title: checkout 
	 * @Description:退房，更新该订单的退房时间
	 * @param vo
	 * @return ResultMessage
	 * @see hrs.server.Service.Interface.OfflineRecordService.OfflineRecordService#checkout(hrs.common.VO.OfflineRecordVO)
	 */
	@Transactional
	@Override
	public void checkout(OfflineRecordVO vo) {
		vo.checkoutTime = new Date();
		dao.update(new OfflineRecordPO(vo));
	}
	

}
