package godonguk.submit_12;

public class BoardSum {
	int listNum;		// 글 번호
	String listTitle;	// 글 제목 
	String listDate;	// 글 게시일
	String listInsert;	// 글 내용
	
	public BoardSum() {}
	
	public BoardSum(int listNum, String listTitle, String listDate, String listInsert) {
		super();
		this.listNum = listNum;
		this.listTitle = listTitle;
		this.listDate = listDate;
		this.listInsert = listInsert;
	}

	
	@Override
	public String toString() {
		return "BoardSum [listNum=" + listNum + ", listTitle=" + listTitle + ", listDate=" + listDate + ", listInsert="
				+ listInsert + "]";
	}
	

	public int getListNum() {
		return listNum;
	}

	public void setListNum(int listNum) {
		this.listNum = listNum;
	}

	public String getListTitle() {
		return listTitle;
	}

	public void setListTitle(String listTitle) {
		this.listTitle = listTitle;
	}

	public String getListDate() {
		return listDate;
	}

	public void setListDate(String listDate) {
		this.listDate = listDate;
	}

	public String getListInsert() {
		return listInsert;
	}

	public void setListInsert(String listInsert) {
		this.listInsert = listInsert;
	}
	
	
}
