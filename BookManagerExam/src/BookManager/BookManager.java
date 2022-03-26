package BookManager;

public class BookManager {
	int MAX_SIZE = 100; // 북의 최대 권수
	Book[] bookList = new Book[MAX_SIZE]; // 책을 저장할 공간확보
	int size = 0; // 현재 책의 권수

	// 테스트로 책을 5권추가 한다.
	public void setBookList() {
		// 1번째 책 추가
		add("파워자바", "인피니티");
				
		// 2번째 책 추가		
		add("명품자바", "생능출판사");
				
		// 3번째 책 추가		
		add("자바의정석", "도우출판");
		
		// 4번째 책 추가
		add("혼자공부하는자바", "한빛출판사");
		
		// 5번째 책 추가		
		add("스프링", "구멍가게코딩단");
		
	}
	
	// 책 한권 추가
	public void add(String title, String author) {
		Book b = new Book();
		b.setTitle(title);
		b.setAuthor(author);

		bookList[size++] = b;

	}

	// 책 한권 삭제
	public void remove(String title) {
		System.out.println("*******책 삭제*******");
		
		// 전체 가지고 있는 책의 수만큼 루프를 돈다.
		for (int i = 0; i < size; i++) {
			// 만일 삭제할 책(=title)이 가지고 있는 책의 목록(=books)에서 발견되면
			// 책을 삭제하고, 남아있는 책을 삭제한 인덱스로 복사하여 책의 리스트를 새로 만듦
			if (bookList[i].getTitle().equals(title)) {
				for (; i < size; i++)
					bookList[i] = bookList[i + 1];
			}
			size--;
		}
		
		System.out.println("~~~ 삭제 완료! ~~~ ");
		System.out.println("");
	}

	// 전체 책 정보 출력
	public void getList() {
		System.out.println("*******책 리스트*******");
		for (int i = 0; i < size; i++) {
			System.out.println("[" + (i + 1) + "] " + bookList[i]);
		}
		
		System.out.println("");
	}
	
	// 책이름으로 검색
	public void searchByTitle(String title) {
		System.out.println("*******책 검색*******");
		for (int i = 0; i < size; i++) {
			
			// 발견하려는 책(=title)이 책목록(=books)리스트에 있는지 검사
			// 이것은 정확한 책제목을 값으로 서로 비교해야 하므로 equals사용
			// 지금프로그램에서는 단순비교이므로 발견된 책 모두 출력
			if (bookList[i].getTitle().equals(title)) {
				System.out.println(bookList[i]);
			}
		}
		System.out.println("~~~ 검색 완료! ~~~ ");
		System.out.println("");
	}
	
	// 현재 등록된 책수 가져오기
	public int getBookCount() {
		return this.size;
	}
}
