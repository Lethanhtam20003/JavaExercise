package Ex_4_7_TaxiVehicle;

public abstract class ATaxiVehicle {
	protected int id;
	protected int passenger;
	protected int pricePerMile;
	/**
	 * Testing Constructer
	 ATaxiVehicle t1 = new Van(23,7,33,true);
	 ATaxiVehicle t2 = new cab(44, 4, 34);
	 ATaxiVehicle t3 = new cab(42, 10, 20);
	 * @param id 
	 * @param passenger
	 * @param pricePerMile
	 */
	public ATaxiVehicle(int id, int passenger, int pricePerMile) {
		this.id = id;
		this.passenger = passenger;
		this.pricePerMile = pricePerMile;
	}
	/**
	 * Testing fare()
          ATaxiVehicle t1 = new Van(23,7,33,true);
		  t1.fare(23.3), 775.9); 
		 
		  ATaxiVehicle t2 = new cab(44, 4, 34);
		  t2.fare(33.2), 1128.8,1);
		 
		  ATaxiVehicle t3 = new cab(42, 10, 20);
		  t3.fare(33.2), 664.0);
	 * @param numberOfMile
	 * @return
	 */
	public abstract double fare(double numberOfMile); 
	/**
	 * this.fare(numberOfMile) > mount
	 * Testing lowerPrice
	      ATaxiVehicle t1 = new Van(23,7,33,true);
		  t1.lowerPrice(23.3, 800.0), false);
		 
		  ATaxiVehicle t2 = new cab(44, 4, 34);
		  t2.lowerPrice(33.2, 1200.0), false);
		 
		  ATaxiVehicle t3 = new cab(42, 10, 20);
		  t3.lowerPrice(33.2, 600.0), true);
	 * @param numberOfMile
	 * @param mount
	 * @return
	 */
	public boolean lowerPrice(double numberOfMile,double mount)
	{
		return this.fare(numberOfMile) > mount;
	}
	/**
	 * this.fare(numberOfMile) > that.fare(numberOfMile);
	 * Testing cheaperThan()
	      ATaxiVehicle t1 = new Van(23,7,33,true);
		  ATaxiVehicle t2 = new cab(44, 4, 34);
		  ATaxiVehicle t3 = new cab(42, 10, 20);
		  t1.cheaperThan(23.7, t2), false);
		  t2.cheaperThan(33.2, t3), true);
	 * @param numberOfMile
	 * @param that
	 * @return
	 */
	public boolean cheaperThan(double numberOfMile,ATaxiVehicle that) {
		return this.fare(numberOfMile) > that.fare(numberOfMile);
	}
}
