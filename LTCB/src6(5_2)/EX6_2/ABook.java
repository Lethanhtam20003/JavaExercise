package EX6_2;

public  class ABook {
	private String name;
	private String auther;
	private double price;
	private int publicionYear;
	/*
	 * Testing for the constructor of ABook
	 *  ABook b1 = new ABook(" ong lao danh ca","lubinson",150000,1998);
	 *  ABook b2 = new ABook(" chiec thuyen ngoai xa","Nguyen Minh Chau",200000,1975);
	 *  ABook b3 = new ABook("Mot Bong Hoa"," LE Tu Uyen",50000,2005);
	 */
	public ABook(String name, String auther, double price, int publicionYear) {
		super();
		this.name = name;
		this.auther = auther;
		this.price = price;
		this.publicionYear = publicionYear;
	}
	
}
