package Ex8_5;

import junit.framework.TestCase;

public class ARiverTest extends TestCase {

	public void testConstructor() {
		ARiver s = new Source(new Location(1, 1, "s"), 120.0);
		ARiver t = new Source(new Location(1, 5, "t"), 50.0);
		ARiver u = new Source(new Location(3, 7, "u"), 100.0);
		ARiver b = new Confluence(new Location(3, 3, "b"), 60.0, s, t);
		ARiver a = new Confluence(new Location(5, 5, "a"), 30.0, b, u);
		Mouth_main m = new Mouth_main(new Location(7, 5, "m"), a);
	}
	
	ARiver s1 = new Source(new Location(1, 1, "s1"), 120);
	ARiver s2 = new Source(new Location(1, 5, "s2"), 50);
	ARiver s3 = new Source(new Location(3, 7, "s3"), 100);

	ARiver c1 = new Confluence(new Location(3, 3, "c1"), 60, s1, s2);
	ARiver c2 = new Confluence(new Location(5, 5, "c2"), 30, c1, s3);

	ARiver empty = new Source(new Location(0, 0, "0"), 0);

	Mouth_main month = new Mouth_main(new Location(7, 5, "Month"), c2);

	public void testHowManySource() {
		assertEquals(month.howManySource(), 3);
	}

	public void testDitermineLocation() {
		Location l = new Location(1, 5, "s2");
		Location l1 = new Location(1, 3, "s3");
		
		assertEquals(month.ditermineLocation(l), true);
		assertEquals(month.ditermineLocation(l1), false);
	}

	public void testhowMenyMiles() {
		assertEquals(month.howMenyMiles(), 360, 0.001);
	}

	public void testIswithinAGivenRadius() {
		assertEquals(s1.withinAGivenRadius(120), true);
	}
	
	public void testmaxlength() {
		assertEquals(month.maxlength(), 120.0);
	}
	public void testHowManyConsfluance() {
		assertEquals(month.howManyConsfluance(), 2);
	}
	public void testToString() {
		System.out.println(month);
	}
}
