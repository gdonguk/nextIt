package submit_08.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Submit08 {

	public static void main(String[] args) {

		System.out.println("\n=========================== 1번 ==================================\n");
		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);

		System.out.println("\n=========================== 2번 ==================================\n");

		HashMap<String, String> infoMap = new HashMap<>();
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		System.out.print(">>> ");
		String id = scan.nextLine();

		System.out.println("비밀번호를 입력해주세요");
		System.out.print(">>> ");
		String pass = scan.nextLine();
//		
//		if(infoMap.get(id) != null ) {
//			// 입력한 id 가 map 안에 존재한다.
//			
//			// TODO 비밀번호 체크
//			if(infoMap.get(id).equals) {
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("비밀번호가 틀립니다.");
//			}
//		}else {
//			// id가 map 안에 key 값으로 존재하지 않음
//			System.out.println("존재하지 않는 아이디 입니다.");
//		}
		

		if (infoMap.containsKey(id)) {
			if (!infoMap.get(id).equals(pass)) {
				System.out.println("비밀번호가 틀렸습니다");
			} else {
				System.out.println("로그인 성공");
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}

	public static ArrayList<Integer> makeLotto() {
		HashSet<Integer> mynum = new HashSet<>();
		ArrayList<Integer> dap = new ArrayList<>();
		while (mynum.size() < 6) {
			int rand = (int) (Math.random() * 45) + 1;
			mynum.add(rand);
		}
		dap.addAll(mynum);
		Collections.sort(dap);
		return dap;
	}

}
