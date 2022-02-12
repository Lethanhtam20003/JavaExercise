package BT1;

public class AddRest {
	private int house;
	private String nameOfStreet;
	private String nameOfCity;
	/**
	 * Testing for Constructor of Addrest
	 * Addrest a1 = new Addrest(12,"hai ba trung" ,"ha noi" );
	 * Addrest a2 = new Addrest(112,"quang trung", " hai phong");
	 * Addrest a3 = new Addrest(768,"ly thuong kiet","ho chi minh");
	 * @param house
	 * @param nameOfStreet
	 * @param nameOfCity
	 */
	public AddRest(int house, String nameOfStreet, String nameOfCity) {
		super();
		this.house = house;
		this.nameOfStreet = nameOfStreet;
		this.nameOfCity = nameOfCity;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Addrest:  " + this.house +"/"+this.nameOfCity +"/"+ this.nameOfStreet ;
	}
}
