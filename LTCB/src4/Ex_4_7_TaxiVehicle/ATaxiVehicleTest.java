/**
 * 
 */
package Ex_4_7_TaxiVehicle;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class ATaxiVehicleTest extends TestCase {
	public void testContructor() {
		 ATaxiVehicle t1 = new Van(23,7,33,true);
		 ATaxiVehicle t2 = new cab(44, 4, 34);
		 ATaxiVehicle t3 = new cab(42, 10, 20);
	}
	public void Testface() {
		 ATaxiVehicle t1 = new Van(23,7,33,true);
		 assertEquals(t1.fare(23.3), 775.9);
		 
		 ATaxiVehicle t2 = new cab(44, 4, 34);
		 assertEquals(t2.fare(33.2), 1128.8,1);
		 
		 ATaxiVehicle t3 = new cab(42, 10, 20);
		 assertEquals(t3.fare(33.2), 664.0);
	}
	public void testlowerPrice() {
		 ATaxiVehicle t1 = new Van(23,7,33,true);
		 assertEquals(t1.lowerPrice(23.3, 800.0), false);
		 
		 ATaxiVehicle t2 = new cab(44, 4, 34);
		 assertEquals(t2.lowerPrice(33.2, 1200.0), false);
		 
		 ATaxiVehicle t3 = new cab(42, 10, 20);
		 assertEquals(t3.lowerPrice(33.2, 600.0), true);
	}
	public void testcheaperThan() {
		 ATaxiVehicle t1 = new Van(23,7,33,true);
		 ATaxiVehicle t2 = new cab(44, 4, 34);
		 ATaxiVehicle t3 = new cab(42, 10, 20);
		 assertEquals(t1.cheaperThan(23.7, t2), false);
		 assertEquals(t2.cheaperThan(33.2, t3), true);
	}
}
