package hrs.client.UI.UserUI;

public class MyLabelListenerFactory {
	private static MyLabelListener listener;

	static {
		try {
			listener = new MyLabelListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static MyLabelListener getListener() {
		return listener;
	}
}
