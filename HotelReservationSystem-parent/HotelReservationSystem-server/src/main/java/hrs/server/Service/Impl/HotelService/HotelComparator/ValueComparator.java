package hrs.server.Service.Impl.HotelService.HotelComparator;

import hrs.common.VO.HotelVO;

/**
 * 如果是升序，那么每个酒店对应List房间是升序，并将酒店按照所对应的List房间中最低的价格按升序排列
 * 如果是降序，那么每个酒店对应List房间是降序，并将酒店按照所对应的List房间中最高的价格按降序排列
 * 
 * @author NewSong
 *
 */
public class ValueComparator extends HotelComparator {

	@Override
	public int compare(HotelVO o1, HotelVO o2) {
		if (isDecrease) {
			return o1.highValue >= o2.highValue ? 1 : -1;
		} else {
			return o2.lowValue >= o1.lowValue ? 1 : -1;
		}
	}

}
