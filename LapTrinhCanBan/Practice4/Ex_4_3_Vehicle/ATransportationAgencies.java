/**
 * 
 */
package Ex_4_3_Vehicle;

/**
 * @author lethanhtam
 *
 */
public abstract class ATransportationAgencies implements ITransportation {
	private double fuelTank;
	private int passenger;
	/**
	    ATransportationAgencies t1 = new Bus(23.0, 20, "17-20");
		ATransportationAgencies t2 = new Limos(25.9, 16, 120000);
		ATransportationAgencies	t3 = new Car(40, 6, "suzyky");
		ATransportationAgencies t4 = new Subway(80.0, 120, 7);
	 * @param fuelTank
	 * @param passenger
	 */
	public ATransportationAgencies(double fuelTank, int passenger) {
		this.fuelTank = fuelTank;
		this.passenger = passenger;
	}
	
}
