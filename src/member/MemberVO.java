package member;

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String phone;
	
	public MemberVO(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public MemberVO(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
