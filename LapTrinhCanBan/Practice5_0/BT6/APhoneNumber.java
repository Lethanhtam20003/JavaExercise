package BT6;


public class APhoneNumber {
	private String name;
	private long number;
	/*
	 * Testing for the constructor of APhoneNumber
	 * APhoneNumber p1 = new APhoneNumber("TAM", 0343381360);
	 * APhoneNumber p2 = new APhoneNumber("TUAN", 0926455321);
	 * APhoneNumber P3 = new APhoneNumber("NHI", 9327555654);
	 */
	public APhoneNumber(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "APhoneNumber:  " + this.name + "    number: 0" + this.number;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !( obj instanceof APhoneNumber)) {
			return false;
		}else {
			APhoneNumber that = ( APhoneNumber)obj;
			return this.name.equals( that.name) && this.number == that.number;
		}
	}
	
	public long getNumber() {
		return this.number;
	}
	public String getName() {
		return this.name;
	}
}
