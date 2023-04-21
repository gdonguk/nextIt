package godonguk.submit_12;

public class CartoonBoard extends BoardSum{
	private String img;		//이미지 파일

	public CartoonBoard() {
		super();
	}

	public CartoonBoard(int listNum, String listTitle, String listDate, String listInsert, String img) {
		super(listTitle, listDate, listInsert);
		this.img = img;
	}

	@Override
	public String toString() {
		return super.toString() + "[img=" + img + "]";
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
	
	
}
