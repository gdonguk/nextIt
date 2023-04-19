package godonguk.submit_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Submit07 {

	public static void main(String[] args) {
		System.out.println("\n=====================1번============\n");

		int idx = 0;
		ArrayList<Integer> rando = new ArrayList<>();
		ArrayList<Integer> rando2 = new ArrayList<>();
		System.out.print("랜덤숫자: ");
		for (int i = 0; i < 10; i++) {
			idx = (int) (Math.random() * (20 - 10 + 1)) + 10;
			rando.add(idx);
			System.out.print(rando.get(i) + " ");
		}
		System.out.println();
		System.out.println(rando);
//		for (int i = 0; i < 10; i++) {
//			if (rando.get(i) != rando.get(i)) {
//				idx = rando.get(i);
//			}
//		}
//		System.out.println(rando2);

		System.out.println("\n=====================2번============\n");

		ArrayList<String> aList = new ArrayList<String>(Arrays.asList("냉장고", "로봇청소기", "세탁기", "에어컨"));
		ArrayList<String> bList = new ArrayList<String>(Arrays.asList("노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"));
		ArrayList<String> cList = new ArrayList<>();
		for (int i = 0; i < aList.size(); i++) {
			for (int j = 0; j < bList.size(); j++) {
				if (aList.get(i) == bList.get(j)) {
					cList.add(bList.get(j));
				}
			}
		}
		System.out.println("1번" + cList);

		// 답
		// 1번
		ArrayList<Integer> intList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			intList.add(makeRandom(10, 20));
		}
		System.out.println(intList);

		// 중복제거
		System.out.println("\n============\n");

		ArrayList<Integer> newList = new ArrayList<>();
		for (int i = 0; i < intList.size(); i++) {
			// newList 안에 현재의 intList.get(i) 가 존재하지
			// 않는 경우에만 추가해주기
			if (!newList.contains(intList.get(i))) {
				newList.add(intList.get(i));
			}	
		}
		System.out.println(newList);
		//중복제거 두번째 방법
		for(int i = 0; i < intList.size(); i ++) {
			for(int k = intList.size() -1 ; k > i ; k--) {
				if(intList.get(i) == intList.get(k)) {
					intList.remove(k);
				}
				
			}
			
		}
		System.out.println(intList);
		
		
		System.out.println( "\n =====================================================\n");
		
		ArrayList<String> wipeList = new ArrayList<String>(Arrays.asList("냉장고", "로봇청소기", "세탁기", "에어컨"));
		ArrayList<String> husList = new ArrayList<String>(Arrays.asList("노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"));
		
		//서로 사고 싶은 물건 목록
		ArrayList<String> wantBuy = new ArrayList<>();
		
		for(int i = 0; i < wipeList.size(); i++) {
			if(husList.contains(wipeList.get(i))) {
				wantBuy.add(wipeList.get(i));
				
			}
		}
		System.out.println(wantBuy);
		
		// 교집합을 위한 .retainAll()
		wantBuy.clear();
		wantBuy.addAll(wipeList); // 아내의 구매목록 전부를 담ㄱ;
		System.out.println(wantBuy);
		wantBuy.retainAll(husList);
		System.out.println(wantBuy);
		
		// 전체 구매 목록( 합집합)
		ArrayList<String> allBuy = new ArrayList<>();
		allBuy.addAll(wipeList);
		System.out.println(allBuy);
		for(int i = 0; i < husList.size(); i++) {
			if(!allBuy.contains(husList.get(i))) {
				allBuy.add(husList.get(i));
			}
		}
		System.out.println(allBuy);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main끝

	public static int makeRandom(int a, int b) {

		return (int) (Math.random() * (b - a + 1)) + a;

	}

//	public static int makeRandom(int a, int b){
//		int[] result = new int[10];
//		int idx = 0;
//	
//		outer: while(true) {
//			int rand = (int)(Math.random() * (b-a+1)) + a;
//			for(int i = 0; i < result.length; i++) {
//				if(result[i] == rand) {
//					continue outer;
//				}
//			}
//			result[idx] = rand;
//			idx++;
//			if(idx == 10) {
//				break;
//			}
//		}
//		
//		for(int i = 0; i < result.length; i++) {
//			System.out.print(result[i] + " ");
//		}
//		Arrays.sort(result);
//		
//		return idx;
//	}

}
