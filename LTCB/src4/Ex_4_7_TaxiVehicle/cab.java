/**
 * 
 */
package Ex_4_7_TaxiVehicle;
/**
 * @author lethanhtam
 * 
 */
public class cab extends ATaxiVehicle {

	public cab(int id, int passenger, int pricePerMile) {
		super(id, passenger, pricePerMile);
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * Testing fare()
	 
	 */
	public double fare(double numberOfMile) {
		// TODO Auto-generated method stub
		return this.pricePerMile*numberOfMile;
	}
	
}
