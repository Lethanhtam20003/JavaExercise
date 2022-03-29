/**
 * 
 */
package Ex8_4;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class IBookTest extends TestCase {
	public void testConstructor() {
		ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
		ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
		ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
		
		IBook b = new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook())));
		System.out.println("test Constructor: ");
		System.out.println(b);
	}
	public void testThisAuthor() {
		ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
		ABook b2 = new HardCover("chi pheo", "nguyen tuan", 100000, 1980);
		ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
		
		IBook b = new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook())));
		assertEquals(b.thisAuthor("nguyen tuan"), new ConsBook(b3, new ConsBook( b2, new MTBook())));
	}
	public void testSoftByTitle() {
		ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
		ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
		ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
		
		IBook b = new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook())));
		assertEquals(b.softByTitle(), new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook()))));
	}

}
