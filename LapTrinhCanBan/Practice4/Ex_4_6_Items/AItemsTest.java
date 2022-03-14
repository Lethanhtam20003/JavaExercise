package Ex_4_6_Items;

import junit.framework.TestCase;

public class AItemsTest extends TestCase {
	public void testConstructer() {
		 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
		 AItems i2 = new IceCream("oc que",0.01,50000,"cinnamon walnuts","sorbet");
		 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
	}
	public void testUnitprice() {
		 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
		 AItems i2 = new IceCream("oc que",0.01,500000,"cinnamon walnuts","sorbet");
		 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
		 assertEquals(i1.unitprice(),92000.0);
		 assertEquals(i2.unitprice(),5000.0);
		 assertEquals(i3.unitprice(),20000.0);
	}
	public void testLowprice() {
		 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
		 AItems i2 = new IceCream("oc que",0.01,50000,"cinnamon walnuts","sorbet");
		 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
	 	 assertEquals(i1.lowprice(20000),true);
	 	 assertEquals(i2.lowprice(20000),false);
	 	 assertEquals(i3.lowprice(20000),false);
	}
	public void testCheaperThan() {
		 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
		 AItems i2 = new IceCream("oc que",0.01,50000,"cinnamon walnuts","sorbet");
		 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
		 assertEquals(i1.cheaperThan(i2),true);
		 assertEquals(i2.cheaperThan(i3),false);	
	}
}
