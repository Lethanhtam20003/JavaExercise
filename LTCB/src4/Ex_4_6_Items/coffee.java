/**
 * 
 */
package Ex_4_6_Items;

/**
 * @author lethanhtam
 *
 */
public class coffee extends AItems {
	private String labeled; //regular or decaffeinated

	/**
	 * @param name
	 * @param weight
	 * @param price
	 * @param labeled
	 */
	public coffee(String name, double weight, int price, String labeled) {
		super(name, weight, price);
		this.labeled = labeled;
	}
	
}
