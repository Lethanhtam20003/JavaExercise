package Ex_4_7_TaxiVehicle;

import junit.framework.TestCase;

public class VanTest extends TestCase {
	public void testConstructor() {
		ATaxiVehicle t1 = new Van(23,7,33,true);
		
	}
	public void testFare() {
		ATaxiVehicle t1 = new Van(23,7,33,true);
		assertEquals(t1.fare(23.3), 775.9);
	}
}
