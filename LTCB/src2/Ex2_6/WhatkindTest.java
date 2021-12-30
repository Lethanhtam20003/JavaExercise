package Ex2_6;

import junit.framework.TestCase;

public class WhatkindTest extends TestCase
{
	public void testContructor()
	{
		new whatkind(1,1,1);
	}
	public void testdenta()
	{
		assertEquals(new whatkind(1,1,1).denta(),-3.0);
	}
	public void testSolveTheEquation()
	{
		assertEquals(new whatkind(1,1,1).SolveTheEquation(),"none");
	}
}

