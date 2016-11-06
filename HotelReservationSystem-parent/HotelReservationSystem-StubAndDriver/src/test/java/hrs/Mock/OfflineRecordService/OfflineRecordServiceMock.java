package hrs.Mock.OfflineRecordService;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.OfflineRecordDAO.OfflineRecordDAOStub;
import hrs.common.VO.OfflineRecordVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.OfflineRecordDAO;
import hrs.server.POJO.OfflineRecordPO;
import hrs.server.Service.Interface.OfflineRecordService.OfflineRecordService;

public class OfflineRecordServiceMock implements OfflineRecordService {
	private OfflineRecordDAO dao;
	
	public OfflineRecordServiceMock(){
		dao = new OfflineRecordDAOStub();
	}
	
	@Override
	public OfflineRecordVO findByID(int id) {
		OfflineRecordPO po = dao.findByID(id);
		if(po == null){
			return null;
		}
		OfflineRecordVO vo = new OfflineRecordVO();
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

	@Override
	public ResultMessage add(OfflineRecordVO offlinerecordvo) {
		OfflineRecordPO po = new OfflineRecordPO();
		BeanUtils.copyProperties(offlinerecordvo, po);
		return dao.add(po);
	}


	@Override
	public ResultMessage checkin(OfflineRecordVO offlinerecordvo) {
		OfflineRecordPO po = new OfflineRecordPO();
		BeanUtils.copyProperties(offlinerecordvo, po);
		return dao.update(po);
	}

	@Override
	public ResultMessage checkout(OfflineRecordVO offlinerecordvo) {
		OfflineRecordPO po = new OfflineRecordPO();
		BeanUtils.copyProperties(offlinerecordvo, po);
		return dao.update(po);
	}

}
