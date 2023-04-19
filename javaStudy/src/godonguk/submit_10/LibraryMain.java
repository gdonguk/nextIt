package godonguk.submit_10;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {

		Library library = Library.getInstance();

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("행동을 선택해 주세요");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
			System.out.print(">>> ");
			int select = Integer.parseInt(scan.nextLine());

			if (select == 1) {
				// TODO 책 입고
				System.out.println("책 번호를 입력해주세요 :");
				System.out.print(">>> ");
				int no = Integer.parseInt(scan.nextLine());
				library.bookSelect(no);

			} else if (select == 2) {
				// TODO 책 대여
				System.out.println("책 이름을 입력해주세요 :");
				System.out.print(">>> ");
				String bookName = scan.nextLine();
				library.bookSearch2(bookName);
//				System.out.println("책 번호를 입력해주세요 :");
//				System.out.print(">>> ");
//				int num = Integer.parseInt(scan.nextLine());
//				library.bookBuy(num);

			} else if (select == 3) {
				// TODO 책 목록
				library.showBook();

			} else if (select == 4) {
				// TODO 책 검색
				System.out.println("책 이름를 입력해주세요 :");
				System.out.print(">>> ");
				String bookName = scan.nextLine();
				library.bookSearch(bookName);
			} else {
				// 종료
				System.out.println("종료");
				break;
			}
		}

	}

}
