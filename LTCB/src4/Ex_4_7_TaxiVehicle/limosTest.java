package Ex_4_7_TaxiVehicle;

import junit.framework.TestCase;

public class limosTest extends TestCase {
	public void testConstructor() {
		ATaxiVehicle t2 = new limos(44, 4, 34, 1000);
	}
	public void testface() {
		ATaxiVehicle t2 = new limos(44, 4, 34, 1000);
		assertEquals(t2.fare(33.2), 1128.8,1);
		assertEquals(t2.fare(20.0), 1000.0);
	}
}
