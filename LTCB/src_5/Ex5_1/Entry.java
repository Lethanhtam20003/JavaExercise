package Ex5_1;

/**
 * @author lethanhtam
 *
 */
public class Entry {
	private Date Day;
	private double distantce;
	private int duration;
	private String comment;

	/**
	 * @param day
	 * @param distantce
	 * @param duration
	 * @param comment
	 */
	public Entry(Date day, double distantce, int duration, String comment) {
		super();
		Day = day;
		this.distantce = distantce;
		this.duration = duration;
		this.comment = comment;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Entry))
			return false;
		else {
			Entry that = (Entry) obj;
			return this.Day == that.Day && this.distantce == that.distantce && this.duration == that.duration
					&& this.comment == that.comment;
		}
	}
}
