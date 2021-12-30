/**
 * 
 */
package Ex_4_7_TaxiVehicle;

/**
 * @author lethanhtam
 *
 */
public class Van extends ATaxiVehicle{
	private boolean access;

	/**
	 * Testing Contructor
	 ATaxiVehicle t1 = new Van(23,7,33,true);
	 * @param id
	 * @param passenger
	 * @param pricePerMile
	 * @param access
	 */
	public Van(int id, int passenger, int pricePerMile, boolean access) {
		super(id, passenger, pricePerMile);
		this.access = access;
	}

	@Override
	/**
	 * Testing fare()
	 ATaxiVehicle t1 = new Van(23,7,33,true);
     assertEquals(t1.fare(23.3), 775.9);
	 */
	public double fare(double numberOfMile) {
		// TODO Auto-generated method stub
		return this.pricePerMile*numberOfMile + this.passenger;
	}
	

}
