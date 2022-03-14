/**
 * 
 */
package Ex_4_4_Shape;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class SquareTest extends TestCase {
	public void TestContructor() {
		  CartPT pt1 = new CartPT(1,2);
		  IShape s3 = new Square(pt1,5);
	}
	public void testArea() {
		  CartPT pt1 = new CartPT(1,2);
		  IShape s3 = new Square(pt1,5);
		  assertEquals(s3.area(), 25.0);
	} 
	public void testDistantToO() {
		//* Testing distantToO
		  CartPT pt1 = new CartPT(1,2);
		  IShape s3 = new Square(pt1,5);
		  assertEquals(s3.distantToO(),2.24,0.01);
	}
	public void testContains() {
		//* Testing contains()
		  CartPT pt1 = new CartPT(1,2);
		  CartPT pt2 = new CartPT(6,8);
		  IShape s3 = new Square(pt1,5);
		  assertEquals(s3.contains(pt1),true);
		  assertEquals(s3.contains(pt2),false);
	}
	public void testBoudingBox() {
		//Testing boudingBox()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s3 = new Square(pt1,5);
		  assertEquals(s3.boudingBox(),s3);
	}
	public void testPerimeter() {
		// Testing perimeter()
		  CartPT pt1 = new CartPT(1,2);
		  IShape s3 = new Square(pt1 ,5);
		  assertEquals(s3.perimeter(),20.0);
	}
}
