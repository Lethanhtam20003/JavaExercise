package BT16_QuanLyHocSinh;

public class birthDay {
	private int day;
	private int month;
	private int years;
	public birthDay(int day, int month, int years) {
		super();
		this.day = day;
		this.month = month;
		this.years = years;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day+"/"+month+"/"+years;
	}
	
}
