package Ex5_2;


public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day +"/"+this.month+"/"+this.year;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Date)) {
			return false;
		}else {
			Date that = (Date)obj;
			return this.day==that.day 
					&& this.year == that.year
					&& this.month==that.month;
		}
	}
}