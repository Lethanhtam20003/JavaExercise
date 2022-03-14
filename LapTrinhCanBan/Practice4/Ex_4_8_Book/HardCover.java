/**
 * 
 */
package Ex_4_8_Book;

/**
 * @author lethanhtam
 *
 */
public class HardCover extends ABook {
	/**
	 * Testing Constructor
	 ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
	 * @param title
	 * @param author
	 * @param price
	 * @param publicionYear
	 */
	public HardCover(String title, String author, double price, int publicionYear) {
		super(title, author, price, publicionYear);
		// TODO Auto-generated constructor stub
	}

	@Override
    /**
     *Testing salePrice
     ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
	 (b2.salePrice(), 80000.0);
     */
	public double salePrice() {
		// TODO Auto-generated method stub
		return this.price*0.8;
	}
	
}
