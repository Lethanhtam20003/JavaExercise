package Ex7_4;

import junit.framework.TestCase;

public class IShapeTest extends TestCase {
	IShape s1 = new Square(new CartPt(4, 3), 40);
	IShape s2 = new Square(new CartPt(3, 4), 50);
	IShape c1 = new Circle(new CartPt(0, 0), 20);
	IShape c2 = new Circle(new CartPt(12, 5), 20);

	IShape u1 = new CompositeShape(s1, s2);
	IShape u2 = new CompositeShape(s1, c2);
	IShape u3 = new CompositeShape(c1, u1);
	IShape u4 = new CompositeShape(u3, u2);

	public void testDistancetoO() {
		assertEquals(u4.DistancetoO(), 0, 0.001);
	}

	public void testContains() {
		assertTrue(u4.contains(new CartPt(6, 3)));
		assertFalse(u4.contains(new CartPt(100, 100)));
	}

	public void testboundingBox() {
		assertEquals(u4.boundingBox(), new Rectangle(new CartPt(-20, -20), 73, 74));
	}
}
