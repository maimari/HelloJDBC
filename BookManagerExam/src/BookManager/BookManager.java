package BookManager;

public class BookManager {
	int MAX_SIZE = 100; // ���� �ִ� �Ǽ�
	Book[] bookList = new Book[MAX_SIZE]; // å�� ������ ����Ȯ��
	int size = 0; // ���� å�� �Ǽ�

	// �׽�Ʈ�� å�� 5���߰� �Ѵ�.
	public void setBookList() {
		// 1��° å �߰�
		add("�Ŀ��ڹ�", "���Ǵ�Ƽ");
				
		// 2��° å �߰�		
		add("��ǰ�ڹ�", "�������ǻ�");
				
		// 3��° å �߰�		
		add("�ڹ�������", "��������");
		
		// 4��° å �߰�
		add("ȥ�ڰ����ϴ��ڹ�", "�Ѻ����ǻ�");
		
		// 5��° å �߰�		
		add("������", "���۰����ڵ���");
		
	}
	
	// å �ѱ� �߰�
	public void add(String title, String author) {
		Book b = new Book();
		b.setTitle(title);
		b.setAuthor(author);

		bookList[size++] = b;

	}

	// å �ѱ� ����
	public void remove(String title) {
		System.out.println("*******å ����*******");
		
		// ��ü ������ �ִ� å�� ����ŭ ������ ����.
		for (int i = 0; i < size; i++) {
			// ���� ������ å(=title)�� ������ �ִ� å�� ���(=books)���� �߰ߵǸ�
			// å�� �����ϰ�, �����ִ� å�� ������ �ε����� �����Ͽ� å�� ����Ʈ�� ���� ����
			if (bookList[i].getTitle().equals(title)) {
				for (; i < size; i++)
					bookList[i] = bookList[i + 1];
			}
			size--;
		}
		
		System.out.println("~~~ ���� �Ϸ�! ~~~ ");
		System.out.println("");
	}

	// ��ü å ���� ���
	public void getList() {
		System.out.println("*******å ����Ʈ*******");
		for (int i = 0; i < size; i++) {
			System.out.println("[" + (i + 1) + "] " + bookList[i]);
		}
		
		System.out.println("");
	}
	
	// å�̸����� �˻�
	public void searchByTitle(String title) {
		System.out.println("*******å �˻�*******");
		for (int i = 0; i < size; i++) {
			
			// �߰��Ϸ��� å(=title)�� å���(=books)����Ʈ�� �ִ��� �˻�
			// �̰��� ��Ȯ�� å������ ������ ���� ���ؾ� �ϹǷ� equals���
			// �������α׷������� �ܼ����̹Ƿ� �߰ߵ� å ��� ���
			if (bookList[i].getTitle().equals(title)) {
				System.out.println(bookList[i]);
			}
		}
		System.out.println("~~~ �˻� �Ϸ�! ~~~ ");
		System.out.println("");
	}
	
	// ���� ��ϵ� å�� ��������
	public int getBookCount() {
		return this.size;
	}
}
