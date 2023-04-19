package godonguk.submit_11;

import java.util.Scanner;

public class MapleMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BossDB bossDB = BossDB.getInstance();
		CharacterDB characterDB = CharacterDB.getInstance();

		System.out.println("\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⣀⣐⠻⢿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⢶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿\n" + 
				"⠀⠀⢀⣤⣤⣤⣴⠿⢯⡉⢻⡇⠀⠀⠈⠉⠉⠉⢻⣏⠉⢉⡉⢉⣽⡇⠛⢻⣿⣛⡻⠛⢻⣟⠛⢛⣛⣛⣻⡏⢉⣉⡉⢩⡿⢯⣤⡀⣿⣿\n" + 
				"⠀⠀⢿⡅⠀⣤⠈⡇⠀⡇⢸⣇⣠⣤⣴⣟⠛⢳⣶⡟⠀⠘⠃⠘⢻⡆⠀⣿⡍⢉⣿⠀⠀⣿⠀⣩⣉⣉⣽⣿⣛⣛⣛⠛⣷⠀⢸⡇⣿⣿\n" + 
				"⠀⠀⢸⡇⠀⠟⠀⡆⠀⡇⢸⡟⢁⣤⡉⢻⡇⢸⣏⣉⣉⣉⣉⣉⣉⣻⡾⢋⣠⣄⡙⢻⡶⠿⠤⠄⠀⠤⠼⢿⡉⢉⣉⣀⣿⠀⢸⡧⠟⠁\n" + 
				"⠀⠀⠘⠛⠛⠛⢻⡇⢀⡇⢸⣇⠘⠿⠃⣸⡇⢸⣿⣯⣭⣭⣭⠉⣿⣟⠚⠛⠛⠛⠛⠛⢻⡶⠶⠶⠶⠶⠶⢾⣧⣬⣭⣭⣽⠀⢸⡇⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠈⠛⠛⠿⠟⠛⠻⠿⠛⢹⡇⢸⡿⣷⠀⠶⠶⠶⢿⡟⣛⠛⢛⡛⠛⠛⠛⠁⠀⠀⠀⢀⣀⡀⠈⠉⠉⠀⢿⣦⣼⠇⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡛⠛⠃⠻⠿⠿⠿⠿⠿⠃⣿⣷⣿⣇⣤⣴⣶⣦⣿⣷⣶⡿⣯⣿⣷⡾⣶⣶⠶⣦⡶⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠄⠿⠈⠹⠿⣿⣿⣿⢟⠿⠟⠿⠛⠞⠛⠛⠛⠛⠿⢀⡿⠃⠀⠀⠀\n");
		
		
		while(true) {
			// 실행 첫 화면
			System.out.println("보고싶은 화면을 선택해 주세요");
			System.out.println("1. 캐릭터 추가 || 2. 주간보스 수입 || 3. 보스목록 || 4. 목표 메소 계산 || 5. 종료");
			System.out.print(">>> ");
			
			// 선택화면 입력값 
			int select = Integer.parseInt(scan.nextLine());
			
			//선택화면 선택시
			if(select == 1) {
				// 캐릭터 추가
				bossDB.sample();
				System.out.println("-----------------------------------------------------------------------");

				
			} else if(select == 2) {
				// 주간보스 수입
				characterDB.nameList();
				System.out.println("-----------------------------------------------------------------------");

			} else if(select == 3) {
				// 보스목록
				bossDB.showList();
				System.out.println("-----------------------------------------------------------------------");

			} else if(select == 4) {
				// 결정석 정산
				characterDB.hap();
				System.out.println("-----------------------------------------------------------------------");

			} else if(select == 5) {
				// 종료
				System.out.println("계산기를 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력 했습니다.");
				System.out.println("================================");
			}
		}
	}
}
