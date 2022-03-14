/**
 * 
 */
package Ex_4_3_Vehicle;

/**
 * @author lethanhtam
 *
 */
public class Subway extends ATransportationAgencies{
	private int carrages;

	/**
	 * Testing Constructor
		ATransportationAgencies t4 = new Subway(80.0, 120, 7);
	 * @param fuelTank
	 * @param passenger
	 * @param carrages
	 */
	public Subway(double fuelTank, int passenger, int carrages) {
		super(fuelTank, passenger);
		this.carrages = carrages;
	}
	
}
