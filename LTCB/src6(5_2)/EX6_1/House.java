package EX6_1;

public class House {
	private String kind;
	private int numberOfRoom;
	private double price;
	private Addrest addrest;
	/*
	 * Testing for constructor of House
	 * House h1 = new House("hai tang",12,100000,a1);
	 * House h2 = new House("biet thu",18,200000,a2);
	 * House h3 = new House("ba tang",10,150000,a3);
	 */
	public House(String kind, int numberOfRoom, double price, Addrest addrest) {
		super();
		this.kind = kind;
		this.numberOfRoom = numberOfRoom;
		this.price = price;
		this.addrest = addrest;
	}
	
}
