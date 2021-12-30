/**
 * 
 */
package Ex_4_3_Vehicle;

/**
 * @author lethanhtam
 *
 */
public class Bus extends ATransportationAgencies {
	private String route;

	/**
	 * Testing Constructor
	 ATransportationAgencies t1 = new Bus(23.0, 20, "17-20");
	 * @param fuelTank
	 * @param passenger
	 * @param route
	 */
	public Bus(double fuelTank, int passenger, String route) {
		super(fuelTank, passenger);
		this.route = route;
	}
}
