package Ex5_1;

import junit.framework.TestCase;

public class ILogTest extends TestCase {

	public void testConstructor() {

		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");

		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");

		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");

		ILog empty = new MTLog();

		ILog i1 = new consLog(e3, empty);

		ILog i2 = new consLog(e2, i1);

		ILog i3 = new consLog(e1, i2);

		System.out.println(i3);
		ILog all = new consLog(e1, new consLog(e2, new consLog(e3, new MTLog())));

		assertEquals(i3, all);
	}
}
