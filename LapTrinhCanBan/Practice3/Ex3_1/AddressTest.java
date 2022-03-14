package Ex3_1;

import junit.framework.TestCase;

public class AddressTest extends TestCase{
	public void testContructor() {
		new Address(23, "Maple Street", "Brookline");
		new Address(83, "Winslow Road", "Waltham");
		new Address(5, "Joye Road", "Newton");
	}
	public void testinthiscity() {
		Address v = new Address(23, "Maple Street", "Brookline");
		assertEquals(v.inthiscity("hoi"),false);
		assertEquals(v.inthiscity("Brookline"), true);
	}
	public void testSamecity() {
		Address v = new Address(23, "Maple Street", "Brookline");
		Address v2 = new Address(83, "Winslow Road", "Waltham");
		assertEquals(v.samecity(v2), false);
	}
}
