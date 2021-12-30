package Ex_4_4_Shape;

import junit.framework.TestCase;

public class CartPTTest extends TestCase {
	public void TestContructor() {
		CartPT pt2 = new CartPT(1, 2);
		CartPT pt1 = new CartPT(3, 4);
	}

	public void testDistantToO() {
		CartPT pt1 = new CartPT(1,2);
		CartPT pt2 = new CartPT(3, 4);
		assertEquals(pt1.distantToO() , 2.23 , 2);
		assertEquals(pt2.distantToO() , 5.0);
	}

	public void testDistantTo() {
		CartPT pt2 = new CartPT(1, 2);
		CartPT pt1 = new CartPT(3, 4);
		assertEquals(pt1.distantTo(pt2) , 2.83,0.01);
	}

	public void testTranslate() {
		CartPT pt1 = new CartPT(1, 2);
		CartPT pt2 = new CartPT(3, 4);
		//assertEquals(pt1.translate(1,2) , new CartPT(0,0));
		assertEquals(pt2.translate(1,2) , new CartPT(2,2));
	}

	
}
