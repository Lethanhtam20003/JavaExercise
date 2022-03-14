package Ex_4_1_BankAccount;

public abstract class ABank implements IBank {
	private int id;
	private String costomerName;
	private	int currentBalance;
		/**
	 * for example Constructor
	 new BankAccount(1729, "Earl Gray", 1250);
	 new BankAccount(4104,"Ima Flatt",10123);
	 new BankAccount(2991,"Annie Proulx",800);
	 * @param id
	 * @param costomerName
	 * @param currentBalance
	 */
	public ABank(int id, String costomerName, int currentBalance) {
		this.id = id;
		this.costomerName = costomerName;
		this.currentBalance = currentBalance;
	}
	/**
	 * Earl Gray, id# 1729, has $1,250 in a checking account with minimum balance of
	 * $500;
	 * 
	 * Ima Flatt, id# 4104, has $10,123 in a certificate of deposit whose interest
	 * rate is 4% and whose maturity date is June 1, 2005;
	 * 
	 * Annie Proulx, id# 2992, has $800 in a savings account; the account yields
	 * interest at the rate of 3.5%.
	 */
}
