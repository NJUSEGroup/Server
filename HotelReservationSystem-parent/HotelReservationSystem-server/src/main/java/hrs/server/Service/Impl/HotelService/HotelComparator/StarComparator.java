package hrs.server.Service.Impl.HotelService.HotelComparator;

import hrs.common.VO.HotelVO;
/**
 * 
* @ClassName: StarComparator
* @Description: 星级比较器
* @author NewSong
* @date 2016年11月19日 下午10:07:19
*
 */
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
