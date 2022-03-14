package Ex_4_1_BankAccount;

import junit.framework.TestCase;

public class IBankTest extends TestCase {
	public void testConstructor() {
		IBank i1 = new SavingAccount(4104,"Ima Flatt",10123,35);
		IBank i2 = new ChackingAccount(1729, "Earl Gray", 125,500);
		IBank i3 = new CD(1729, "Earl Gray", 1250,222,new Date(1, 6, 2005));

	}
}
