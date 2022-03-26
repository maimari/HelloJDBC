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
			System.out.println("== [�������� V0.1] ==");
			System.out.println("��ϵ� ������ : " + bm.getBookCount() + "��");
			System.out.println("1. å ���");
			System.out.println("2. å ����");
			System.out.println("3. å ����Ʈ");
			System.out.println("4. å �˻�");
			System.out.println("0. ����");
			System.out.println("==============");

			choice = sc.nextInt();

			if (choice == 1) {
				// å ���
				System.out.println("å������  �Է����ּ��� : ");

				System.out.print("å ���� : ");
				String title = sc.next();

				System.out.print("å ���� : ");
				String author = sc.next();

				bm.add(title, author);
				
			} else if (choice == 2) {
				// å ����
				System.out.print("������ å ������ �Է��ϼ��� : ");
				String title = sc.next();
				bm.remove(title);

			} else if (choice == 3) {
				// å ����Ʈ
				bm.getList();
				
			} else if (choice == 4) {
				// å �˻�
				System.out.println("�˻��� å ������ �Է��ϼ��� : ");
				String title = sc.next();
				bm.searchByTitle(title);
				
			} else if (choice == 0) {
				System.out.println("�������� ���α׷��� ��Ĩ�ϴ�.");
				System.out.println("�����մϴ�.");
				
				isRun = false;
				System.exit(0);
			}
		} 
	}
}
