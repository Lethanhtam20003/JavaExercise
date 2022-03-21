package BT4;

import junit.framework.TestCase;

public class APersonTest extends TestCase {
	public void testConstructor() {
		APerson p1 = new APerson("angela",1936,null,null);
		APerson p2 = new APerson("robert",1935,null,null);
		APerson p3 = new APerson("jannet",1958,p2,p1);
		APerson p4 = new APerson("bob",1917,null,null);
		APerson p5 = new APerson("annie",1938,p4,null);
		APerson p6 = new APerson("paul",1956,null,p5);
		APerson pmain = new APerson("peter",1980,p3,p6);
	}
}
