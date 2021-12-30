package Ex_4_8_Book;

import junit.framework.TestCase;

public class PaperBackTest extends TestCase {

	public void testontructor() {
		ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
	}
	
	public void testsalePrice() {
		ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
		assertEquals(b3.salePrice(), 120000.0);
	}

}
