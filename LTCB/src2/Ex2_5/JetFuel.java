package Ex2_5;

public class JetFuel 
{
	int quantity ;
	String quality ;
	int price;
	double discountPrice = 0.1;
	
	/**
	 * @param quantity
	 * @param quality
	 * @param price
	 */
	public JetFuel(int quantity, String quality, int price)
	{
		this.quantity = quantity;
		this.quality = quality;
		this.price = price;
	}
	
	/**
	 * totalCost: which computes the cost of the sale
	 * @return
	 */
	double TotalCost()
	{
		return this.quantity * this.price;
	}
	
	/**
	 * The buyer gets a 10% discount if the sale is for more than 100,000 gallons
	 */
	double discount()
	{
		if(this.quantity > 100000)
		{
			return this.TotalCost()*this.discountPrice;
		}
		else 
		{
			return this.TotalCost();
		}
	}
}
