/**
 * 
 */
package BT9_13;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class IBookTest extends TestCase {
		ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
		ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
		ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
		
		ABook a1 = new Sale("Robinson Crusoe", "Daniel Defoe", 1550, 1719);
		ABook a2 = new HardCover("Heart of Darkness", "Joseph Conrad", 1550, 1719);
		ABook a3 = new PaperBack("Beach Music", "Pat Conroy", 1550, 1719);
		
	public void testConstructor() {
		IBook a = new ConsBook(a3, new ConsBook(a2, new ConsBook(a1, new MTBook())));
		IBook b = new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook())));
		System.out.println("test Constructor: ");
		System.out.println(a +"\n"+ b);
	}

	public void testThisAuthor() {
		IBook b = new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook())));
		IBook a = new ConsBook(b2, new MTBook());
		assertEquals(b.thisAuthor("nam cao"),a);
	}

	public void testSoftByTitle() {
		IBook b = new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook())));
		assertEquals(b.softByTitle(), new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook()))));
	}

}
