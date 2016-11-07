package hrs.server.Service.Impl.OfflineRecordService;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.OfflineRecordVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.OfflineRecordDAO;
import hrs.server.Service.Interface.OfflineRecordService.OfflineRecordService;

public class OfflineRecordServiceImpl implements OfflineRecordService {
	private OfflineRecordDAO dao;
	@Transactional	
	@Override
	public OfflineRecordVO findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public ResultMessage add(OfflineRecordVO offlinerecordvo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public ResultMessage checkin(OfflineRecordVO offlinerecordvo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public ResultMessage checkout(OfflineRecordVO offlinerecordvo) {
		// TODO Auto-generated method stub
		return null;
	}


	public void setDao(OfflineRecordDAO dao) {
		this.dao = dao;
	}

}
