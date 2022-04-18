package BT9_12;
 
public class ConsItems implements IItems {
	private AItems first;
	private IItems rest;

	public ConsItems(AItems first, IItems rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + "\n \n" + this.rest.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ConsItems)) {
			return false;
		} else {
			ConsItems that = (ConsItems) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}

	/**
	 * howMany, which computes the number of items on the shopping list;
	 */
	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 1 + this.rest.howMany();
	}

	/**
	 * highestPrice, which determines the highest unit price among all items in the
	 * shopping list.
	 */
	@Override
	public double highestPrice() {
		// TODO Auto-generated method stub
		return Math.max(this.first.getPrice(), this.rest.highestPrice());
	}

	@Override
	public String brandList() {
		// TODO Auto-generated method stub
		return this.first.getName() + " , " + this.rest.brandList();
	}

}
