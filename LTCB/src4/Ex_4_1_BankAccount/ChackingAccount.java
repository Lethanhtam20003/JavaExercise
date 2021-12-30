package Ex_4_1_BankAccount;

public class ChackingAccount extends ABank {
	private int minimumBalance;
	/**
	 new ChackingAccount(new BankAccount(1729, "Earl Gray", 1250),500);
	 * @param account
	 * @param minimumBalance
	 */
	public ChackingAccount(int id,String costomerName,int currentBalance, int minimumBalance) {
		super(id, costomerName, currentBalance);
		this.minimumBalance = minimumBalance;
	}
}