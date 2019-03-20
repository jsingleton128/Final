
public abstract class LibraryItem {
	//fields
	static int itemNumber = 1; //item number for library item
	public String title; //title of library item
	public double fineAmt; //Fine amount for library item if returned late
	public boolean reference; //If item is a reference item, it cannot be checked out
	public String status; //Status of library item (Available, Unavailable Reserved, Checked in, Checked Out)
	
	//Constructors
	//default
	public LibraryItem(String title) {
		//this.itemNumber++;
		this.title = title;
		this.fineAmt = 1.00;
		this.reference = false;
		this.status = "available";
		this.itemNumber++;
	}
	


	//methods
	public String reserveItem() {
		if (this.status != "available") {
			return "This library item is not available to reserve.";
		} else {
			this.status = "reserved";
			return "This library item has been reserved.";
		}
	}
	
	public String checkIn() {
			this.status = "available";
			return "This library item has been checked in.";
	}
	
	public String checkOut() {
		if (this.status != "available" || this.reference == true) {
			return "This library item is not available for check out.";
		} else {
			this.status = "checked out";
			return "This library item has been checked out.";
		}
	}
	
	public double getFines(int daysLate) {//calculates fine amount based on number of days late.
		return this.fineAmt * daysLate;
	}
	
	public abstract String toString();
	

}
