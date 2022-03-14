package EX3_4;

import junit.framework.TestCase;

public class ScheduleTest extends TestCase {
	public void testContructor() {
		new Schedule(new ClockTime(12, 30), new ClockTime(16, 00));
	}
	public void testTimeTrip() {
		Schedule A = new Schedule(new ClockTime(12, 00), new ClockTime(16, 00));
		assertEquals(A.timeTrip(),240 );
	}
}
