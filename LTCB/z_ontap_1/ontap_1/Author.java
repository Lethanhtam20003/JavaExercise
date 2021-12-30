package ontap_1;

public class Author {
	String NameAuthor;
	int birth;
	public Author(String nameAuthor, int birth) {
		NameAuthor = nameAuthor;
		this.birth = birth;
	}
	/**
	 * currentAuthor that determines whether a book was written by a current author (born after 2010);
	 * @return
	 */
	public boolean cerrentAuthor() {
		return this.birth < 2010; 
	}
	/**
	 * thisAuthor that determines whether a book was written by the specified author;
	 * @param name
	 * @return
	 */
	public boolean thisAuthor(String name) {
		return this.NameAuthor== name;
	}
	/**
	 * sameAuthor that determines whether one book was written by the same author as some other book;
	 * @param that
	 * @return
	 */
	public boolean sameAuthor(Author that) {
		return this.NameAuthor == that.NameAuthor;
	}
	/**
	 * sameGeneration that determines whether two books were written by two authors born less than 5 year apart.
	 * @param that
	 * @return
	 */
	public boolean sameGeneration(Author that) {
		return Math.abs(this.birth-that.birth) < 5;
	}
}
