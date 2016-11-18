package hrs.server.Service.Impl.CreditRecordService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.CreditRecordService.CreditRecordNotFoundException;
import hrs.common.POJO.CreditRecordPO;
import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.CreditRecordDAO;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;
import hrs.server.Service.Interface.UserService.UserService;
import hrs.server.util.VIPLevel;

@Service
public class CreditRecordServiceImpl implements CreditRecordService {
	@Autowired
	private CreditRecordDAO dao;
	@Autowired
	private UserService userService;

	/**
	 * 
	 * @Title: findByUsername
	 * @Description:按用户名查找信用记录
	 * @param username
	 * @return List<CreditRecordVO>
	 * @see hrs.server.Service.Interface.CreditRecordService.CreditRecordService#findByUsername(java.lang.String)
	 */
	@Transactional
	@Override
	public List<CreditRecordVO> findByUsername(String username) {
		List<CreditRecordPO> pos = dao.findByUsername(username);
		List<CreditRecordVO> vos = null;
		if (pos.size() == 0) {
			throw new CreditRecordNotFoundException();
		} else {
			CreditRecordVO vo = null;
			vos = new ArrayList<>();
			for (CreditRecordPO po : pos) {
				vo = new CreditRecordVO(po);
				vos.add(vo);
			}
		}
		return vos;
	}

	/**
	 * 
	 * @Title: add
	 * @Description:添加一条信用记录，与此同时更新相关用户的信用值和会员等级
	 * @param vo
	 * @return ResultMessage
	 * @see hrs.server.Service.Interface.CreditRecordService.CreditRecordService#add(hrs.common.VO.CreditRecordVO)
	 */
	@Transactional
	@Override
	public ResultMessage add(CreditRecordVO vo) {
		UserVO user = vo.user;
		vo.currCredit = vo.variation + user.credit;
		user.credit = vo.currCredit;
		user.VIPLevel = VIPLevel.getLevel(user.credit);
		userService.update(user);
		System.out.println("更新用户 : "+user);
		return dao.add(new CreditRecordPO(vo));
	}
}
