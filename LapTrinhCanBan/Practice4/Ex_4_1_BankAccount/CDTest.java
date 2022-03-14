package Ex_4_1_BankAccount;

import junit.framework.TestCase;

public class CDTest extends TestCase{
	public void testConructor() {
		new CD(1729, "Earl Gray", 1250,222,new Date(1, 6, 2005));
	}
}
