/**
 * 
 */
package Ex_4_4_Shape;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class RectangleTest extends TestCase {
	public void TestContructor() {
		//Testing Constructor
		CartPT pt1 = new CartPT(1,2);
		IShape s4 = new Rectangle(pt1,10,20);
	}

	public void testArea() {
		//* Testing area()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s4 = new Rectangle(pt1,10,20);
		  assertEquals( s4.area(),200.0);
	}

	public void testDistantToO() {
		//* Testing distantToO()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s4 = new Rectangle(pt1,10,20);
		  assertEquals(s4.distantToO(),2.24,0.01);
	}

	public void testContains() {
		//* Testing contains()
		  CartPT pt1 = new CartPT(1,2);
		  CartPT pt2 = new CartPT(14,27);
		  IShape s4 = new Rectangle(pt1,10,20);
		  assertEquals(s4.contains(pt1),true);
		  assertEquals(s4.contains(pt2),false);
	}

	public void testBoudingBox() {
		//* Testing boudingBox()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s4 = new Rectangle(pt1,10,20);
		  assertEquals(s4.boudingBox(), new Square(pt1,20));
	}

	public void testPerimeter() {
		//* Testing perimeter()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s4 = new Rectangle(pt1,10,20);
		  assertEquals(s4.perimeter(),30.0);
	}
}
