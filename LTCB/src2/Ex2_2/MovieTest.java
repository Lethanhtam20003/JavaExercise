package Ex2_2;

import junit.framework.TestCase;

public class MovieTest extends TestCase
{
	public void testContructor()
	{
		new Movie(20,5.0,15.6);
	}
	public void testperomancecost()
	{
		assertEquals(new Movie(20,5.0,15.6).peromancecost(),25.6);
	}
	public void testattendeesprofit()
	{
		
		assertEquals(new Movie(20,5.0,15.6).attendeesprofit(),74.4);
	}
}
