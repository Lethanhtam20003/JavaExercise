package ex1_1;

public class book 
{
	/**
	 * @return the book name : ten sách
	 */
	private String Bookname;
	/**
	 *  price = giá sách
	 */
	private double price;
	/**
	 * @return the publication = năm xuất bản
	 */
	private int publication;
	/**
	 * @return the author = tên tác giả
	 */
	private String author;
	
	
	public String getBookname() {
		return Bookname;
	}

	/**
	 * @param bookname the book name to set
	 */
	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublication() {
		return publication;
	}

	/**
	 * @param publication the publication to set
	 */
	public void setPublication(int publication) {
		this.publication = publication;
	}

	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	book(String Bookname,double price,int publication,String author)
	{
		this.author = author;
		this.Bookname = Bookname;
		this.price = price;
		this.publication = publication;
	}
	
	/**
	 * sellbook = bán sách
	 * @return
	 */
	double sellBook()
	{
		return this.price * 11;
	}
}
