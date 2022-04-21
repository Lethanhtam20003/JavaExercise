/**
 * 
 */
package BT4;

import BT9_13.ABook;

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
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTitle() + "\t\t  ** " + this.getAuthor()+" **  \t publication: "
				+this.getPublicionYear()+"\n \t\t\t\t price: "+this.getPrice()+"$";
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
