package hrs.client.UI.UserUI.OrderInfoUI;

import java.util.HashMap;

import aj.org.objectweb.asm.Type;
import hrs.common.util.type.RoomType;

public class TableHelper {
	public static String RoomFormat(RoomType type){
		HashMap<RoomType, String> map = new HashMap<>();
		map.put(RoomType.Business,"商务标间");
		map.put(RoomType.Deluxe,"豪华房");
		map.put(RoomType.Double,"双人房");
		map.put(RoomType.Single,"单人房");
		map.put(RoomType.Standard,"标准房");
		map.put(RoomType.KingSize,"大床房");
		map.put(RoomType.Executive,"行政标间");
		
		return map.get(type);
		
		
	}
}
