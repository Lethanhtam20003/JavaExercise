/**
 * 
 */
package Ex_4_7_TaxiVehicle;

/**
 * @author lethanhtam
 *
 */
public class limos extends ATaxiVehicle {
	private int minRantal;

	/**
	 * Testing constructor 
	 ATaxiVehicle t2 = new cab(44, 4, 34);
	 * 
	 * @param id
	 * @param passenger
	 * @param pricePerMile
	 * @param minRantal
	 */
	public limos(int id, int passenger, int pricePerMile, int minRantal) {
		super(id, passenger, pricePerMile);
		this.minRantal = minRantal;
	}

	@Override
	/**
	 * Testing fare() ATaxiVehicle t2 = new cab(44, 4, 34);
	 * assertEquals(t2.fare(33.2), 1128.8,1);
	 */
	public double fare(double numberOfMile) {
		// TODO Auto-generated method stub
		if (this.pricePerMile * numberOfMile > this.minRantal)
		{
			return this.pricePerMile * numberOfMile;
		}else {
			return this.minRantal;
		}
	}

}
