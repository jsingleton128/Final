
public class Book extends LibraryItem {
	int code = 1000;
	String author;
	public Book(String author, String title) {
		super(title);
		this.author = author;
		code++;
		code = code + super.itemNumber;
	}

	public String toString() {
		return getClass().toString().substring(6) + ", Item Number: " + code + ", " + this.title + ", by " + this.author + ". "
			+ "Status: " + this.status;
}


}