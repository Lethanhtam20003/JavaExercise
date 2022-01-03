package Ex5_3;

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
}
