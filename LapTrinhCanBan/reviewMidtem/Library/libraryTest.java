package Library;

import junit.framework.TestCase;

public class libraryTest extends TestCase {
	public void testConstructor() {
		Book b = new Book(102, "How to design class hierarchies", "MIT Press", 5, "Tin học", "Matthias Felleisen",
				2004);

		CD c = new CD(1023, "Nỗi Lòng Người Đi", null, 7, "anh Tho");

		Magazine m = new Magazine(143, "Thế giới vi tính", "PC World VN", 3, 20);
		
		System.out.println(b+"\n"+c+"\n"+m);
	}

	Book b = new Book(102, "How to design class hierarchies", "MIT Press", 5, "Tin học", "Matthias Felleisen", 2004);

	CD c = new CD(1023, "Nỗi Lòng Người Đi", null, 7, "anh Tho");

	Magazine m = new Magazine(143, "Thế giới vi tính", "PC World VN", 3, 20);

	public void testSmallthan() {
		assertEquals(c.smallerThan(b), false);
		assertEquals(b.smallerThan(c), true);
	}
	
	public void testOverdueDays() {
		assertEquals(b.overDueDays(10), 5);
		assertEquals(c.overDueDays(10), 3);
		assertEquals(m.overDueDays(2), 0);
	}
	
	public void testfine() {
		assertEquals(b.fine(10), 20000);
		assertEquals(b.fine(30), 50000);
		assertEquals(c.fine(10), 6000);
		assertEquals(m.fine(10), 7000);
	}

}