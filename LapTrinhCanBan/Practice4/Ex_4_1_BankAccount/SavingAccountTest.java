package Ex_4_1_BankAccount;

import junit.framework.TestCase;

public abstract class SavingAccountTest extends TestCase{
	public void testContructer() {
		new SavingAccount(4104,"Ima Flatt",10123,35);
	}
}
