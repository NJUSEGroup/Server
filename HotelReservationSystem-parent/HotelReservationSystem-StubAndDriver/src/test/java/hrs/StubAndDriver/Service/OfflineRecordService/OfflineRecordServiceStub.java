package hrs.StubAndDriver.Service.OfflineRecordService;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.OfflineRecordDAO.OfflineRecordDAOStub;
import hrs.client.Service.OfflineRecordService.OfflineRecordService;
import hrs.client.Service.RoomService.RoomService;
import hrs.client.VO.OfflineRecordVO;
import hrs.common.DAO.OfflineRecordDAO;
import hrs.common.util.ResultMessage;
import hrs.server.POJO.OfflineRecordPO;

public class OfflineRecordServiceStub implements OfflineRecordService {
	private OfflineRecordDAO dao;
	
	public OfflineRecordServiceStub(){
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
	public ResultMessage update(OfflineRecordVO offlinerecordvo) {
		OfflineRecordPO po = new OfflineRecordPO();
		BeanUtils.copyProperties(offlinerecordvo, po);
		return dao.update(po);
	}

}
