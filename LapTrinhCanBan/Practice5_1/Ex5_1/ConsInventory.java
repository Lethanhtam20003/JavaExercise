package Ex5_1;

public class ConsInventory implements IInventory{
	private Toy first;
	private IInventory rest;
	public ConsInventory(Toy first, IInventory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + "\n" + this.rest.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if( obj == null || !(obj instanceof ConsInventory)) {
			return false;
		}else {
			ConsInventory that = ( ConsInventory ) obj;
			return this.first.equals(that.first) 
					&& this.rest.equals(that.rest);
		}
	}
}
