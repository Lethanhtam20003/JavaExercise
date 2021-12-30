/**
 * 
 */
package Ex_4_6_Items;

/**
 * @author lethanhtam
 *
 */
public class IceCream extends AItems{
	private String flavor;
	private	String type;//whether this is a sorbet, a frozen yogurt, or regular ice cream.
	/**
	 * @param name
	 * @param weight
	 * @param price
	 * @param flavor
	 * @param type
	 */
	public IceCream(String name, double weight, int price, String flavor, String type) {
		super(name, weight, price);
		this.flavor = flavor;
		this.type = type;
	}
	
}
