package BT7;


public abstract class AItems{
	private String name;
	private double weight;
	private int price;
	/**
	 * Testing Constructor
	 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
	 AItems i2 = new IceCream("oc que',0.01,50000,"cinnamon walnuts","sorbet");
	 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
	 * @param name
	 * @param weight
	 * @param price
	 */
	public AItems(String name, double weight, int price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ITems:  " + this.name+ "   have: "+ this.weight + " price: "+ this.price;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof AItems)) {
			return false;
		}else {
			AItems that = (AItems)obj;
			return this.name.equals(that.name)
					&& this.weight==that.weight
					&& this.price==that.price;
		}
	}
	/**
	 * Testing unitprice()
	 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
	 AItems i2 = new IceCream("oc que',0.01,50000,"cinnamon walnuts","sorbet");
	 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
	 assertEquals(i1.unitprice(),92000);
	 assertEquals(i2.unitprice(),5000);
	 assertEquals(i3.unitprice(),20000); 
	 * @return
	 */
	double unitprice() {
		return this.price*this.weight;
	}
	/**
	 * Testing loeprice()
	 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
	 AItems i2 = new IceCream("oc que',0.01,50000,"cinnamon walnuts","sorbet");
	 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
 	 assertEquals(i1.lowprice(20000),true);
 	 assertEquals(i2.lowprice(20000),false);
 	 assertEquals(i3.lowprice(20000),false);
	 * @param amount
	 * @return
	 */
	public boolean lowprice(int amount) {
		return this.unitprice()>amount;
	}
	/**
	 * Testing cheaperThan()
	 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
	 AItems i2 = new IceCream("oc que',0.01,50000,"cinnamon walnuts","sorbet");
	 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
	 assertEquals(i1.cheaperThan(i2);true);
	 assertEquals(i2.cheaperThan(i3);false);
	 * @param that
	 * @return
	 */
	public boolean cheaperThan(AItems that) {
		return this.unitprice()>that.unitprice();
	}
}
