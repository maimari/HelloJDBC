package BookManager;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookManager bm = new BookManager();

		int choice = 0;
		boolean isRun = true;
		
		bm.setBookList();

		while (isRun) {
			System.out.println("== [도서관리 V0.1] ==");
			System.out.println("등록된 도서수 : " + bm.getBookCount() + "권");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 삭제");
			System.out.println("3. 책 리스트");
			System.out.println("4. 책 검색");
			System.out.println("0. 종료");
			System.out.println("==============");

			choice = sc.nextInt();

			if (choice == 1) {
				// 책 등록
				System.out.println("책정보를  입력해주세요 : ");

				System.out.print("책 제목 : ");
				String title = sc.next();

				System.out.print("책 저자 : ");
				String author = sc.next();

				bm.add(title, author);
				
			} else if (choice == 2) {
				// 책 삭제
				System.out.print("삭제할 책 제목을 입력하세요 : ");
				String title = sc.next();
				bm.remove(title);

			} else if (choice == 3) {
				// 책 리스트
				bm.getList();
				
			} else if (choice == 4) {
				// 책 검색
				System.out.println("검색할 책 제목을 입력하세요 : ");
				String title = sc.next();
				bm.searchByTitle(title);
				
			} else if (choice == 0) {
				System.out.println("도서관리 프로그래을 마칩니다.");
				System.out.println("감사합니다.");
				
				isRun = false;
				System.exit(0);
			}
		} 
	}
}
