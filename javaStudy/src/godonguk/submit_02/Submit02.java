package godonguk.submit_02;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	/*	
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>> ");
		int kor = Integer.parseInt(scan.nextLine());
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>> ");
		int eng = Integer.parseInt(scan.nextLine());
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>> ");
		int math = Integer.parseInt(scan.nextLine());
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		double hap = (double)(kor+eng+math)/3;
		System.out.printf("평균: %.02f\n", hap);
		
		String grade = (hap >= 90) ? ("A") : ((hap > 80) ? ("B") : ("C"));
		System.out.println("등급: " +grade);
		*/
		
		// 02번
		
		
		String idBack = "1231476";
		
		String first = idBack.substring(0,1);	
		int int1 = Integer.parseInt(idBack.substring(0,1));
		String checkInt = (int1 % 2 == 1) ? ("남") : ("여");
		System.out.println(checkInt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
