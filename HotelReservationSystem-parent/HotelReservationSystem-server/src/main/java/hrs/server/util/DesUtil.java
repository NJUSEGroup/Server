package hrs.server.util;

import org.apache.commons.codec.binary.Base64;

public class DesUtil {
	
	public static String encodeStr(String plainText) {
		return new String(Base64.encodeBase64(plainText.getBytes()));
	}
	
	public static String decodeStr(String encodeStr) {
		return new String(Base64.decodeBase64(encodeStr.getBytes()));

	}
	
	public static void main(String[] args) {
		System.out.println(DesUtil.encodeStr("管理员大淫"));
		System.out.println(DesUtil.decodeStr("YWRtaW4="));
		
	}
}
