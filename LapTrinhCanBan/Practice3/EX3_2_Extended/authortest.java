package EX3_2_Extended;


import junit.framework.TestCase;

public class authortest extends TestCase {
	public void testContructor() {
		Date d1 = new Date(01, 01,1945) ;
		Date d2 = new Date(01, 01,1970) ;
		Author c = new Author("XuanQuynh",d1) ;
		Author d = new Author("XuanDieu",d2 );
	}
	// 1.thisAuthor 2.sameAuthor 3.sameGeneration
public void testcurrentAuthor() {
	 Date d1 = new Date(12,12,1450);
	 Date d2 = new Date(1,1,2001);
	 Author a1 = new Author("nguyen du",d1);
	 Author a2 = new Author("phan boi chau",d2);
	 assertEquals(a1.currentAuthor(), true);
	 assertEquals(a2.currentAuthor(), false);
}
	public void testthisauthor() {		
		Date d1 = new Date(01, 01,1945) ;
		Date d2 = new Date(01, 01,1970) ;
		Author c = new Author("XuanQuynh",d1) ;
		Author d = new Author("XuanDieu",d2 );
		assertEquals(c.thisAuthor("XuanDieu"), false);
		assertEquals(d.thisAuthor("XuanDieu"), true);
	}
	public void testsameAuthor() {
		
		Date d1 = new Date(01, 01,1945) ;
		Date d2 = new Date(01, 01,1970) ;

		Author a = new Author("XuanQuynh",d1) ;
		Author b = new Author("XuanDieu",d2 );
		Author c = new Author("XuanQuynh",d1 );

		assertEquals(a.sameAuthor(b), false);
		assertEquals(a.sameAuthor(c), true);
	}
	public void testsammeGenerration() {
		Date d1 = new Date(01, 01,1945) ;
		Date d2 = new Date(01, 01,1970) ;

		Author a = new Author("XuanQuynh",d1) ;
		Author b = new Author("XuanDieu",d2 );
		Author c = new Author("XuanQuynh",d1 );

		assertEquals(a.sameGeneration(a), true);
		assertEquals(b.sameGeneration(c),false);
	}
}
