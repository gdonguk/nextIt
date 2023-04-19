package godonguk.submit_05;

public class Submit05 {

	public static void main(String[] args) {

		System.out.println("\n=============== 01번 =================\n");
		makeTree(5);
		makeTree(7);
		
		System.out.println("\n=============== 02번 =================\n");
		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
		
		System.out.println("\n=============== 03번 =================\n");
		
		String myBinaryStr = makeBinary(23);
		System.out.println(myBinaryStr);

	}
	public static String makeBinary(int num) {
		String dap = "";
		String sum = "";
		boolean sad = true;
		while(sad) {
			if(num % 2 == 1) {
				dap = (num % 2) + "";
				num = num / 2;
			}else if(num % 2 ==0) {
				dap = (num%2) + "";
				num = num / 2;
			}
			sum = dap + sum;
			if(num == 0) {
				sad = false;
			}
		}
		return sum;
	}
	
	public static String reverseStr(String insert) {
		String sum = "";
		String suzu = "";
		for(int i = insert.length()-1; i >= 0; i --) {
			suzu = insert.substring(i, i+1);
			sum += suzu;
		}
		return sum;
	}
//	System.out.println("거꾸로 뒤잡을 문자열 입력:");
//	System.out.print(">>>>");
//	String input = scan.nextLine();
//	String suzu = "";
//	String sum ="";
//	for(int i = input.length()-1; i >= 0; i--) {
//		suzu = input.substring(i, i+1);
//		sum += suzu;
//		}
//	System.out.print("뒤집은 결과 : " + sum);

/*	
 * */
	
	public static void makeTree(int num) {
		for (int i = 0; i < num; i++) {
			String space = "";
			for (int k = 0; k < (num - 1) - i; k++) {
				space += " ";
			}
			String stars = "";
			for (int k = 0; k < i * 2 + 1; k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
	}
}
