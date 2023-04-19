package godonguk.submit_03;

public class Submit03 {

	public static void main(String[] args) {

		// 01번 팩토리얼
		long dap = 1l;
		for (long i = 1l; i <= 15; i++) {
			dap = dap * i;
		}
		System.out.println(dap);

		// 02번
	
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int count = 0;
		for(int i = 0; i < findWally.length()-1; i++) {
			String str = findWally.substring(i, i+2);
			if(str.equals("월리")) {
				count++;
				
			}
		}
		System.out.println("월리의 숫자는 : " + count);
		
		//03번
		String stars = "*****";
		for(int i = 0; i < 5; i++) {
			String str = stars.substring(i);
			System.out.println(str);
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
}

// 02 번

