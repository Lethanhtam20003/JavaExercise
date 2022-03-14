package EX3_2;

public class Book {
	private String name;
	private int publication;
	private author author;

	/**
	 * @param name
	 * @param publication
	 * @param author
	 */
	public Book(String name, int publication, author author) {
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

	public author getAuthor() {
		return author;
	}

	public void setAuthor(author author) {
		this.author = author;
	}

	/**
	 *currentBook that checks whether the book was published;
	 *Book ex = new Book("con ca", 2000, new author("alim", 1950));
	 *Book ex2 = new Book("con ca", 2000, new author("alim", 2022));
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
	 *Book ex = new Book("con ca", 2000, new author("alim", 1950));
	 *Book ex2 = new Book("con ca", 2000, new author("alim", 2022));
	 *assertEquals(ex.currentAuthor(), false);
	 *assertEquals(sx2.currentAuthor(), true);
	 * @return
	 */
	public boolean currentAuthor() {
		return this.author.getBirthday() > 2000;
	}

	/**
	 * thisAuthor that determines whether a book was written by the specified author;
	 *Book ex = new Book("con ca", 2000, new author("alim", 1950));
	 *Book ex2 = new Book("con ca", 2000, new author("alim", 2022));
	 *assertEquals(ex.thisAuthor("bede"), false);
	 *assertEquals(ex2.thisAuthor("alim"),true);
	 * @param nameauthor
	 * @return
	 */
	public boolean thisAuthor(String nameauthor) {
		return this.author.thisAuthor(nameauthor);
	}

	/**
	 * sameAuthor that determines whether one book was written by the same author as some other book;
	 *Book ex = new Book("con ca", 2000, new author("alim", 1950));
	 *Book ex2 = new Book("con ca", 2000, new author("alim", 1950));
	 *Book ex3 = new Book("con ca", 2000, new author("chita", 1950));
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
	 *Book ex = new Book("con ca", 2000, new author("alim", 1950));
	 *Book ex2 = new Book("con ca", 2000, new author("alim", 1950));
	 *Book ex3 = new Book("con ca", 2000, new author("chita", 1970));
	 *assertEquals(ex.sameGeneration(ex2), true);
	 *assertEquals(exs.sameGeneration(ex3),fales);
	 * @param that
	 * @return
	 */
	public boolean sameGeneration(Book that) {
		return this.author.sameGeneration(that.author);
	}
}
