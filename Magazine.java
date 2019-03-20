
public class Magazine extends LibraryItem{
	private int code = 2000;
	public String month;
	public int year;
	
	public Magazine(String title, String Month, int Year) {
		super(title);
		code++;
		code = code + super.itemNumber;
		super.reference = true;
		super.status = "unavailable";
		this.month = Month;
		this.year = Year;
	}
	
	public String toString() {
		return getClass().toString().substring(6) + ", Item Number: " + code + ", " + this.title  + ". "
			+ "Magazines are unavailable for check out. ";
	}
}

