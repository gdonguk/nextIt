package godonguk.submit_12;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("행동을 선택해 주세요");
		System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
		System.out.print(">>> ");
		
		int command = Integer.parseInt(scan.nextLine());
		
		while(true) {
			if(command == 1) {
				// 글 목록 출력 
			} else if(command == 2) {
				// 글 쓰기 
				System.out.println("글 제목을 입력해주세요: ");
				String listTitle = scan.nextLine();
				System.out.println("글 내용을 입력해주세요: ");
				String listInsert = scan.nextLine();

				
			} else {
				System.out.println("종료 합니다.");
			}
			
			
			
			
		}
		
		
		
		
		
		
	}

}
