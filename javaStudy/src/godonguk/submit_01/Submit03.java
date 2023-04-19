package godonguk.submit_01;

public class Submit03 {
	
	public static void main(String[] args) {
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

