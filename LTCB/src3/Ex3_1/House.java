/**
 * 
 */
package Ex3_1;

/**
 * @author lethanhtam Develop a "real estate assistant'' program. The
 *         "assistant'' helps the real estate agent locate houses of interest
 *         for clients. The information about a house includes its kind, the
 *         number of rooms, the asking price, and its address. An address
 *         consists of a house number, a street name, and a city.
 *
 *         Phát triển chương trình "trợ lý bất động sản". "Trợ lý" giúp đại lý
 *         bất động sản xác định các ngôi nhà mà khách hàng quan tâm. Thông tin
 *         v�? một ngôi nhà bao gồm loại của nó, số lượng phòng, giá chào bán và
 *         địa chỉ của nó. �?ịa chỉ bao gồm số nhà, tên đư�?ng và thành phố.
 */
public class House {
	/**
	 * kind : Loai nha
	 */
	private String kind;
	/**
	 * NumberOfRoom : so phong
	 */
	private int NumberOfRoom;
	/**
	 * price : gia phong
	 */
	private double price;
	/**
	 * location vi tri
	 */
	private Address Address;

	/**
	 * @param kind
	 * @param numberOfRoom
	 * @param price
	 * @param location
	 */
	public House(String kind, int numberOfRoom, double price, Address Address) {
		this.kind = kind;
		NumberOfRoom = numberOfRoom;
		this.price = price;
		this.Address = Address;
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumberOfRoom() {
		return NumberOfRoom;
	}

	public void setNumberOfRoom(int numberOfRoom) {
		NumberOfRoom = numberOfRoom;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	/**
	 * which determines whether one house has more rooms than some other house;
	 * House v = new House("Ranch", 7, 375.000, new Address(23, "Maple Street","Brookline"));
	 * House v2 = new House(" Colonial", 9, 450.000, new Address(5,"Joye Road", "Newton"));
	 * assertEquals(v.HasMoreRoom(v2), false);
	 * @param that
	 * @return
	 */
	public boolean HasMoreRoom(House that) {
		return this.NumberOfRoom > that.NumberOfRoom;

	}

	/**
	 * which checks whether the advertised house is in some given city (assume we
	 * give the method a city name); 
	 * House v = new House("Ranch", 7, 375.000, new
	 * Address(23, "Maple Street", "Brookline")); 
	 * assertEquals(v.inthiscity("hai"),false);
	 * assertEquals(v.inthiscity("Brookline"), true);
	 * @param city
	 * @return
	 */
	public boolean inthiscity(String city) {
		return this.Address.inthiscity(city);
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
	public boolean samecity(House that) {
		return this.Address.samecity(that.Address);
	}

}
