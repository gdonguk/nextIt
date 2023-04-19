package godonguk.submit_11;

import java.util.ArrayList;
import java.util.Scanner;

public class BossDB {

	Scanner scan = new Scanner(System.in);
	CharacterDB characterDB = CharacterDB.getInstance();
	public ArrayList<BossReward> bossReward = new ArrayList<>();

	public static BossDB instance = new BossDB();

	public static BossDB getInstance() {
		return instance;
	}

	// 보스 리스트
	private BossDB() {
		bossReward.add(new BossReward("하드 매그너스", 57895115));
		bossReward.add(new BossReward("카오스 파풀라투스", 133629685));
		bossReward.add(new BossReward("노말 스우", 169712830));
		bossReward.add(new BossReward("노말 데미안", 177589265));
		bossReward.add(new BossReward("하드 스우", 591470960));
		bossReward.add(new BossReward("하드 데미안", 562403065));
		bossReward.add(new BossReward("하드 루시드", 655478275));
		bossReward.add(new BossReward("하드 윌", 725192415));
		bossReward.add(new BossReward("카오스 엔젤 슬라임", 777460705));
		bossReward.add(new BossReward("카오스 더스크", 800868760));
		bossReward.add(new BossReward("하드 듄켈", 843046400));
		bossReward.add(new BossReward("하드 진힐라", 950797260));
	}

	// 보스 리스트 출력
	public void showList() {
		System.out.println("\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠒⠒⠊⠉⢿⣷⣶⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠁⠀⠀⠀⠀⠀⠸⠛⠻⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⢀⠔⠋⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠘⣿⣿⣿⣿⡑⡀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⣀⣴⠶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⣦⣤⣬⣿⣿⣿⣷⡱⡀⠀⠀⠀⠀\n" + 
				"⠀⡀⠂⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣕⢄⠀⠀⠀\n" + 
				"⣬⣤⣶⣾⣿⣿⣿⣷⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⣿⣿⠋⠻⣿⣿⣿⣷⣧⡄⠀\n" + 
				"⣿⣿⢻⣿⣿⣿⣿⡿⠿⢿⣿⣿⣤⣄⣀⠀⠀⠀⠀⣀⡀⣀⣈⣿⠀⠀⣻⣿⣿⣿⣿⣿⣷\n" + 
				"⠹⣿⡸⣿⣿⣿⡿⢁⡀⠀⠉⠉⠻⠿⢿⣿⣶⣶⣾⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⠀⠈⠛⠺⣿⠛⠁⣧⣿⠀⠀⠀⠀⠀⠀⠀⠈⠉⢿⡟⠛⠿⠿⠿⠟⠛⠛⣿⣿⣿⣿⡿⢳\n" + 
				"⠀⠀⠀⡄⠁⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠘⠿⠟⠀⠀⠀⠀⠀⠀⠀⢻⡿⠟⢃⡠⠃\n" + 
				"⠀⠀⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡆⠉⠁⠀⠀\n" + 
				"⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀\n" + 
				"⠀⠀⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠈⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠁⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠈⠀⠄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠐⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠈⠀⠂⠠⠤⣀⣀⣀⣀⣀⣀⣀⣀⡠⠄⠐⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"");
		for (int i = 0; i < bossReward.size(); i++) {
			System.out.println(bossReward.get(i));
		}
	}

	public void sample() {
		CharacterDB characterDB = CharacterDB.getInstance();
		int bossCount = 0;
		long bossPrice = 0;
		String name;
		while (true) {
			System.out.println("캐릭터 이름을 입력하세요");
			System.out.print(">>> ");
			name = scan.nextLine();
			for (int i = 0; i < bossReward.size(); i++) {
				System.out.println(bossReward.get(i).getBoss() + "를 잡을 수 있나요?");
				System.out.println("잡으면 1 아니면 2");
				System.out.print(">>> ");

				int select = Integer.parseInt(scan.nextLine());
				if (select == 1) {
					bossPrice = bossPrice + bossReward.get(i).getPrice();
					bossCount++;
				} else {
					System.out.println("다음");
				}
			}
			System.out.println("등록이 완료되었습니다.");
			System.out.println("보스 메소: " + bossPrice + "메소 입니다.");
			System.out.println("잡는 보스 수는 : " + bossCount + "마리 입니다.");
			break;
		}
		characterDB.nameList.add(new Character(name, bossCount, bossPrice));
	}

}
