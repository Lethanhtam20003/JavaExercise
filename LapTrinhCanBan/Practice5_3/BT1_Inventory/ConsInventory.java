package BT1_Inventory;
 
public class ConsInventory implements Inventory {
	private Toy first;
	private Inventory rest;

	public ConsInventory(Toy first, Inventory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " firts :" + this.first.toString() + "\n" + " rest : " + this.rest.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ConsInventory)) {
			return false;
		} else {
			ConsInventory that = (ConsInventory) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
	
	/**
	 * Develop the method contains, which determines whether or not the name of toy occurs in the Inventory
	   assertFalse(empty.contains("robot"));
	   assertFalse(i1.contains("robot"));
	   assertTrue(i2.contains("robot"));
	   assertTrue(i3.contains("robot"));
	   assertTrue(all.contains("robot"));
	   assertFalse(all.contains("car"));
	 */
	@Override
	public boolean contains(String nameOfInventory) {
		// TODO Auto-generated method stub
		return this.first.contains(nameOfInventory) || this.rest.contains(nameOfInventory);
	}
	/**
	 * Develop the method isBelow, which checks whether all of the prices of toys in inventory are below the threshold.
	 */
	@Override
	public boolean isBelow(double threshoud) {
		// TODO Auto-generated method stub
		return this.first.isBelow(threshoud) && this.rest.isBelow(threshoud);
	}
	/**
	 * Develop the method howMany, which produces the number of toys in the inventory.
	 */
	@Override
	public int howmany() {
		// TODO Auto-generated method stub
		return 1 + this.rest.howmany();
	}
	/**
	 * Develop the method raisePrice, which produces an inventory in which all prices are raised by a rate 5% (use mutable
	 *  and immutable).
	 */
	@Override
	public Inventory raisePrice(double raice) {
		// TODO Auto-generated method stub
		Toy atoy = this.first.copyraisePrice(raice);
		return new ConsInventory(atoy, this.rest.raisePrice(raice));
	}
	/**
	 * Develop the method raisePrice, which produces an inventory in which all prices are raised by a rate 5% (use mutable 
	 * and immutable).
	 */
	@Override
	public void raisePrice_Mutable(double rate) {
		// TODO Auto-generated method stub
		this.first.setNewPrice(rate);
		this.rest.raisePrice_Mutable(rate);
	}
	/**
	 *
	 */
	public double sumPrice() {
		return this.first.getPrice() + this.rest.sumPrice();
	}
	/**
	 *  Define the method averagePrice. It computes the average price of toys in Inventory. The average is the total of all
	 *   prices divided by the number of toys
	 */
	@Override
	public double averagePrice() {
		// TODO Auto-generated method stub
		return (this.sumPrice() / (this.howmany()));
	}
	/**
	 * Develop the method replaceName, which consumes a list of toy and replaces all occurrences of �robot� with �r2d2� and
	 *  otherwise retains the toy descriptions in the same order.
	 */
	@Override
	public Inventory replaceName(String that) {
		// TODO Auto-generated method stub
		if (this.first.getName().equals(that)) {
			return new ConsInventory(this.first.changeName() ,this.rest.replaceName(that));
		}else {			
			return new ConsInventory(this.first, this.rest.replaceName(that) );
		}
	}
	/**
	 * Develop the method eliminate. The method consumes a string, called toyOfName and produces a list of toys that contains 
	 * all components of list with the exception of the toy whose name matches toyOfName.
	 */
	@Override
	public Inventory eliminate(String ToyOfName) {
		// TODO Auto-generated method stub
		if (this.first.getName().equals(ToyOfName)) {
			return this.rest.eliminate(ToyOfName);
		}else {
		return new ConsInventory(this.first,this.rest.eliminate(ToyOfName));
		}
	}
	
	
}
