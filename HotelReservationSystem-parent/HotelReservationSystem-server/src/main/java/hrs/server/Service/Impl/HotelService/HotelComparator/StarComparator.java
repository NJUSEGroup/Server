package hrs.server.Service.Impl.HotelService.HotelComparator;

import hrs.common.VO.HotelVO;

public class StarComparator extends HotelComparator {

	@Override
	public int compare(HotelVO o1, HotelVO o2) {
		if (super.isDecrease) {
			return o1.star - o2.star;
		} else {
			return o2.star - o1.star;
		}
	}

}
