package Ex7_1;

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

	@Override
	public boolean contains(String nameOfInventory) {
		// TODO Auto-generated method stub
		return this.first.contains(nameOfInventory) || this.rest.contains(nameOfInventory);
	}

	@Override
	public boolean isBelow(double threshoud) {
		// TODO Auto-generated method stub
		return this.first.isBelow(threshoud) && this.rest.isBelow(threshoud);
	}

	@Override
	public int howmany() {
		// TODO Auto-generated method stub
		return 1 + this.rest.howmany();
	}

	@Override
	public Inventory raisePrice(double raice) {
		// TODO Auto-generated method stub
		Toy atoy = this.first.copyraisePrice(raice);
		return new ConsInventory(atoy, this.rest.raisePrice(raice));
	}

	@Override
	public void raisePriceMutable(double rate) {
		// TODO Auto-generated method stub
		this.first.setNewPrice(rate);
		this.rest.raisePriceMutable(rate);
	}

	public double sumPrice() {
		return this.first.getPrice() + this.rest.sumPrice();
	}

	@Override
	public double averagePrice() {
		// TODO Auto-generated method stub
		return (this.sumPrice() / (this.howmany()));
	}

	@Override
	public Inventory replaceName(String that) {
		// TODO Auto-generated method stub
		if (this.first.getName().equals(that)) {
			return new ConsInventory(this.first.changeName() ,this.rest.replaceName(that));
		}else {			
			return new ConsInventory(this.first, this.rest.replaceName(that) );
		}
	}

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