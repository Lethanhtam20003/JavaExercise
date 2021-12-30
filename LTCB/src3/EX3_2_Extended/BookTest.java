package EX3_2_Extended;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	public void testContructor() {
		 Date d1 = new Date(12,12,1450);
		 Date d2 = new Date(1,1,1901);
		 Author a1 = new Author("nguyen du",d1);
		 Author a2 = new Author("phan boi chau",d2);
		 Book ex1 = new Book("truyen kieu", 1521,a1);
		 Book ex2 = new Book("tau khong nguoi", 2022, a2);
	}

	public void testcurrentBook() {
		 Date d1 = new Date(12,12,1450);
		 Date d2 = new Date(1,1,1901);
		 Author a1 = new Author("nguyen du",d1);
		 Author a2 = new Author("phan boi chau",d2);
		 Book ex1 = new Book("truyen kieu", 1521,a1);
		 Book ex2 = new Book("tau khong nguoi", 2022, a2);
		 assertEquals(ex1.currentBook(), true);
		 assertEquals(ex2.currentBook(),false);
	}

	public void testcurrentAuthor() {
		 Date d1 = new Date(12,12,1450);
		 Date d2 = new Date(1,1,2001);
		 
		 Author a1 = new Author("nguyen du",d1);
		 Author a2 = new Author("phan boi chau",d2);
		 
		 Book ex1 = new Book("truyen kieu", 1521,a1);
		 Book ex2 = new Book("tau khong nguoi", 1987, a2);
		 
		 assertEquals(ex1.currentAuthor(), true);
		 assertEquals(ex2.currentAuthor(), false);
	}

	public void testthisauthor() {
		 Date d1 = new Date(12,12,1450);
		 Date d2 = new Date(1,1,1901);
		 Author a1 = new Author("nguyen du",d1);
		 Author a2 = new Author("phan boi chau",d2);
		 Book ex1 = new Book("truyen kieu", 1521,a1);
		 Book ex2 = new Book("tau khong nguoi", 1987, a2);
		 assertEquals(ex1.thisAuthor("haii"), false);
		 assertEquals(ex2.thisAuthor("phan boi chau"),true);
	}

	public void testsameAuthor() {
		 Date d1 = new Date(12,12,1450);
		 Date d2 = new Date(1,1,1901);
		 Date d3 = new Date(1,1,1801);
		 Author a1 = new Author("nguyen du",d1);
		 Author a2 = new Author("phan boi chau",d2);
		 Author a3 = new Author("phan boi chau",d2);
		 Book ex1 = new Book("truyen kieu", 1521,a1);
		 Book ex2 = new Book("tau khong nguoi", 1987, a2);
		 Book ex3 = new Book("tau khong nguoi", 1987, a3);
		 assertEquals(ex1.sameAuthor(ex2), false);
		 assertEquals(ex2.sameAuthor(ex3), true);
	}

	public void testsameGeneration() {
		 Date d1 = new Date(12,12,1450);
		 Date d2 = new Date(1,1,1901);
		 Date d3 = new Date(1,1,1910);
		 
		 Author a1 = new Author("nguyen du",d1);
		 Author a2 = new Author("phan boi chau",d2);
		 Author a3 = new Author("VU",d3);
		 
		 Book ex1 = new Book("truyen kieu", 1521,a1);
		 Book ex2 = new Book("tau khong nguoi", 1987, a2);
		 Book ex3 = new Book("buocquanhau", 1987, a3);
		 
		 assertEquals(ex1.sameGeneration(ex2), false);
		 assertEquals(ex2.sameGeneration(ex3), true);
	}
}
