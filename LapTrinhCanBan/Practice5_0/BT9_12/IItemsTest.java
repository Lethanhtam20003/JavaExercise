package BT9_12;
 
import junit.framework.TestCase;

public class IItemsTest extends TestCase {
	public void testConstructer() {
		 AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
		 AItems i2 = new IceCream("oc que",0.01,50000,"cinnamon walnuts","sorbet");
		 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
		 
		 ConsItems a = new ConsItems(i3, new ConsItems(i2, new ConsItems(i1, new MTItems())));
		 System.out.println(a);
	}
	public void testHowmany() {
		AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
		 AItems i2 = new IceCream("oc que",0.01,50000,"cinnamon walnuts","sorbet");
		 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
		 
		 ConsItems a = new ConsItems(i3, new ConsItems(i2, new ConsItems(i1, new MTItems())));
		 assertEquals(a.howMany(), 3);
	}
	
	public void testBrandList() {
		AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
		AItems i2 = new IceCream("oc que",0.01,50000,"cinnamon walnuts","sorbet");
		AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
		
		ConsItems a = new ConsItems(i3, new ConsItems(i2, new ConsItems(i1, new MTItems())));
		// System.out.println("highesPrice : \n " +a.softByPrice());
//		 assertEquals(a.highestPrice(), false);;
	}
	
	public void testHighesPrice() {
		AItems i1 = new coffee("thai nguyen",0.23,400000,"regular");
		 AItems i2 = new IceCream("oc que",0.01,50000,"cinnamon walnuts","sorbet");
		 AItems i3 = new Juice("nuoc cam",0.1,200000,"Orange","frozen");
		 
		 ConsItems a = new ConsItems(i3, new ConsItems(i2, new ConsItems(i1, new MTItems())));
		 System.out.println("the list of all brand names: "+ a.brandList()+" ...");
	}
	
}
