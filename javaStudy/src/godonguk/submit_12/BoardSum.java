package godonguk.submit_12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardSum {
	private int listNum;		// 글 번호
	private String listTitle;	// 글 제목 
	private String listInsert;	// 글 내용
	private String listDate;	// 글 게시일
	
	public BoardSum() {}
	
	public BoardSum(String listTitle, String listInsert, String listDate) {
		Board db = Board.getInstance();
		this.listNum = db.makeNumber();
		this.listTitle = listTitle;
		this.listInsert = listInsert;
		Date currentTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		this.listDate = sdf.format(currentTime);
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
