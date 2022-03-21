package Ex5_1;

public class Toy {
	private String name;
	private double price;
	private int avalible;

	public Toy(String name, double price, int avalible) {
		super();
		this.name = name;
		this.price = price;
		this.avalible = avalible;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "  - " + this.price + "$  " + " have: " + this.avalible;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof Toy)) {
			return false;
		}else {
			Toy that = (Toy)obj;
			return this.name.equals(that.name) 
					&& this.price==that.price
					&& this.avalible == that.avalible;
			
		}
			
	}
}
