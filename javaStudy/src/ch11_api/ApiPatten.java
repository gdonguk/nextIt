package ch11_api;

import java.util.regex.Pattern;

public class ApiPatten {

	public static void main(String[] args) {
		// 정규표현식 (Regular Expression)
		// 특정한 규칙을 가진 문자열의 집합을
		// 표현하기 위해 쓰는 방식
		
		// 전화번호 (3자리-4자리-4자리), (전부 숫자)
		// 주민등록번호 (6자리-7자리), (전부 숫자)
		// 이메일 (영어와 숫자로 이루어진 문자열@영어문자열.영어
		// 위와 같이 정해진 형식에 대해 정규표현식과 
		// Pattern 을 이용하면 검증할 수 있다.
		
		// 숫자만 존재하는지 검증 (Validation)
		String example = "137657863";
		// 문자열의 시작과 끝 사이에 숫자가 1개 이상인지(+) 체크
		String regex = "^[0-9]+$";
		
		// Pattern.matches를 하면 검증 결과가 true/false로 리턴
		boolean result = Pattern.matches(regex, example);
		System.out.println(result);
		
		// 문자열에 .matches(regex) 해도 된다.
		System.out.println(example.matches(regex));
		
		// 숫자만 존재하는지 검증2
		// [0-9] = \\d
		regex ="\\d+";
		
		result = Pattern.matches(regex, example);
		System.out.println(result);
		
		System.out.println("\n=================== 알파벳 검증 ===============\n");
		
		// 알파벳만 존재하는지 검증
		example = "JeongChanung";
		regex = "[a-zA-Z]+";
		
		result = Pattern.matches(regex, example);
		System.out.println(result);

		// 띄어쓰기를 포함 시키기
		example = "Jeong Chanung";
		regex = "[a-zA-Z\\s]+";
		result = Pattern.matches(regex, example);
		System.out.println(result);

		System.out.println("\n============= 한글 검증 ============\n");
		
		// 한글만 존재하는지 검증
		example = "찬웅ㄱㄱㅏㅑ";
		regex = "[가-힣ㄱ-ㅎㅏ-ㅣ]+";
		result = Pattern.matches(regex, example);
		System.out.println(result);
		
		System.out.println("\n========== 비밀번호 패턴 ===============\n");
		
		// 6자리 숫자 like pin 번호
		example = "637843123231";
		regex = "[0-9]{6,}";
		result = Pattern.matches(regex, example);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
