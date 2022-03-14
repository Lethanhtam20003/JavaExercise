package ontap_1;

public class Book {
	String BookTitle;
	int Price;
	int publication;
	Author Author;

	public Book(String bookTitle, int price, int publication, ontap_1.Author author) {
		BookTitle = bookTitle;
		Price = price;
		this.publication = publication;
		Author = author;
	}

	/**
	 * currentBook that checks whether the book was published in 2020 or 2021;
	 * 
	 * @param that
	 * @return
	 */
	public int currentBook() {
		if (this.publication == 2020) {
			return 2020;
		}
		else if (this.publication == 2021) {
			return 2021;
		}
		return 0;
	}

	/**
	 * currentAuthor that determines whether a book was written by a current author
	 * (born after 2010);
	 * 
	 * @return
	 */
	public boolean currentAuthor() {
		return this.Author.cerrentAuthor();
	}

	/**
	 * thisAuthor that determines whether a book was written by the specified
	 * author;
	 * 
	 * @param name
	 * @return
	 */
	public boolean thisAuthor(String name) {
		return this.Author.thisAuthor(name);
	}

	/**
	 * sameAuthor that determines whether one book was written by the same author as
	 * some other book;
	 * @param that
	 * @return
	 */
	public boolean sameAuthor(Book that) {
		return this.Author.sameAuthor(that.Author);
	}

	/**
	 * sameGeneration that determines whether two books were written by two authors
	 * born less than 5 year apart.
	 * 
	 * @param that
	 * @return
	 */
	public boolean sameGeneration(Book that) {
		return this.Author.sameGeneration(that.Author);
	}
}
