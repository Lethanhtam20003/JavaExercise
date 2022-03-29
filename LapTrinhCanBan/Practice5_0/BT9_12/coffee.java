/**
 * 
 */
package BT9_12;


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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Coffee - '"+ this.getName()+"'  have: "+this.getWeight()+"g \n Price: "+this.getPrice()+"ð - labeled: " +this.labeled+";";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof coffee)) {
		return false;
		}else {
			coffee that = (coffee)obj;
			return this.labeled.equals(that.labeled);
		}
	}
}
