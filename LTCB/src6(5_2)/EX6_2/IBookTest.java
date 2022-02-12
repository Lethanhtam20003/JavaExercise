package EX6_2;

import junit.framework.TestCase;

public class IBookTest extends TestCase {
	public void testConstructor() {
		// Testing for the constructor of ABook
		   ABook b1 = new ABook(" ong lao danh ca","lubinson",150000,1998);
		   ABook b2 = new ABook(" chiec thuyen ngoai xa","Nguyen Minh Chau",200000,1975);
		   ABook b3 = new ABook("Mot Bong Hoa"," LE Tu Uyen",50000,2005);
	    // Testing for the Constructor of ConsBook 
		  IBook i1 = new ConsBook(b1, new ConsBook(b2,new ConsBook(b3, new MTBook())));
	}
}
