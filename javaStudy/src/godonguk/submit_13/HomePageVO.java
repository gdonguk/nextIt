package godonguk.submit_13;

public class HomePageVO {
	private String emId;
	private String emPassword;
	
	public HomePageVO() {}
	
	public HomePageVO(String emId, String emPassword) {
		super();
		this.emId = emId;
		this.emPassword = emPassword;
	}

	@Override
	public String toString() {
		return "HomePageVO [emId=" + emId + ", emPassword=" + emPassword + "]";
	}

	public String getEmId() {
		return emId;
	}

	public void setEmId(String emId) {
		this.emId = emId;
	}

	public String getEmPassword() {
		return emPassword;
	}

	public void setEmPassword(String emPassword) {
		this.emPassword = emPassword;
	}
	
	
}
