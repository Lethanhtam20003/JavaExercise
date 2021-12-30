package ontap_1;

import junit.framework.TestCase;

public class Authortest extends TestCase {
	public void testContructor() {
		new Author("tam", 1999);
	}
	// 1.thisAuthor 2.sameAuthor 3.sameGeneration
	public void testthisauthor() {
		Author a = new Author("XuanQuynh", 1954);
		Author b = new Author("XuanDieu", 1970);
		assertEquals(a.thisAuthor("XuanDieu"), false);
		assertEquals(b.thisAuthor("XuanDieu"), true);
	}
	public void testsameAuthor() {
		Author a = new Author("XuanQuynh", 1954);
		Author b = new Author("XuanDieu", 1970);
		Author c = new Author("XuanQuynh", 1954); 
		assertEquals(a.sameAuthor(b), false);
		assertEquals(a.sameAuthor(c), true);
	}
	public void testsammeGenerration() {

		Author a = new Author("XuanQuynh", 1954);
		Author b = new Author("XuanDieu", 1970);
		Author c = new Author("XuanQuynh", 1954); 
		assertEquals(a.sameGeneration(a), true);
		assertEquals(b.sameGeneration(c),false);
	}
}
