package Ex_4_7_TaxiVehicle;

import junit.framework.TestCase;

public class cabTest extends TestCase {
	public void testConstructor() {
		ATaxiVehicle t3 = new cab(42, 10, 20);
	}
	public void testface() {
		ATaxiVehicle t3 = new cab(42, 10, 20);
		assertEquals(t3.fare(33.2), 664.0);
	}
}
