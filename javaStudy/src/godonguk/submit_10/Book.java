package godonguk.submit_10;

public class Book {
	
	int bookNum;		// 도서 번호
	String bookName;	// 도서 제목
	boolean bookCheck;	// 대여 여부
	
	public Book(int bookNum, String bookName, boolean bookCheck) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookCheck = bookCheck;
	}

	@Override
	public String toString() {
		String boo = "";
		if(bookCheck == true) {
			boo += "대여중";
		}else if(bookCheck == false) {
			boo += "입고중";
		}
		
		
		return "[책번호=" + bookNum + ", 책 제목=" + bookName + ", 대여상태=" + boo + "]";
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public boolean isBookCheck() {
		return bookCheck;
	}

	public void setBookCheck(boolean bookCheck) {
		this.bookCheck = bookCheck;
	}
	
	
	
	
	
}
