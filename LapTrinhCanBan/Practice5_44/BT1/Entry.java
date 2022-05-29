package BT1;

 
public class Entry {
	private Date date;
	private double distance;
	private int duration; // time
	private String comment;

	/**
	 * @param date
	 * @param distantse
	 * @param duration
	 * @param comment
	 */
	public Entry(Date date, double distantse, int duration, String comment) {
		this.date = date;
		this.distance = distantse;
		this.duration = duration;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "date : " + this.date.toString() + ", distantse : " + this.distance 
				+ ", duration=" + this.duration
				+ ", comment=" + this.comment + "\n"  ;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Entry)) {
			return false;
		}else {
			Entry that = (Entry) obj;
			return this.date.equals(that.date) && 
					this.distance == that.distance &&
					this.duration == that.duration &&
					this.comment.equals(that.comment);
					
		}
	}
	public double getDistatse() {
		return this.distance;
	}
	/**
	 * subMethod of totalDistanceInMonth
	 * @param month
	 * @param year
	 * @return
	 */
	public boolean sameMonthInAYear(int month, int year) {
		return this.date.sameMonthInAYear(month, year);
	}
	/**
	 * subMethod of softBySpeed
	 * @return
	 */
	public double speed() {
		return this.distance/this.duration;
	}
	/**
	 * subMethod of softBySpeed
	 * @param that
	 * @return
	 */
	public boolean hasSpeedThan(Entry that) {
		// TODO Auto-generated method stub
		return this.speed() > that.speed();
	}

	
}
