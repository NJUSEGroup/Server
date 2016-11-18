package hrs.StubAndDriver.DAO.WebDiscountDAO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.WebsiteDiscountType;
import hrs.server.DAO.Interface.PromotionDAO.WebDiscountDAO;
import hrs.server.POJO.WebDiscountPO;

public class WebDiscountDAOStub implements WebDiscountDAO {
	private Map<Integer, WebDiscountPO> map;
	private Date date;

	public WebDiscountDAOStub() {
		map = new HashMap<>();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 15, 8, 0, 0);
		date = c.getTime();
		map.put(0, new WebDiscountPO(0, 0.8, WebsiteDiscountType.SpecialPeriod, date, date,  0));
		map.put(1, new WebDiscountPO(1, 0.8, WebsiteDiscountType.SpecialPeriod, date, date,  0));
	}

	@Override
	public ResultMessage add(WebDiscountPO webdiscountpo) {
		map.put(webdiscountpo.getId(), webdiscountpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage update(WebDiscountPO webdiscountpo) {
		map.put(webdiscountpo.getId(), webdiscountpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage delete(int id) {
		map.remove(id);
		return ResultMessage.SUCCESS;
	}

	@Override
	public List<WebDiscountPO> findAll() {
		List<WebDiscountPO> list = new ArrayList<>();
		WebDiscountPO po = null;
		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			po = map.get(i);
			list.add(po);
		}
		return list;
	}
}
