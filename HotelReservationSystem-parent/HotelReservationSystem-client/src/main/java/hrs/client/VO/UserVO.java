package hrs.client.VO;

public class UserVO {
	public String username;
	public String password;
	public UserVO() {
		// TODO Auto-generated constructor stub
	}
	public UserVO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
