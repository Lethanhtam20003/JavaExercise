/**
 * 
 */
package Ex_4_3_Vehicle;

/**
 * @author lethanhtam
 *
 */
public class Limos extends ATransportationAgencies {
	private  int minRantal;

	/**
	 * Testing Constructor
		ATransportationAgencies t2 = new Limos(25.9, 16, 120000);
	 * @param fuelTank
	 * @param passenger
	 * @param minRantal
	 */
	public Limos(double fuelTank, int passenger, int minRantal) {
		super(fuelTank, passenger);
		this.minRantal = minRantal;
	}
	
}
