package godonguk.submit_13;

public class BoardVO {
	private int boardNum;
	private String boardTitle;
	private String boardContent;
	
	public BoardVO() {}
	
	public BoardVO(int boardNum, String boardTitle, String boardContent) {
		super();
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent + "]";
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	
	
	
}
