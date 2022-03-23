package Ex7_4;

import junit.framework.TestCase;

public class IShapeTest extends TestCase {
	public void testConstructor() {
		AShape s1 = new Dot(new CartPT(2, 4));
		AShape s2 = new Circle( new CartPT(2, 2),2);
		AShape s3 = new Square(new CartPT(2, 4), 2);
		AShape s4 = new Rectangle(new CartPT(2, 4), 4, 2);
		
		IShape i = new ConsShape( s1,new ConsShape(s2,new ConsShape(s3,new ConsShape(s4, new MTShape()))));
		System.out.println(i);
	}
	public void testDistanseToO() {
		AShape s1 = new Dot(new CartPT(2, 4));
		AShape s2 = new Circle( new CartPT(2, 2),2);
		AShape s3 = new Square(new CartPT(2, 4), 2);
		AShape s4 = new Rectangle(new CartPT(2, 4), 4, 2);
		
		IShape i = new ConsShape( s1,new ConsShape(s2,new ConsShape(s3,new ConsShape(s4, new MTShape()))));
		assertEquals(i.distanseToO(), 4.47,0.01);
	}
	public void testBoundaries() {
		AShape s1 = new Dot(new CartPT(2, 4));
		AShape s2 = new Circle( new CartPT(2, 2),2);
		AShape s3 = new Square(new CartPT(2, 4), 2);
		AShape s4 = new Rectangle(new CartPT(2, 4), 4, 2);
		
		IShape i = new ConsShape( s1,new ConsShape(s2,new ConsShape(s3,new ConsShape(s4, new MTShape()))));
		assertEquals(i.boundaries(2, 4), true);
		assertEquals(i.boundaries(10, 10), false);
	}
	public void testBoundingBox() {
		AShape s1 = new Dot(new CartPT(2, 4));
		AShape s2 = new Circle( new CartPT(2, 2),2);
		AShape s3 = new Square(new CartPT(2, 4), 2);
		AShape s4 = new Rectangle(new CartPT(2, 4), 4, 2);
		IShape i = new ConsShape( s1,new ConsShape(s2,new ConsShape(s3,new ConsShape(s4, new MTShape()))));
		
		AShape s11= new Square(new CartPT(2,4), 0);
		AShape s22 = new Square(new CartPT(0, 0), 2);
		AShape s33 = new Square(new CartPT(2, 4), 2);
		AShape s44 = new Square(new CartPT(2, 4),4);
		IShape i00 = new ConsShape( s11,new ConsShape(s22,new ConsShape(s33,new ConsShape(s44,new ConsShape( new Square(new CartPT(0,0), 0),  new MTShape())))));
		assertEquals(i.boundingBox(),i00);
	}
}
