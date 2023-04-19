package godonguk.submit_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	private ArrayList<Book> bookList = new ArrayList<>();
	
	
	public Library() {
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";

		String [] strBook = strBooks.split(", ");
		
		for(int i = 0; i < strBook.length; i++)
		{
			strBook[i] = strBook[i].trim();
		}
		
		for(int i = 0; i < strBook.length; i++) {
			bookList.add(new Book(i+1, strBook[i], false));
		}	
	}
	
	private static Library instance = new Library();
	
	public static Library  getInstance() {
		return instance;
	}
	// 책 리스트
	public void showBook() {
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	// 입고 
	public void bookSelect(int no) {
		bookList.get(no-1).bookCheck = false;
		System.out.println(bookList.get(no-1).bookName+ "이(가) 입고되었습니다.");
	}
	// 대여
	public void bookBuy(int no) {
		bookList.get(no-1).bookCheck = true;
		System.out.println(bookList.get(no-1).bookName+ "이(가) 대여되었습니다.");
		
	}
	
	// 검색
	public void bookSearch(String bookName) {
		ArrayList<Book> bookSearch = new ArrayList<>();
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getBookName().contains(bookName)) {
				bookSearch.add(bookList.get(i));
			}
		}
		for(int i = 0; i < bookSearch.size(); i++) {
			System.out.println(bookSearch.get(i));
		}
	}
	// 대여 검색후 하나면 바로 
	public void bookSearch2(String bookName) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> bookSearch = new ArrayList<>();
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getBookName().contains(bookName)) {
				bookSearch.add(bookList.get(i));
			} else if(bookSearch.size() == 1) {
				bookBuy(bookList.get(i-1).bookNum);
				break;
			}
		}
		for(int i = 0; i < bookSearch.size(); i++) {
			System.out.println(bookSearch.get(i));
		}
		System.out.println("책 번호를 입력해주세요 :");
		System.out.print(">>> ");
		int num = Integer.parseInt(scan.nextLine());
		bookBuy(num);
	}
	
}
