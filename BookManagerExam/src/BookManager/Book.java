package BookManager;

public class Book {
	private String title; // å����
	private String author; // ����

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book() {
		
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
        
	}

	@Override
	public String toString() {
		return "å����: " + title + ", ����: " + author;
	}
	
}
