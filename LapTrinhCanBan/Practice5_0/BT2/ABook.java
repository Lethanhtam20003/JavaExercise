package BT2;

public  class ABook {
	private String name;
	private String author;
	private double price;
	private int publicionYear;
	/*
	 * Testing for the constructor of ABook
	 * ABook b1 = new ABook("Robinson Crusoe","Daniel Defoe",15.50,1719);
	 * ABook b2 = new ABook("Heart of Darkness","Joseph Conrad",12.80,1902);
	 * ABook b3 = new ABook("Beach Music","Pat Conroy",9.50,1996);
	 */
	public ABook(String name, String author, int publicionYear, double price) {
		super();
		this.name = name;
		this.author = author;
		this.publicionYear = publicionYear;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "-" + this.name + "    - author : " + this.author + ", publicion  : "+this.publicionYear+", price: "+this.price+"$"+"\n";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ABook)) {
			return false;
		}else {
			ABook that = (ABook)obj;
			return this.name == that.name 
					&& this.author == that.author 
					&& this.publicionYear==that.publicionYear 
					&& this.price==that.price;
		}
	}
}
