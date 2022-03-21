package Ex6_2;

public class ABook {
	private String name;
	private String author;
	private int publicion;
	private double price;
	
	public ABook(String name, String author, int publicion, double price) {
		super();
		this.name = name;
		this.author = author;
		this.publicion = publicion;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " -" + this.author + "(" +this.publicion +")- have price: "+this.price ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ABook)) {
			return false;
		}else {
			ABook that = (ABook)obj;
			return this.name.equals(that.name)
					&& this.author.equals(that.author)
					&& this.price == that.price
					&& this.publicion == that.publicion;
		}
	}
}
