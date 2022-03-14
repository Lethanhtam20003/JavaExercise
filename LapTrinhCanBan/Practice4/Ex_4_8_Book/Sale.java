/**
 * 
 */
package Ex_4_8_Book;

/**
 * @author lethanhtam
 *
 */
public class Sale extends ABook {
	/**
	 * Testing contructor
	 ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
	 * @param title
	 * @param author
	 * @param price
	 * @param publicionYear
	 */
	public Sale(String title, String author, double price, int publicionYear) {
		super(title, author, price, publicionYear);
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 *Testing salePrice
	 ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
	 (b1.salePrice(), 25000.0);
	 */
	public double salePrice() {
		// TODO Auto-generated method stub
		return this.price*0.5;
	}

}
