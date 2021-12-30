/**
 * 
 */
package Ex_4_8_Book;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class HardCoverTest extends TestCase {
	/**
	 * Testing constructor
	 
	 */
	public void testConstructor() {
		ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
	}
	/**
	 * Testing salePrice
	 
	 */
public void testsalePrice() {
		ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
		assertEquals(b2.salePrice(), 80000.0);
	}

}
