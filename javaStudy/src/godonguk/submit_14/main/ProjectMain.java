package godonguk.submit_14.main;

import java.util.ArrayList;
import java.util.Scanner;

import godonguk.submit_13.HomePageVO;
import godonguk.submit_14.service.MemberService;
import godonguk.submit_14.vo.MemberVO;

public class ProjectMain {

	public static void main(String[] args) {
		MemberService memberService = MemberService.getInstance();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("행동을 선택해주세요:");
			System.out.println("1(임시) 조회 || 2.(임시) 회원가입 || 3.(임시)로그인");
			System.out.print(">>> : ");

			int command = 0;

			try {
				command = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요");
				continue;
			}

			if (command == 1) {
				ArrayList<MemberVO> memberList = memberService.getMemberList();
				for (int i = 0; i < memberList.size(); i++) {
					System.out.println(memberList.get(i));
				}
			} else if (command == 2) {
				// TODO 회원가입

				System.out.print("이름 : ");
				String nickName = scan.nextLine();

				System.out.print("아이디 : ");
				String id = scan.nextLine();

				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();

				ArrayList<MemberVO> emasd = memberService.getMemberList();
				if (emasd.size() == 0) {
					memberService.registMember(nickName, id, pw);
				} else {
					for (int i = 0; i < emasd.size(); i++) {
						if (emasd.get(i).getId().equals(id)) {
							System.out.println("중복된 아이디");
							break;
						} else {
							memberService.registMember(nickName, id, pw);
							break;
						}
					}
				}
			} else if (command == 3) {
				// TODO 로그인
				System.out.print("아이디 : ");
				String id = scan.nextLine();

				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();

				MemberVO member = new MemberVO();

				member.setId(id);
				member.setPassword(pw);

				MemberVO login = memberService.login(member);
				if (login.getId() != null) {
					// 로그인 성공
					System.out.println(login.getId() + "님 환영합니다.");
					
					while(true) {
						// 뭐하지
						System.out.println("1. ");
						System.out.println("하이요 ");
						break;
					}
					
				}else {
					System.out.println("로그인 실패 다시");
					continue;
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
