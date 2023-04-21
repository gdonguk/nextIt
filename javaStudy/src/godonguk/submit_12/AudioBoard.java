package godonguk.submit_12;

public class AudioBoard extends BoardSum {
	String audio;		// 오디오 파일

	public AudioBoard() {
		super();
	}

	public AudioBoard(int listNum, String listTitle, String listDate, String listInsert, String audio) {
		super(listTitle, listDate, listInsert);
		this.audio = audio;
	}
	
	
}
