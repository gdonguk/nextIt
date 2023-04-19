package godonguk.submit_04;

import java.util.Scanner;

public class Submit04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.println("거꾸로 뒤잡을 문자열 입력:");
//		System.out.print(">>>>");
//		String input = scan.nextLine();
//		String suzu = "";
//		String sum ="";
//		for(int i = input.length()-1; i >= 0; i--) {
//			suzu = input.substring(i, i+1);
//			sum += suzu;
//			}
//		System.out.print("뒤집은 결과 : " + sum);
//		// int select = Integer.parseInt(scan.nextLine());
//
		boolean mainele = true;
		int ele1 = 10;
		int ele2 = 4;

		while (mainele) {
			System.out.println("\n====================화영빌딩 엘리베이터 ===============\n");
			System.out.println("승강기 A의 현재 위치: " + ele1 + "층");
			System.out.println("승강기 B의 현재 위치: " + ele2 + "층");
			System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");
			String input = scan.nextLine();
			if (input.equals("q") || input.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				mainele = false;
				break;
			}
			int intput = Integer.parseInt(input);
			if (Math.abs(ele1-intput) <= Math.abs(ele2-intput)) {
				// 가까운 엘리베이터가 input 값이됨
				System.out.println(ele1 + "층에서 엘리베이터를 호출합니다.");
				ele1 = intput;
				System.out.println("승강기 A가" + intput + "층으로 이동하였습니다.");

				System.out.println("\n====================화영빌딩 엘리베이터 ===============\n");

			} else if (Math.abs(ele1-intput) > Math.abs(ele2-intput)) {
				System.out.println(ele1 + "층에서 엘리베이터를 호출합니다.");
				ele2 = intput;
				System.out.println("승강기 B가" + intput + "층으로 이동하였습니다.");

				System.out.println("\n====================화영빌딩 엘리베이터 ===============\n");
			} 
		}

	}
}
