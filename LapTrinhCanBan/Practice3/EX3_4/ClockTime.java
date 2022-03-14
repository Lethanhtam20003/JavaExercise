package EX3_4;

public class ClockTime {
	private int hour;
	private int minutes;

	public ClockTime(int hour, int minutes) {
		this.hour = hour;
		this.minutes = minutes;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if((obj == null) || (obj instanceof ClockTime)) {
			return false;
		}else {
			ClockTime that=(ClockTime)obj;
			return this.hour == that.hour && this.minutes==that.minutes;
		}
	}
	/**
	 * How long does the train trip take?
	 *ClockTime c1 = new ClockTime(12, 00);
	 *ClockTime c2 = new ClockTime(16, 00);
	 *Schedule s1  = new Schedule(c1, c2);
	 *Route r1 = new Route("ha noi", "hai phong");
	 *Train t1 = new Train(s1,r1, true);
	 *
	 *ClockTime c3 = new ClockTime(23, 00);
	 *ClockTime c4 = new ClockTime(2, 00);
	 *Schedule s2  = new Schedule(c1, c2);
	 *Route r2 = new Route("ha noi", "hai phong");
	 *Train t2 = new Train(s2,r2, false);
	 *
	 *assertEquals(t1.timeTrip(),240);
	 *assertEquals(t2.timeTrip(),180);
	 * @param that
	 * @return
	 */
	public int timeTrip(ClockTime that) {
		if (this.hour > that.hour) {

			return (this.hour * 60 + this.minutes) - (that.hour * 60 + that.minutes);
		} else {
			return (24 * 60 - (that.hour * 60 + that.minutes)) + (this.hour * 60 + this.minutes);
		}
	}

}
