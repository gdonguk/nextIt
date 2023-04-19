package godonguk.submit_06;

import java.util.Arrays;

public class Submit06 {

	public static void main(String[] args) {
		
		System.out.println("\n ========================== 1번 =============================");
		
		String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석",
						     "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘",
						      "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};
		int count = 0;
		for(int i = 0; i < nameList.length; i++ ) {
			if(nameList[i].substring(0,1).contains("이")) {
				count ++;
			}	
		}
		System.out.println("이씨 성을 가진 배우가 총 " +count+ "명 있습니다.");
		
		//
		 count = 0;
		for(int i = 0; i < nameList.length; i++ ) {
		String str = nameList[i].substring(0,1);
			if( str.equals("이")) {
				count++;
		}
		}
		
		
		System.out.println("\n ========================== 2번 =============================");
		//for문을 이용해 intArr의 최댓값과 최솟값을 출력해주세요.

//Hint
//for문 바깥에 int 변수 하나 선언해둔 뒤, for문을 돌리면서 각각의 요소가 int 변수보다 큰지 비교
//크다면 int 변수에 해당 요소의 값 저장
		
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		for (int k = 0; k < intArr.length - 1; k++) {
			for (int i = 0; i <intArr.length - 1; i++) {
				// i > i + 1 하면 오름차순
				// i < i + 1 하면 내림차순
				if (intArr[i] > intArr[i + 1]) {
					int t = intArr[i];
					intArr[i] = intArr[i + 1];
					intArr[i + 1] = t;
				}
			}
		}
		System.out.println("최대값 : " + intArr[intArr.length-1]);
		System.out.println("최소값 : " + intArr[0]);
		
		System.out.println("\n ========================== 3번 =============================");
		
		/*
		 * 로또 번호 생성기

1~45 까지의 랜덤 숫자 6개를 배열에 중복되지 않도록 담고, 이를 정렬한 배열을 리턴하는 makeLotto() 함수를 만들어주세요.
*/
		
		 
		 
//		 int[] myLotto = new int[6];
//		 for (int i = 0; i < myLotto.length; i++) {
//			 myLotto[i] = (int) (Math.random() * 45) + 1;
//			}
//		 Arrays.sort(myLotto);
//		 printArray(myLotto);
		 
//		 int[] myLotto = makeLotto()
		//--------------
		int[] myLotto = mkaeLotto();
		for(int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
		
		System.out.println("\n======================================================\n");
//		// 로또 시뮬레이션
//		int[] winLotto = { 4, 24, 27, 35, 37, 45};
//		int buyCount = 0;
//		while(true) {
//			buyCount++;
//			int[] lotto = mkaeLotto();
//			int cnt = 0;
//			for(int i = 0; i < winLotto.length; i++) {
//				if(winLotto[i] == lotto[i]) {
//					cnt++;
//				}
//			}
//			
//			if(cnt == 6) {
//				System.out.println("1등 당첨!!!!!");
//				System.out.println("구매 횟수: " + buyCount);
//				System.out.println("구매 금액: " + buyCount*1000);
//				break;
//			}else {
//				System.out.println(buyCount + "회차");
//			}
//		}
		
	
		
//		int[] lotto = makeLotto();
		
		
		
		
		
		
		
		
	}
	
	public static int[] mkaeLotto() {
		// 로또 번호 ( 1~45 사이의 랜덤숫자)
		int[] result = new int[6];
		// rand가 result 배열안에 없는 숫자라면 
		// 딤기
		// 종복 없이 로또 번호 6자리를 담기
		int idx = 0;
		outer: while(true) {
			int rand = (int)(Math.random() * 11) + 10;
			for(int i = 0; i < result.length; i++) {
				if(result[i] == rand) {
					continue outer;
				}
			}
			result[idx] = rand;
			idx++;
			if(idx == 6) {
				break;
			}
		}
		Arrays.sort(result);
		
		return result;
	}


	public static int[] makeLotto1() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			}
		Arrays.sort(lotto);
		return lotto;	
	}
	
	
	
	
	public static void printArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if (i == intArray.length - 1) {
				System.out.println(intArray[i]);
				break;
			} else {
				System.out.print(intArray[i] + ",");
			}
		}
	}
}
