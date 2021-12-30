package Ex3_1;

public class Address {
	/**
	 * 
	 */
	private int house;
	private String nameStreet;
	private String nameCity;

	/**
	 * @param house
	 * @param nameStreet
	 * @param nameCity
	 */
	public Address(int house, String nameStreet, String nameCity) {
		this.house = house;
		this.nameStreet = nameStreet;
		this.nameCity = nameCity;
	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public String getNameStreet() {
		return nameStreet;
	}

	public void setNameStreet(String nameStreet) {
		this.nameStreet = nameStreet;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	/**
	 * chung mot thanh pho minh muon; which checks whether the advertised house is
	 * in some given city (assume we give the method a city name);
	 * House v = new House("Ranch", 7, 375.000, new
	 * Address(23, "Maple Street", "Brookline")); 
	 * assertEquals(v.inthiscity("hai"),false);
	 * assertEquals(v.inthiscity("Brookline"), true);
	 * @param thatcity
	 * @return
	 */
	public boolean inthiscity(String thatcity) {
		return this.nameCity.equals(thatcity);
	}

	/**
	 * which determines whether one house is in the same city as some other house.
	 * House v = new House("Ranch", 7, 375.000, new Address(23, "Maple Street","Brookline"));
	 * House v2 = new House(" Colonial", 9, 450.000, new Address(5,"Joye Road", "Newton"));
	 * House v3 = new House("Ranch", 7, 375.000, new Address(23, "Maple Street", "Brookline")); 
	 * assertEquals(v.samecity(v2),false); 
	 * assertEquals(v.samecity(v3), true);
	 * @param that
	 * @return
	 */
	public boolean samecity(Address that) {
		return this.nameCity == that.nameCity;
	}
}
