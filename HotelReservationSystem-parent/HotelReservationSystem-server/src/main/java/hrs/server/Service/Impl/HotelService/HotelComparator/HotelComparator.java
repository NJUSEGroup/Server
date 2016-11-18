package hrs.server.Service.Impl.HotelService.HotelComparator;

import java.util.Comparator;

import hrs.common.VO.HotelVO;

public abstract class HotelComparator implements Comparator<HotelVO> {
	protected boolean isDecrease;

	public void setDecrease(boolean isDecrease) {
		this.isDecrease = isDecrease;
	}
	
}
