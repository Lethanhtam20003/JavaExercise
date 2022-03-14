/**
 * 
 */
package Ex_4_4_Shape;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class DotTest extends TestCase {
	public void TestContructor() {
		//* Testing Constructer
		  CartPT pt1 = new CartPT(1,2);
		  IShape s2 = new Dot(pt1);
	}
	public void testArea() {
		//* Testing area()
		   CartPT pt1 = new CartPT(1,2);
		   IShape s2 = new Dot(pt1);
		   assertEquals(s2.area(),0.0);
	}	
	public void testDistantToO() {
		 //* Testing distantToO
		  CartPT pt1 = new CartPT(1,2);
		  
		  IShape s2 = new Dot(pt1);
		  assertEquals(s2.distantToO(), 2.24,0.01);
	}
	public void testContains() {
		//* Testing contains()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s2 = new Dot(pt1);
		  CartPT pt2 = new CartPT(3,33);
		  assertEquals(s2.contains(pt1),true);
		  assertEquals(s2.contains(pt2), false);
	}
	public void testBoudingBox() {
		 //* Testing boudingBox()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s2 = new Dot (pt1);
		  assertEquals(s2.boudingBox(), new Square(pt1,0));
	}
	public void testPerimeter() {
		//* Testing perimerter()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s2 = new Dot (pt1);
		  assertEquals(s2.perimeter(), 0.0);
	}
}
