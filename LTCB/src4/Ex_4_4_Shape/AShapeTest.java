package Ex_4_4_Shape;

import junit.framework.TestCase;

public class AShapeTest extends TestCase {
	public void TestContructor() {
		CartPT pt1 = new CartPT(1,2);
		IShape s1 = new Circle(pt1,3);
		IShape s2 = new Dot(pt1);
		IShape s3 = new Square(pt1,5);
		IShape s4 = new Rectangle(pt1,10,20); 
	}

	public void testArea() {
		CartPT pt1 = new CartPT(1,2);
		IShape s1 = new Circle(pt1,3);
		IShape s2 = new Dot(pt1);
		IShape s3 = new Square(pt1,5);
		IShape s4 = new Rectangle(pt1,10,20);  
		assertEquals( s1.area(),28.27,0.01);
		assertEquals(s2.area(),0.0);
		assertEquals(s3.area(), 25.0);
		assertEquals( s4.area(),200.0);
	}

	public void testDistantToO() {
		CartPT pt1 = new CartPT(1,2);
		IShape s1 = new Circle(pt1,3);
		IShape s2 = new Dot(pt1);
		IShape s3 = new Square(pt1,5);
		IShape s4 = new Rectangle(pt1,10,20);
	 	assertEquals( s1.distantToO(), 2.24,0.01);
    	assertEquals(s2.distantToO(), 2.24,0.01);
	    assertEquals(s3.distantToO(),2.24,0.01);
		assertEquals(s4.distantToO(),2.24,0.01);
	}

	public void testContains() {
		CartPT pt1 = new CartPT(1,2);
		CartPT pt2 = new CartPT(3,33);
		IShape s1 = new Circle(pt1,3);
		IShape s2 = new Dot(pt1);
		IShape s3 = new Square(pt1,5);
		IShape s4 = new Rectangle(pt1,10,20);
		 assertEquals(s1.contains(pt1), true);
		 assertEquals(s1.contains(pt2), false);
		 assertEquals(s2.contains(pt1),true);
		 assertEquals(s2.contains(pt2), false);
		 assertEquals(s3.contains(pt1),true);
		 assertEquals(s3.contains(pt2),false);
		 assertEquals(s4.contains(pt1),true);
	     assertEquals(s4.contains(pt2),false);
	}

	public void testBoudingBox() {
		CartPT pt1 = new CartPT(1,2);
		IShape s1 = new Circle(pt1,3);
		IShape s2 = new Dot(pt1);
		IShape s3 = new Square(pt1,5);
		IShape s4 = new Rectangle(pt1,10,20);
		assertEquals(s1.boudingBox(), new Square(new CartPT(-2,-1),6));
		assertEquals(s2.boudingBox(), new Square(pt1,0));
		assertEquals(s3.boudingBox(),s3);
		assertEquals(s4.boudingBox(), new Square(pt1,20));
	}

	public void testPerimeter() {
		CartPT pt1 = new CartPT(1,2);
		IShape s1 = new Circle(pt1,3);
		IShape s2 = new Dot(pt1);
		IShape s3 = new Square(pt1,5);
		IShape s4 = new Rectangle(pt1,10,20);
		assertEquals(s1.perimeter(), 18.85,0.01); 
		assertEquals(s2.perimeter(), 0.0);
		assertEquals(s3.perimeter(),20.0);
		assertEquals(s4.perimeter(),30.0);
	}
}
