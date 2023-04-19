package ch09_class.typing;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingMain {

	public static void main(String[] args) {
		// 타자 연습 게임
		Scanner scan = new Scanner(System.in);

		// 단어 목록
		// static 메소드는 해당 클래스를 굳이 객체로 만들지ㅣ
		// 않더라도 사용이 가능하다.
		// Math.random();
//		Dictionary dict = new Dictionary();
		ArrayList<String> wordList = Dictionary.makeWordList(Dictionary.OPTION_CODING_WORD);
//		System.out.println(Dictionary.OPTION_STUDENT_NAME);
		
		Dictionary dict = new Dictionary();
//		System.out.println(dict.OPTION_CODING_WORD);
		
		// 현재 시간 저장
		// 1970년 1월 1일을 기준으로 
		// 현재까지 경과된 시간을 밀리초 단위로 리턴(1초 = 1000밀리초)
		long before = System.currentTimeMillis();
		System.out.println(before);
		while (true) {
			// = Math.random() 실행 결과가 wordList의 인덱스 중 하나
			// = wordList의 인덱스 0 ~ wordList.size() - 1
			
			int randIdx = (int)(Math.random() * wordList.size());
			System.out.println(wordList.get(randIdx));
			System.out.print(">>> ");
			
			String input = scan.nextLine();
			if (wordList.get(randIdx).equals(input)) {
				wordList.remove(randIdx);
			}
			if (wordList.size() == 0) {
				break;
			}
		}
		long after = System.currentTimeMillis();
		// after에서 before를 뺴면, 타자를 친 시간이 구해진다.
		long diff = after - before; // diff는 밀리초 단위
		
		//초 단위로 변환
		// 31872밀리초 -> 31.87초 
		double result = diff / 1000.0;	// 31.0 초
		System.out.println(result + "초 걸리셨습니다.");
		
		
		
		
		
		
		
	}

}
