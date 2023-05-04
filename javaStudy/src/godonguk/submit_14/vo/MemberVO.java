package godonguk.submit_14.vo;

public class MemberVO {
	private String nickname;
	private String id;
	private String password;
	
	public MemberVO() {}

	public MemberVO(String nickname, String id, String password) {
		super();
		this.nickname = nickname;
		this.id = id;
		this.password = password;
	}

	@Override
	public String toString() {
		return "회원 목록[이름 : " + nickname + ", 아이디 : " + id + ", 비밀번호 : " + password + "]";
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
