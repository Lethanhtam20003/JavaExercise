package Ex2_7;

public class Bank 
{
	String customer;
	int  amount;
	int maturity;
	/**
	 * @param customer : khách hàng
	 * @param amount : số lượng
	 * @param maturity :
	 */
	public Bank(String customer, int amount, int maturity) {
		this.customer = customer;
		this.amount = amount;
		this.maturity = maturity;
	}
	/**
	 * The bank pays a flat 4% per year for deposits of up to $1,000,
	 *  a flat 4.5% for deposits of up to $5,000, and a flat 5% for deposits of more than $5,000 
	 * @return
	 */
	double AmountOfInterest()
	{
		if (this.amount <= 1000)
		{
			return this.amount * 0.04;
		}
		else if (this.amount <= 5000 && this.amount >1000)
		{
			return this.amount * 0.045 ;
		}
		else
		{
			return this.amount * 0.05 ;
		}
	}
	double payback() 
	{
		   if (this.amount <= 500)
		      return this.amount * 0.0025;
		   if (this.amount <= 1500)
		      return 500 * 0.0025 + (this.amount - 500)* 0.005 ;
		   if (this.amount <= 2500 )
		      return 500 * 0.0025 + 1000 * 0.005 + 
		          (this.amount -1500)* 0.0075; 
		   return 500 * 0.0025 + 1000 * 0.005 + 1000 * 0.0075 + 
		          (this.amount - 2500)* 0.01;
	}

}
