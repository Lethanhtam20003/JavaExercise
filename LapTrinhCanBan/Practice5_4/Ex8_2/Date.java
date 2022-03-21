package Ex8_2;

public class Date {
	private int day;
	private int month;
	private int years;
	public Date(int day, int month, int years) {
		super();
		this.day = day;
		this.month = month;
		this.years = years;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day+"/"+this.month+"/"+this.years;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Date)) {
			return false;
		}else {
			Date that = (Date)obj;
			return this.day==that.day 
					&& this.month == that.month
					&& this.years == that.years;
		}
	}
	public boolean hasDateOrtherThen(Date that) {
		// TODO Auto-generated method stub
		if(this.years>=that.years && this.month>=that.month && this.day>that.day) {
			return true;
		}else {
			return false;
		}
	}

}
