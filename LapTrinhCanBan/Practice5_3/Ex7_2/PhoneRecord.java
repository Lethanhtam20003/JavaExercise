package Ex7_2;


public class PhoneRecord {
	private APhoneNumber phone;
	private int minutes;
	private int second;
	/*
	 * Testing for the constructor of PhoneRecord
	 * PhoneRecord r1 = new PhoneRecord(p1,3,20);
	 * PhoneRecord r2 = new PhoneRecord(p2,4,00);
	 * PhoneRecord r3 = new PhoneRecord(p3,0,30);
	 */
	public PhoneRecord(APhoneNumber phone, int minutes, int second) {
		super();
		this.phone = phone;
		this.minutes = minutes;
		this.second = second;
	}
	@Override
	public String toString() {
		return "PhoneRecord:  " + this.phone.toString() + "    record:  " + minutes + "," + second;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !( obj instanceof PhoneRecord)) {
			return false;
		}else {
			PhoneRecord that = ( PhoneRecord)obj;
			return this.phone.equals(that.phone) && this.minutes == that.minutes && this.second == that.second;
		}
	}
	public boolean ditermineName(String name) {
		// TODO Auto-generated method stub
		return this.phone.getname().equals(name);
	}
}
