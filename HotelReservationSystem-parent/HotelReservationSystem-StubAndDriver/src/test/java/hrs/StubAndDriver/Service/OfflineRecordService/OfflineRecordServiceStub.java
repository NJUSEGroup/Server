package hrs.StubAndDriver.Service.OfflineRecordService;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.OfflineRecordDAO.OfflineRecordDAOStub;
import hrs.client.Service.OfflineRecordService;
import hrs.client.Service.RoomService;
import hrs.client.VO.OfflineRecordVO;
import hrs.common.DAO.OfflineRecordDAO;
import hrs.common.PO.OfflineRecordPO;
import hrs.common.util.ResultMessage;

public class OfflineRecordServiceStub implements OfflineRecordService {
	private OfflineRecordDAO dao;
	private RoomService roomService;
	
	public OfflineRecordServiceStub(){
		dao = new OfflineRecordDAOStub();
	}
	
	@Override
	public OfflineRecordVO findByID(int id) {
		OfflineRecordPO po = dao.findByID(id);
		OfflineRecordVO vo = new OfflineRecordVO();
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

	@Override
	public ResultMessage add(OfflineRecordVO offlinerecordvo) {
		OfflineRecordPO po = new OfflineRecordPO();
		BeanUtils.copyProperties(po, offlinerecordvo);
		return dao.add(po);
	}

	@Override
	public ResultMessage update(OfflineRecordVO offlinerecordvo) {
		OfflineRecordPO po = new OfflineRecordPO();
		BeanUtils.copyProperties(po, offlinerecordvo);
		return dao.update(po);
	}

}
