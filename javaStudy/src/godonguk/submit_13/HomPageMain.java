package godonguk.submit_13;

import java.util.ArrayList;
import java.util.Scanner;

import ch14_jdbc_jsp.vo.StudentVO;

public class HomPageMain {

	public static void main(String[] args) {
		HomePageService homeService = HomePageService.getInstance();
		BoardService boardService = BoardService.getInstance();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("행동을 선택해주세요:");
			System.out.println("1. 회원가입 | 2. 로그인 | 3.종료 | 4.(임시) 조회");
			System.out.print(">>> : ");

			int command = 0;

			try {
				command = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요");
				continue;
			}

			if (command == 1) {
				// TODO 회원가입
				System.out.print("아이디 : ");
				String id = scan.nextLine();

				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();

				ArrayList<HomePageVO> emasd = homeService.getEmList();
				if (emasd.size() == 0) {
					homeService.registEmployees(id, pw);
				} else {
					for (int i = 0; i < emasd.size(); i++) {
						if (emasd.get(i).getEmId().equals(id)) {
							System.out.println("중복된 아이디");
							break;
						} else {
							homeService.registEmployees(id, pw);
							break;
						}
					}
				}

			} else if (command == 2) {
				// TODO 로그인
				System.out.print("아이디 : ");
				String id = scan.nextLine();

				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();

				HomePageVO employees = new HomePageVO();

				employees.setEmId(id);
				employees.setEmPassword(pw);

				HomePageVO login = homeService.login(employees);
				if (login.getEmId() != null) {
					// 로그인 성공
					System.out.println(login.getEmId() + "님 환영합니다.");

					while (true) {
						System.out.println("행동을 선택해 주세요");
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>> ");

						int select = 0;

						try {
							select = Integer.parseInt(scan.nextLine());
						} catch (NumberFormatException e) {
							System.out.println("숫자를 입력해 주세요");
							continue;
						}

						if (select == 1) {
							// TODO 글쓰기
							int textNum = 0;
							System.out.print("글 제목을 입력해주세요: ");
							String title = scan.nextLine();

							System.out.print("글 내용을 입력해주세요 : ");
							String content = scan.nextLine();

							boardService.boardWrite(title, content);

						} else if (select == 2) {
							// TODO 글조회

							System.out.println("글번호를 입력해주세요");
							command = Integer.parseInt(scan.nextLine());
							ArrayList<BoardVO> boardList = boardService.getBoardList();
							if (0 < boardList.size()) {
								for (int i = 0; i < boardList.size(); i++) {
									if (command == boardList.get(i).getBoardNum()) {
										System.out.println("제목" + boardList.get(i).getBoardTitle());
										System.out.println("작성자: " + login.getEmId());
										System.out.println("글내용: " + boardList.get(i).getBoardContent());
									}

								}
							}

						} else if (select == 3) {
							// 로그아웃
							break;
						}

					}

				} else {
					System.out.println("입력된 정보가 잘못되었습니다.");
					continue;
				}

			} else if (command == 3) {
				System.out.println("종료 되었습니다.");
				break;
			} else if (command == 4) {
				// TODO 임시조회
				ArrayList<HomePageVO> emList = homeService.getEmList();
				for (int i = 0; i < emList.size(); i++) {
					System.out.println(emList.get(i));
				}
			} else {
				System.out.println("다시 입력해주세요 ");
			}

		}

	}

}
