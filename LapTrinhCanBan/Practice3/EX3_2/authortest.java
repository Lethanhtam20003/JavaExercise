package EX3_2;


import junit.framework.TestCase;

public class authortest extends TestCase {
	public void testContructor() {
		new author("tam", 1999);
	}
	// 1.thisAuthor 2.sameAuthor 3.sameGeneration
	public void testthisauthor() {
		author a = new author("XuanQuynh", 1954);
		author b = new author("XuanDieu", 1970);
		assertEquals(a.thisAuthor("XuanDieu"), false);
		assertEquals(b.thisAuthor("XuanDieu"), true);
	}
	public void testsameAuthor() {
		author a = new author("XuanQuynh", 1954);
		author b = new author("XuanDieu", 1970);
		author c = new author("XuanQuynh", 1954); 
		assertEquals(a.sameAuthor(b), false);
		assertEquals(a.sameAuthor(c), true);
	}
	public void testsammeGenerration() {

		author a = new author("XuanQuynh", 1954);
		author b = new author("XuanDieu", 1970);
		author c = new author("XuanQuynh", 1954); 
		assertEquals(a.sameGeneration(a), true);
		assertEquals(b.sameGeneration(c),false);
	}
}
