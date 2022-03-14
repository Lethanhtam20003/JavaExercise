package EX3_2;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	public void testContructor() {
		new Book("con ca", 2000, new author("bede", 1950));
	}

	public void testcurrentBook() {
		Book ex = new Book("con ca", 2000, new author("alim", 1950));
		Book ex2 = new Book("con ca", 2022, new author("alim", 2022));
		assertEquals(ex.currentBook(), true);
		assertEquals(ex2.currentBook(), false);
	}

	public void testcurrentAuthor() {
		 Book ex = new Book("con ca", 2000, new author("alim", 1950));
		 Book ex2 = new Book("con ca", 2000, new author("alim", 2022));
		 assertEquals(ex.currentAuthor(), false);
		 assertEquals(ex2.currentAuthor(), true);
	}

	public void testthisauthor() {
		 Book ex = new Book("con ca", 2000, new author("alim", 1950));
		 Book ex2 = new Book("con ca", 2000, new author("alim", 2022));
		 assertEquals(ex.thisAuthor("bede"), false);
		 assertEquals(ex2.thisAuthor("alim"),true);
	}

	public void testsameAuthor() {
		 Book ex = new Book("con ca", 2000, new author("alim", 1950));
		 Book ex2 = new Book("con ca", 2000, new author("alim", 1950));
		 Book ex3 = new Book("con ca", 2000, new author("chita", 1950));
		 assertEquals(ex.sameAuthor(ex2), true);
		 assertEquals(ex2.sameAuthor(ex3), false);
	}

	public void testsameGeneration() {
		 Book ex = new Book("con ca", 2000, new author("alim", 1950));
		 Book ex2 = new Book("con ca", 2000, new author("alim", 1950));
		 Book ex3 = new Book("con ca", 2000, new author("chita", 1970));
		 assertEquals(ex.sameGeneration(ex2), true);
		 assertEquals(ex2.sameGeneration(ex3),false);
	}
}
