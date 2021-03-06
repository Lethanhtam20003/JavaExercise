/**
 * 
 */
package BT7;


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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "  "+ this.flavor+ "  -"+ this.type;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof IceCream)) {
			return false;
		}{
			IceCream that = (IceCream)obj;
		return this.flavor.equals(that.flavor)&&this.type.equals(that.type);
		}
	}
}
