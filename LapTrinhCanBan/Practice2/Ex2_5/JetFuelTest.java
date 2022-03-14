package Ex2_5;

import junit.framework.TestCase;

public class JetFuelTest extends TestCase
{
	public void testContructor()
	{
		new JetFuel(100000,"good",15000);
	}
	public void testTotalCost()
	{
		new JetFuel(100000,"good",15000).TotalCost();
	}
	
	public void testdicount()
	{
		new JetFuel(100000,"good",15000).discount();
	}
	
}
