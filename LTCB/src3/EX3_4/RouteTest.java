package EX3_4;

import junit.framework.TestCase;

public class RouteTest extends TestCase{
	public void testContructor() {
		new Route("ha noi", "hai phong");
	}
	public void testsameDestination() {
		Route A = new Route("ha noi","hai phong");
		assertEquals(A.sameDestination("hai phong"), true);
	}
}
