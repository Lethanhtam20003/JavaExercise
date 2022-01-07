package Ex5_5;

import javax.management.openmbean.CompositeDataSupport;

import junit.framework.TestCase;

public class IShapeTest extends TestCase {
	public void testConstructor() {
		IShape s1 = new Square(new CartPT(4, 3), 40);
		IShape s2 = new Square(new CartPT(3, 4), 50);
		
		IShape c1 = new Circle(new CartPT(0, 0), 20);
		IShape c2 = new Circle(new CartPT(12, 5), 20);
		
		IShape u1 = new CompositeShape(s1, s2);
		IShape u2 = new CompositeShape(s1, c2);
		IShape u3 = new CompositeShape(c1, u1);
		IShape u4 = new CompositeShape(u3, u2);
		IShape u5 = new CompositeShape(s1, new CompositeShape(c1, s2));
		
		System.out.println(u5);
	}

}
