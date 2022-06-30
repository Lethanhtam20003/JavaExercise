/**
 * 
 */
package ProductManagement;

/**
 * @author lethanhtam
 *
 */
public class Generator extends ProductItems {
	private day madeDay;

	public Generator(String pid, String name, Producer producer, String nation, double weight, double price,
			day madeDay) {
		super(pid, name, producer, nation, weight, price);
		this.madeDay = madeDay;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pid + ", " + this.name + ", " + this.producer.toString() + ", " + this.weight + "kg, " + this.price
				+ "VND, " + this.nation + ", " + this.madeDay.toString();
	}

	@Override
	public double promotionFree() {
		// TODO Auto-generated method stub
		return this.price * 0.75;
	}

	@Override
	public boolean checkHandToolsAndGenerator() {
		// TODO Auto-generated method stub
		return true;
	}

}