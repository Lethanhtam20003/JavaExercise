/**
 * 
 */
package Ex_4_8_Book;

/**
 * @author lethanhtam
 *
 */
public class PaperBack extends ABook{
	/**
	 * Testing Constructor
	 ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
	 * @param title
	 * @param author
	 * @param price
	 * @param publicionYear
	 */
	public PaperBack(String title, String author, double price, int publicionYear) {
		super(title, author, price, publicionYear);
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * 
	 ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
	(b3.salePrice(), 120000.0);
	 */
	public double salePrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
