package Ex2_7;

import junit.framework.TestCase;

public class BankTest extends TestCase
{
	public void testContructor()
	{
		new Bank("Thuy", 6000, 2);
		new Bank("Mai", 2500, 1);
		new Bank("Nam", 1500, 2);
	 	new Bank("Tien", 500, 2);
	}
	public void testAmountOfInterest()
	{
		Bank t1 = new Bank("Thuy", 6000, 2);
		Bank t2 = new Bank("Mai", 2500, 1);
		Bank t3 = new Bank("Nam", 1500, 2);
		Bank t4 = new Bank("Tien", 500, 2);

	   assertEquals(300.0, t1.AmountOfInterest(), 0.001);
	   assertEquals(112.5, t2.AmountOfInterest(), 0.001);
	   assertEquals(67.5, t3.AmountOfInterest(), 0.001);
	   assertEquals(20.0, t4.AmountOfInterest(), 0.001);
	}

	public void testpayback()
	{
		Bank t1 = new Bank("Thuy", 6000, 2);
		Bank t2 = new Bank("Mai", 2500, 1);
		Bank t3 = new Bank("Nam", 1500, 2);
		Bank t4 = new Bank("Tien", 500, 2);
		
		assertEquals(48.75,t1.payback(),0.001);
		assertEquals(13.75, t2.payback(), 0.001);
		assertEquals(6.25, t3.payback(), 0.001);
		assertEquals(1.25, t4.payback(), 0.001);

	}
}
