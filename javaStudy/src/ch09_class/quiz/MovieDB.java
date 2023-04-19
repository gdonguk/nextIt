package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재 황정민 박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("범죄와의전쟁", "느그 서장 남천동 살제?", "민식 하정우", "ㅂㅈㅈㅇㅇㅈㅈ"));
		movieList.add(new Movie("친구", "느그 아부지 머하시노", "유오성, 장동건, 서태화, 정운택, 김보경 등", "ㅊㄱ"));
		movieList.add(new Movie("타짜", "묻고 더블로 가!", "조승우, 김혜수, 유해진 ", "ㅌㅉ"));
		movieList.add(new Movie("베테랑", "야, 우리가 돈이 없지 가오가 없냐?", "유아인", "ㅂㅌㄹ"));
		movieList.add(new Movie("말아톤", "초원이 다리는 백만불짜리 다리", "조승우", "ㅁㅇㅌ"));
		movieList.add(new Movie("건축학개론", "납득이 안 가잖아, 납득이!", "수지 조정석", "ㄱㅊㅎㄱㄹ"));
		movieList.add(new Movie("극한직업", "지금까지 이런 맛은 없었다. 이것은 갈비인가 통닭인가.", "류승룡, 이하늬,이동희", "ㄱㄱㅈㅇ"));
		movieList.add(new Movie("엑시트", "따따따 따 따 따 따따따!", "윤아, 조정석", "ㅇㅅㅌ"));
		movieList.add(new Movie("기생충", "아들아, 너는  계획이 다 있구나. ", "송강호, 이선균", "ㄱㅅㅊ"));
	}
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
	
	
}
