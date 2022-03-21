package Ex8_4;

import junit.framework.TestCase;

public class SaleTest extends TestCase {

	public void testontructor() {
		ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
	}
	
	public void testsalePrice() {
		ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
		assertEquals(b1.salePrice(), 25000.0);
	}
}
