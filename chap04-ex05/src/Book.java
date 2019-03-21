public class Book {
	String title;
	String author;

	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this(" ", " ");
		
	}

	public Book(String title){
		this(title, "작자미상");
	}
	
	public Book(String title, String author) {
		this.title =title;
		this.author = author;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("어린이","유정재");
		Book loveStory = new Book("간영웅전");
		Book emptyBook = new Book();
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
		
		

	}

}
