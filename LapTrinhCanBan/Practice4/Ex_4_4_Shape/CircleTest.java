/**
 * 
 */
package Ex_4_4_Shape;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class CircleTest extends TestCase {
	public void TestContructor() {
		//* Testing constructor 
		  CartPT pt1 = new CartPT(1,2);
		  IShape s1 = new Circle(pt1,3);
	}

	public void testarea() {
		//* Testing area() 
		  CartPT pt1 = new CartPT(1,2); 
		  IShape s1 = new Circle(pt1,3);
		  assertEquals( s1.area(),28.27,0.01);
	}

	public void testdistantToO() {
		//* Testing distantToO() 
		 CartPT pt1 = new CartPT(1,2); 
		 IShape s1 = new Circle(pt1,3);
		 assertEquals( s1.distantToO(), 2.24,0.01);
	}

	public void testcontains() {
		 //* Testing contains(CartPT that) 
		 CartPT pt1 = new CartPT(1,2); 
		 IShape s1 = new Circle(pt1,3);
		 CartPT pt2 = new CartPT(3,33);
		 assertEquals(s1.contains(pt1), true);
		 assertEquals(s1.contains(pt2), false);
	}

	public void testboudingBox() {
		//* Testing boudingBox() 
		 CartPT pt1 = new CartPT(1,2); 
		 IShape s1 = new Circle(pt1,3);
		 assertEquals( s1.boudingBox(), new Square(new CartPT(-2,-1),6));
	}

	public void testperimeter() {
		 //* Testing perimeter() 
		 CartPT pt1 = new CartPT(1,2); 
		 IShape s1 = new Circle(pt1,3);
		 assertEquals( s1.perimeter(), 18.85,0.01); 
	}
}
