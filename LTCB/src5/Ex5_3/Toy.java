package Ex5_3;

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " name :" + this.name + "price :" + this.price + " avaiable :" + this.available;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof Toy)) {
			return false;
		} else {
			Toy that = ( Toy) obj;
			return this.name.equals(that.name) && this.price == that.price && this.available == that.available;
		}
	}
}
