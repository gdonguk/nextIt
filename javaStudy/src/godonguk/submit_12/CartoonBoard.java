package godonguk.submit_12;

public class CartoonBoard extends BoardSum{
	String img;		//이미지 파일

	public CartoonBoard() {
		super();
	}

	public CartoonBoard(int listNum, String listTitle, String listDate, String listInsert, String img) {
		super(listNum, listTitle, listDate, listInsert);
		this.img = img;
	}
	
	
	
	
	
}
