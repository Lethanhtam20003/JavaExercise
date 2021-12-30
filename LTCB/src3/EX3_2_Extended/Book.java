package EX3_2_Extended;

public class Book {
	private String name;
	private int publication;
	private Author author;

	/**
	 * @param name
	 * @param publication
	 * @param author
	 */
	public Book(String name, int publication, Author author) {
		this.name = name;
		this.publication = publication;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublication() {
		return publication;
	}

	public void setPublication(int publication) {
		this.publication = publication;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 *currentBook that checks whether the book was published;
	 *Date d1 = Date(12,12,1450);
	 *Date d2 = new Date(1,1,1901);
	 *Author a1 = new Author("nguyen du",d1);
	 *Author a2 = new Author("phan boi chau",d2);
	 *Book ex1 = new Book("truyen kieu", 1521,a1);
	 *Book ex2 = new Book("tau khong nguoi", 2022, a2);
	 *assertEquals(ex.currentBook(), true);
	 *assertEquals(ex2.currentBool(),false);
	 * @return
	 */
	public boolean currentBook() {
		return this.publication < 2021;
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
		return this.author.currentAuthor();
	}

	/**
	 * thisAuthor that determines whether a book was written by the specified author;
	 *Date d1 = Date(12,12,1450);
	 *Date d2 = new Date(1,1,1901);
	 *Author a1 = new Author("nguyen du",d1);
	 *Author a2 = new Author("phan boi chau",d2);
	 *Book ex1 = new Book("truyen kieu", 1521,a1);
	 *Book ex2 = new Book("tau khong nguoi", 1987, a2);
	 *assertEquals(ex1.thisAuthor("bede"), false);
	 *assertEquals(ex2.thisAuthor("alim"),true);
	 * @param nameauthor
	 * @return
	 */
	public boolean thisAuthor(String nameauthor) {
		return this.author.thisAuthor(nameauthor);
	}

	/**
	 * sameAuthor that determines whether one book was written by the same author as some other book;
	 *Date d1 = Date(12,12,1450);
	 *Date d2 = new Date(1,1,1901);
	 *Date d3 = new Date(1,1,1801);
	 *Author a1 = new Author("nguyen du",d1);
	 *Author a2 = new Author("phan boi chau",d2);
	 *Author a3 = new Author("phan boi chau",d2);
	 *Book ex1 = new Book("truyen kieu", 1521,a1);
	 *Book ex2 = new Book("tau khong nguoi", 1987, a2);
	 *Book ex3 = new Book("tau khong nguoi", 1987, a3);
	 *assertEquals(ex.sameAuthor(ex2), true);
	 *assertEquals(ex2.sameAuthor(ex3), false);
	 * @param that
	 * @return
	 */
	public boolean sameAuthor(Book that) {
		return this.author.sameAuthor(that.author);
	}

	/**
	 * sameGeneration that determines whether two books were written by two authors born less than 10 year apart.
	 *Date d1 = new Date(12,12,1450);
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
	 * @param that
	 * @return
	 */
	public boolean sameGeneration(Book that) {
		return this.author.sameGeneration(that.author);
	}
}
