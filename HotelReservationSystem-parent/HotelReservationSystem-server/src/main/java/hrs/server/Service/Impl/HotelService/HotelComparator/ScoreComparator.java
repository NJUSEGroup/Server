package hrs.server.Service.Impl.HotelService.HotelComparator;

import hrs.common.VO.HotelVO;

public class ScoreComparator extends HotelComparator {
	
	@Override
	public int compare(HotelVO o1, HotelVO o2) {
		if (super.isDecrease) {
			return o1.score <= o2.score ? 1 : -1;
		} else {
			return o1.score >= o2.score ? 1 : -1;
		}
	}

}
