package hrs.server.Service.Impl.HotelService.HotelComparator;

import java.util.Comparator;

import hrs.common.VO.HotelVO;
/**
 * 
* @ClassName: HotelComparator
* @Description: 酒店比较器的共同基类
* @author NewSong
* @date 2016年11月19日 下午10:06:44
*
 */
public abstract class HotelComparator implements Comparator<HotelVO> {
	/**
	 * 升序or降序
	 */
	protected boolean isDecrease;

	public void setDecrease(boolean isDecrease) {
		this.isDecrease = isDecrease;
	}
	
}
