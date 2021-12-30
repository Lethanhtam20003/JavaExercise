package Ex2_2;

public class Movie 
{
	
	double ticketPrice;// giá vé
	double servicechanger;// phi dich vu
	int numberofAttemdees;//so nguoi tham du
	/**
	 * @param peromancecost
	 * @param ticketPrice
	 * @param servicechanger
	 * @param tickets
	 * @param numberofAttemdees
	 */
	public Movie( int numberofAttemdees, double ticketPrice, double servicechanger ) 
	{
		
		this.ticketPrice = ticketPrice;
		this.servicechanger = servicechanger;
		this.numberofAttemdees = numberofAttemdees;
	}
	/**
	 * //chi phi hieu xuat
	 */
	double peromancecost()
	{
		return this.numberofAttemdees*0.5 + this.servicechanger;
	}
	
	double attendeesprofit ()
	{
		return this.numberofAttemdees*this.ticketPrice-this.peromancecost();
	}
}
