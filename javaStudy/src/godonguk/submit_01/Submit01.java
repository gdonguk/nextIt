package godonguk.submit_01;

public class Submit01 {

	public static void main(String[] args) {
		String name = "고동욱";
		int age = 26;
		double height = 173.3;
		String phone = "010-4013-4863";
		String email = "donguk1543@gmail.com";
				
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("연락처 : " + phone);
		System.out.println("이메일 : " + email);
		
		//2
		String enigma = "너오구늘리뭐너먹구지리";
		System.out.println(enigma.replace("너", ""));
		enigma = enigma.replace("너", "");
		System.out.println(enigma.replace("구", ""));
		enigma = enigma.replace("구", "");
		System.out.println(enigma.replace("리", ""));
		enigma = enigma.replace("리", "");
		
		//3
	int example = 278;
		
		System.out.println(example + "");
		
		String dap = example+"";
		// substring 추천
		String str1 = dap.substring(0,1);
		String str2 = dap.substring(1,2);
		String str3 = dap.substring(2,3);
		
		int int1 = Integer.parseInt(dap.substring(0,1));
		int int2 = Integer.parseInt(dap.substring(1,2));
		int int3 = Integer.parseInt(dap.substring(2,3));
		
		int result = Integer.parseInt(dap.substring(0,1)) + Integer.parseInt(dap.substring(1,2)) + Integer.parseInt(dap.substring(2,3));
		
		System.out.println("합: " + Integer.parseInt(dap.substring(0,1)) + Integer.parseInt(dap.substring(1,2)) + Integer.parseInt(dap.substring(2,3)));
		
		
		int one  = Integer.parseInt(dap.charAt(0)+"");
		int two  = Integer.parseInt(dap.charAt(1)+"");
		int three  = Integer.parseInt(dap.charAt(2)+"");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println("합: " + (one+two+three));
	}

}
