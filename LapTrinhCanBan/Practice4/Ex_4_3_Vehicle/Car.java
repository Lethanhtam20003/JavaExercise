/**
 * 
 */
package Ex_4_3_Vehicle;

/**
 * @author lethanhtam
 *
 */
public class Car extends ATransportationAgencies {
	private String agence;

	/**
	 * Testing Constructor
		ATransportationAgencies	t3 = new Car(40, 6, "suzyky");
	 * @param fuelTank
	 * @param passenger
	 * @param agence
	 */
	public Car(double fuelTank, int passenger, String agence) {
		super(fuelTank, passenger);
		this.agence = agence;
	}
	
}
