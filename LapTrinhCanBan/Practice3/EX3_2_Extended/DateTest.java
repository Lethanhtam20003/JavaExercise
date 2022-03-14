package EX3_2_Extended;

import junit.framework.TestCase;

public class DateTest extends TestCase {
	public void testContructor() {
		new Date(12,12,2022);
		new Date(1,1,2001);
	}
public void testcurrentAuthor() {
		Date d1 = new Date(12,12,2022);
		Date d2 = new Date(1,1,1999);

		assertEquals(d1.currentAuthor(), false);
		assertEquals(d2.currentAuthor(), true);
	}
}
