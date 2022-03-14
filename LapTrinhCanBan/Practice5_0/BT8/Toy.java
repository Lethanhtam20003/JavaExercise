package BT8;


public class Toy {
	private String name;
	private double price;
	private int available;

	public Toy(String name, double price, int available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAvailable() {
		return available;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " name :" + this.name + ",  price :" + this.price + ",   avaiable :" + this.available;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof Toy)) {
			return false;
		} else {
			Toy that = (Toy) obj;
			return this.name.equals(that.name) && this.price == that.price && this.available == that.available;
		}
	}

	public boolean contains(String nameOfInventory) {
		// TODO Auto-generated method stub
		return this.name.equals(nameOfInventory);
	}

	public boolean isBelow(double threshoud) {
		// TODO Auto-generated method stub
		return this.price < threshoud;
	}

	public Toy copyraisePrice(double raice) {
		// TODO Auto-generated method stub
		return new Toy(this.name, this.price + this.price * raice, this.available);
	}

	public void setNewPrice(double rate) {
		this.price = this.price*(1+rate);
	}
	
	public Toy changeName() {
		return new Toy("r2d2", this.price, this.available);
	}
}
