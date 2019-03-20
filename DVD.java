
public class DVD extends LibraryItem{
	private int code = 4000;
	
	public DVD(String title) {
		super(title);
		super.title = title;
		code++;
		code = code + super.itemNumber;
		super.reference = true;
		super.status = "unavailable";
	}
	
	public String toString() {
		return getClass().toString().substring(6) + ", Item Number: " + code + ", " + this.title +  ". "
			 + "DVDs are unavailable for check out. ";
	}
}
