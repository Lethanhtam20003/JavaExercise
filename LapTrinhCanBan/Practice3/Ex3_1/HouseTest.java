package Ex3_1;

import junit.framework.TestCase;

public class HouseTest extends TestCase {
	public void testContructor() {
		new House("Ranch", 7, 375.000, new Address(23, "Maple Street", "Brookline"));
		new House(" Colonial", 9, 450.000, new Address(5, "Joye Road", "Newton"));
		new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Waltham"));
	}
public void testHasMoreRoom() {
	  House v = new House("Ranch", 7, 375.000, new Address(23, "Maple Street","Brookline"));
	  House v2 = new House(" Colonial", 9, 450.000, new Address(5,"Joye Road", "Newton"));
	  assertEquals(v.HasMoreRoom(v2), false);
}
	public void testinthiscity() {
		House v = new House("Ranch", 7, 375.000, new Address(23, "Maple Street", "Brookline"));
		assertEquals(v.inthiscity("hai"), false);
		assertEquals(v.inthiscity("Brookline"), true);
	}

	public void testsamecity() {
		House v = new House("Ranch", 7, 375.000, new Address(23, "Maple Street", "Brookline"));
		House v2 = new House(" Colonial", 9, 450.000, new Address(5, "Joye Road", "Newton"));
		House v3 = new House("Ranch", 7, 375.000, new Address(23, "Maple Street", "Brookline"));
		assertEquals(v.samecity(v2), false);
		assertEquals(v.samecity(v3), true);
	}
}
