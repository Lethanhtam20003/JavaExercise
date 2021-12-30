package EX3_3;

import junit.framework.TestCase;

public class TemperatureRangeTest extends TestCase{
	public void testContructor ()
	{
		new TemperatureRange(12,23);
	}
	public void testwithinRange() {
		TemperatureRange t = new TemperatureRange(18, 30);
		TemperatureRange t1 = new TemperatureRange(20, 30);
		assertEquals(t.withinRange(t1), true);
	}
	public void testrecordDay() {
		TemperatureRange t = new TemperatureRange(18, 34);
		TemperatureRange t1 = new TemperatureRange(20, 30);
		assertEquals(t.recordDay(t1), true);
	}
}
