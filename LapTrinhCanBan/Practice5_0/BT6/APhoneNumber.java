package BT6;


public class APhoneNumber {
	private String name;
	private int number;

	/**
	 * @param name
	 * @param number
	 */
	public APhoneNumber(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return "name: " + this.name + ", number: " + this.number;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof APhoneNumber))
			return false;
		else {
			APhoneNumber that = (APhoneNumber) obj;
			return this.name.equals(that.name) && this.number == that.number;
		}
	}

}
