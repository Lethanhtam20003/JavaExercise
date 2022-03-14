package EX3_2_Extended;



public class Author {
	String name;
	Date Date;
	
	
	public Author(String name, Date Date) {
		this.name = name;
		this.Date = Date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}
	/**
	 * currentAuthor that determines whether a book was written by a current author
	 * (born after 2000);
	 *Date d1 = Date(12,12,1450);
	 *Date d2 = new Date(1,1,2001);
	 *Author a1 = new Author("nguyen du",d1);
	 *Author a2 = new Author("phan boi chau",d2);
	 *Book ex1 = new Book("truyen kieu", 1521,a1);
	 *Book ex2 = new Book("tau khong nguoi", 1987, a2);
	 *assertEquals(ex1.currentAuthor(), false);
	 *assertEquals(ex2.currentAuthor(), true);
	 * @return
	 */
	public boolean currentAuthor() {
		return this.Date.currentAuthor();
	}

	/**
	 * thisAuthor that determines whether a book was written by the specified author;
	 * @param name
	 * @return
	 */
	public boolean thisAuthor(String nameauthor) {
		return this.name == nameauthor;
	}
	/**
	 * sameAuthor that determines whether one book was written by the same author as some other book;
	 * @param that
	 * @return
	 */
	public boolean sameAuthor(Author that) {
		return this.name == that.name;
	}
	/**
	 * sameGeneration that determines whether two books were written by two authors born
	 *  less than 10 year apart.
	 *Date d1 = Date(12,12,1450);
	 *Date d2 = new Date(1,1,1901); 	 
	 *Date d3 = new Date(1,1,1801);
	 *Author a1 = new Author("nguyen du",d1);
	 *Author a2 = new Author("phan boi chau",d2);
	 *Author a3 = new Author("phan boi chau",d2);
	 *Book ex1 = new Book("truyen kieu", 1521,a1);
	 *Book ex2 = new Book("tau khong nguoi", 1987, a2);
	 *Book ex3 = new Book("tau khong nguoi", 1987, a3);
	 *assertEquals(ex.sameGeneration(ex2), true);
	 *assertEquals(exs.sameGeneration(ex3), false );
	 * @param author
	 * @return
	 */
	public boolean sameGeneration(Author Author) {
		// TODO Auto-generated method stub
		return this.Date.sameGeneration(Author.Date);
	}
}
