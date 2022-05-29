/**
 * 
 */
package BT4;

import BT9_13.ABook;
import BT9_13.HardCover;
import BT9_13.PaperBack;
import BT9_13.Sale;
import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class ABookTest extends TestCase {

	ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
	ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
	ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);

	public void testsalePrice() {
		assertEquals(b1.salePrice(), 25000.0);
		assertEquals(b2.salePrice(), 80000.0);
		assertEquals(b3.salePrice(), 120000.0);
	}

	public void testCheaperThen() {
		assertEquals(b1.CheaperThen(b2), true);
		assertEquals(b3.CheaperThen(b2), false);
	}

	public void testSameAthor() {
		assertEquals(b2.sameAuthor("nam cao"), true);
		assertEquals(b2.sameAuthor("vu trong phung"), false);
	}

}
