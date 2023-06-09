package godonguk.submit_11;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterDB {

	Scanner scan = new Scanner(System.in);
	public ArrayList<Character> nameList = new ArrayList<>();

	public static CharacterDB instance = new CharacterDB();

	public static CharacterDB getInstance() {
		return instance;
	}

	// 이름 목록
	public void nameList() {
		System.out.println("\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⢤⣴⣶⣦⣤⠄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠨⠀⠙⢩⢿⢿⣦⡈⣿⣿⣶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣔⡌⠠⠋⠀⠀⠓⠘⠀⠹⣷⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡟⣡⠄⠀⡇⡀⠀⠀⡄⡀⠀⣽⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣷⣖⣹⢦⣤⣷⣦⢶⣬⣾⣿⣿⣿⣿⣿⣿⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣙⣉⣻⣯⠀⠀⠹⢟⣋⣩⣭⡙⣿⡇⡝⣷⠀⠀⠀⠀⠀⠀⠀⠀⡀⢄⠠⠠⠤⢀⡀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⠏⠻⠿⠀⠀⠐⠉⠟⠟⠊⠑⠑⠋⣰⠯⢫⡅⣴⣴⣾⣿⣿⡿⠧⠥⠤⠶⠞⠉⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠠⠀⠀⢥⡀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡷⣾⣟⣠⡎⢷⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⡀⠐⠀⠀⠁⠀⠀⠀⠀⠀⣀⣀⡀⣤⣤⣦⣾⣹⣿⣷⣶⣶⡶⠷⣿⠯⣪⡯⡓⢪⣷⣧⣺⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⢀⣠⣊⣯⣅⣤⣤⣴⣶⣶⠸⡹⢿⠛⠟⠛⠋⢙⡿⢓⣤⢥⣺⢯⣳⢶⢶⡶⠎⠽⣿⣴⣪⣤⣼⣏⢹⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠈⠉⠉⠙⠛⠛⠛⠛⠁⠀⠀⠀⠀⠀⠀⣰⣇⣩⣿⣶⠉⠑⠺⠛⠋⢫⢋⣤⣿⣿⣿⣿⣿⣿⣾⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣆⣓⣶⣶⣖⣾⡶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣤⣭⣿⣿⡿⣿⣿⣿⣿⣿⣿⠞⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣻⣿⣿⣿⣷⣮⡙⢻⢿⢟⣹⡆⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⡿⣟⣿⣯⣿⣷⣔⠃⠳⣾⣧⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⢀⡚⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⡾⣌⣽⣿⣿⣿⣯⢉⠀⠸⣿⣿⣿⣿⣿⣿⠟⠛⠛⢿⣿⡿⣫⢟⣇⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⣘⣷⣿⣿⣿⣿⣿⣿⡿⠛⠉⠀⠀⢻⣿⣿⣿⠀⠈⠱⡣⣢⣿⡏⠉⡟⠀⠋⠀⠀⠀⣽⡷⣛⣵⣿⣿⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⠀⠉⠉⠁⠀⠀⠀⠀⠀⢸⣿⣿⡏⠀⠀⠀⢻⣷⣿⡇⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣺⣿⡿⠁⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⢠⣘⣿⣿⣿⠀⠀⠀⢸⠿⣿⣿⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⡾⠋⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⣿⣷⡄⠀⠀⠀⢀⢔⠻⣿⣿⣿⣿⠀⠀⠀⢸⣿⡿⣿⡇⠀⠀⠀⣸⣿⣿⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠀⠀⠠⣷⣾⣿⡿⠛⠉⠁⠀⠀⠀⢸⣯⣟⠐⣾⡆⠀⠐⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣷⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
	}

	// 결정석 계산
	public void hap() {
		long priceSum = 0;
		int bossCountSum = 0;
		System.out.println("목표 메소를 입력사세요");
		System.out.print(">>> ");
		long last = scan.nextLong();
		
		for (int i = 0; i < nameList.size(); i++) {
			priceSum += nameList.get(i).bossMeso;
			bossCountSum += nameList.get(i).bossCount;
		}
		if((last - priceSum) >= 0) {
		System.out.println("목표 하신 메소는"+((long)last - (long)priceSum)+"메소 만큼 남았습니다.");
		}else if((last - priceSum) < 0){
			System.out.println("목표금액"+ last +"메소에 달성하였습니다.");
		}
		System.out.println("\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠠⣼⣆⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠠⡮⣭⣭⣭⣶⣶⡶⠎⢷⡀⠀⠈⢩⠟⠆⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠙⢲⢛⣅⣤⡝⠛⢛⣻⠇⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⡀⠾⣷⡛⢀⣴⣿⣿⣷⣶⡄⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⢠⠊⠀⠀⢈⡿⠿⠟⢿⡿⢿⣿⣥⣴⡆⠀⠀⠀\n" + 
				"⠀⠀⠀⢠⠃⠀⠸⣿⡚⣿⣶⠏⠀⠁⠀⠹⣿⡏⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠘⡄⠀⠙⢻⣿⣿⡷⠖⠀⠀⢠⣪⡋⢇⢁⢢⠀⠀\n" + 
				"⠠⣤⠀⠀⠈⠢⢤⣤⣿⣇⣀⣀⣠⣤⣷⣏⣭⣽⠯⢀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠁⠀⠘⠤⠅⠄⠀⠀⠀\n" + 
				"");
		System.out.println("캐릭터 " + nameList.size() + "개가 한 주동안 잡은 보스의 수는 " + bossCountSum + "마리 입니다.!");
		System.out.println("캐릭터 " + nameList.size() + "개가 한 주동안 모을 수 있는 결정석 가격은 " + priceSum + "메소 입니다.!!");
	}

}