package ProductManagement;

public class day {
	private int day;
	private int month;
	private int years;

	public day(int day, int month, int years) {
		super();
		this.day = day;
		this.month = month;
		this.years = years;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day + "/" + this.month + "/" + this.years;
	}

}
