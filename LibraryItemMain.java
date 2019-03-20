
public class LibraryItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("John Smith", "Java for Beginners");
		System.out.println(book1.toString());
		Magazine magazine1 = new Magazine("Java Life", "January", 2019);
		System.out.println(magazine1.toString());
		CD CD1 = new CD("Music for Java Programmers", "Java Lover");
		System.out.println(CD1.toString());
		DVD DVD1 = new DVD("Java Programming for Beginners");
		System.out.println(DVD1.toString());
		
		book1.reserveItem(); //reserve item
		System.out.println(book1.toString());//updated status
		System.out.println(book1.checkOut());//attempt check out
		System.out.println("Fines due for this item are: $" + book1.getFines(3));//check fine amount for 3 day late turn in
		

	}

}
