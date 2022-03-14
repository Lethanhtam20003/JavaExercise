package EX3_2;

public class author {
	private String authorname;
	private int birthday;

	/**
	 * @param authorname
	 * @param birthday
	 */
	public author(String authorname, int birthday) {
		this.authorname = authorname;
		this.birthday = birthday;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	/**
	 * thisAuthor that determines whether a book was written by the specified author;
	 * @param name
	 * @return
	 */
	public boolean thisAuthor(String nameauthor) {
		return this.authorname == nameauthor;
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
	public boolean sameAuthor(author that) {
		return this.authorname == that.authorname;
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
	public boolean sameGeneration(author that) {
		return Math.abs(this.birthday - that.birthday) <= 10;
	}

}
