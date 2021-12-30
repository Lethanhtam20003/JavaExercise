package Ex2_4;

import junit.framework.TestCase;

public class coffeeTest extends TestCase
{
	public void testContructor() 
	{
		new Coffee("Hawanian kona", 15.95, 100);
	}
	public void testdicount()
	{
		Coffee c1 = new Coffee("Hawanian kona", 15.95, 100);
		c1.discount();
	}
	
	

}
