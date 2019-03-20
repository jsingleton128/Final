
public class CD extends LibraryItem{
	private int code = 3000;
	String artist;
	
	public CD(String title, String artist) {
		super(title);
		super.title = title;
		code++;
		code = code + super.itemNumber;
		this.artist = artist;
	}
	
	public String toString() {
		return getClass().toString().substring(6) + ", Item Number: " + code + ", " + this.title + ", by " + this.artist + ". "
			 + "Status: " + super.status;
	}
}
