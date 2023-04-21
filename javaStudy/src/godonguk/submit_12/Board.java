package godonguk.submit_12;

import java.util.ArrayList;

public class Board {

	private ArrayList<BoardSum> boardList = new ArrayList<>();
	
	private Board() {
	}
	private static Board instance = new Board();
	
	public static Board getInstance() {
		return instance;
	}
	public int makeNumber() {
		return boardList.size()+1;
	}
	
	public void addBoard(BoardSum board) {
		boardList.add(board);
	}
	public void showBoardList() {
		for(BoardSum board : boardList) {
			System.out.println(board);
		}
	}
	
}
