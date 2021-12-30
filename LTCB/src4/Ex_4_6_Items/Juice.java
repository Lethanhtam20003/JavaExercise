/**
 * 
 */
package Ex_4_6_Items;

/**
 * @author lethanhtam
 *
 */
public class Juice extends AItems{
	private String flavor;
	private String packaged;//packaged as frozen, fresh, bottled, or canned.
	/**
	 * @param name
	 * @param weight
	 * @param price
	 * @param flavor
	 * @param packaged
	 */
	public Juice(String name, double weight, int price, String flavor, String packaged) {
		super(name, weight, price);
		this.flavor = flavor;
		this.packaged = packaged;
	}
	
}
