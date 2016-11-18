package hrs.server.Service.Impl.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.StaffService.StaffExistedException;
import hrs.common.Exception.StaffService.StaffNotFoundExceptioon;
import hrs.common.Exception.StaffService.StaffPasswordErrorException;
import hrs.common.POJO.StaffPO;
import hrs.common.VO.StaffVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.StaffDAO;
import hrs.server.Service.Interface.StaffService.StaffService;
import hrs.server.util.DesUtil;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffDAO dao;

	@Transactional
	@Override
	public StaffVO login(String username, String password) {
		StaffPO po = dao.findByUsername(DesUtil.encodeStr(username));
		if (po == null) {
			throw new StaffNotFoundExceptioon();
		} else if (!po.getPassword().equals(DesUtil.encodeStr(password))) {
			throw new StaffPasswordErrorException();
		} else {
			return decrypt(new StaffVO(po));
		}
	}

	@Transactional
	@Override
	public void update(StaffVO staffvo) {
		dao.update(new StaffPO(encrypt(staffvo)));
	}

	@Transactional
	@Override
	public void add(StaffVO staffvo) {
		if (dao.add(new StaffPO(encrypt(staffvo))) == ResultMessage.EXISTED) {
			throw new StaffExistedException();
		}
	}

	@Transactional
	@Override
	public StaffVO findByUsername(String username) {
		StaffPO po = dao.findByUsername(DesUtil.encodeStr(username));
		if (po == null) {
			throw new StaffNotFoundExceptioon();
		} else {
			return decrypt(new StaffVO(po));
		}
	}

	@Transactional
	@Override
	public StaffVO findByHotelName(String hotelName) {
		StaffPO po = dao.findByHotelName(hotelName);
		if (po == null) {
			throw new StaffNotFoundExceptioon();
		} else {
			return decrypt(new StaffVO(po));
		}
	}

	private StaffVO encrypt(StaffVO vo) {
		vo.username = DesUtil.encodeStr(vo.username);
		vo.password = DesUtil.encodeStr(vo.password);
		vo.name = DesUtil.encodeStr(vo.name);
		return vo;
	}

	private StaffVO decrypt(StaffVO vo) {
		vo.username = DesUtil.decodeStr(vo.username);
		vo.password = DesUtil.decodeStr(vo.password);
		vo.name = DesUtil.decodeStr(vo.name);
		return vo;
	}
}
