package hrs.server.Service.Impl.OfflineRecordService;

import hrs.common.VO.OfflineRecordVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.OfflineRecordDAO;
import hrs.server.Service.Interface.OfflineRecordService.OfflineRecordService;

public class OfflineRecordServiceImpl implements OfflineRecordService {
	private OfflineRecordDAO dao;

	@Override
	public OfflineRecordVO findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(OfflineRecordVO offlinerecordvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkin(OfflineRecordVO offlinerecordvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkout(OfflineRecordVO offlinerecordvo) {
		// TODO Auto-generated method stub
		return null;
	}

	public OfflineRecordDAO getDao() {
		return dao;
	}

	public void setDao(OfflineRecordDAO dao) {
		this.dao = dao;
	}

}
