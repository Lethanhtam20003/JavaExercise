package Ex_4_1_BankAccount;

public class SavingAccount extends ABank {
	ABank account;
	private double interestRest;

		/**
	 new SavingAccount(new BankAccount(4104,"Ima Flatt",10123),35);
	 * @param account
	 * @param interestRest
	 */
	public SavingAccount(int id,String costomerName,int currentBalance, int interestRest) {
		super(id,costomerName ,currentBalance );
		this.interestRest = interestRest;
	}
	
}
