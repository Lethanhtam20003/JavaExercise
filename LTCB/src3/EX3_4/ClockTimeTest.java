package EX3_4;

import junit.framework.TestCase;

public class ClockTimeTest extends TestCase {
	public void testContructor() {
		new ClockTime(12, 0);
	}

	public void testTimeTrip() {
		ClockTime A = new ClockTime(12, 0);
		ClockTime B= new ClockTime(14, 0);
		assertEquals(B.timeTrip(A), 120);
	}
}
