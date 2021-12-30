package ontap_1;

import junit.framework.TestCase;

public class BookTest extends TestCase{
	public void testContructor() {
		new Book("con ca", 15000,2000, new Author("bede", 1950));
	}
	public void testcurrentBook() {
		Book ex = new Book("con ca", 15000,2020, new Author("alim", 1950));
		assertEquals(ex.currentBook(), 2020);
	}
	public void testcurrentAuthor() {
		Book ex = new Book("con ca", 15000,2000, new Author("alim", 1950));
	assertEquals(ex.currentAuthor(), true);
	}
	public void testthisauthor() {
		Book ex = new Book("con ca", 15000,2000, new Author("alim", 1950));
		assertEquals(ex.thisAuthor("bede"), false);
	}
	public void testsameAuthor() {
		Book ex = new Book("con ca", 15000,2000, new Author("alim", 1950));
		Book ex2 = new Book("con ca", 14000,2000, new Author("alim", 1950));
		assertEquals(ex.sameAuthor(ex2), true);
	}
	public void testsameGeneration() {
		Book ex = new Book("con ca", 15000,2000, new Author("alim", 1950));
		Book ex2 = new Book("con ca", 15000,2000, new Author("alim", 1960));
		Book ex3 = new Book("con ca", 15000,2000, new Author("alim", 1954));
		assertEquals(ex.sameGeneration(ex2), false);
		assertEquals(ex.sameGeneration(ex3), true);
	}
}
