package Ex_4_1_BankAccount;

public class CD extends ABank {
	private int interestRate;
	Date date;
	/**
   	 new CD(new BankAccount(1729, "Earl Gray", 1250),222,new Date(1, 6, 2005));
	 * @param account
	 * @param interestRate
	 * @param date
	 */
	public CD(int id,String costomerName,int currentBalance, int interestRate, Date date) {
		super(id,costomerName,currentBalance);
		this.interestRate = interestRate;
		this.date = date;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
}
