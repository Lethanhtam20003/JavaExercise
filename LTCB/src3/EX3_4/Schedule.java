package EX3_4;

public class Schedule {
	private ClockTime departure;
	private ClockTime arrival;
	public Schedule(ClockTime departure, ClockTime arrival) {
		this.departure = departure;
		this.arrival = arrival;
	}
	public ClockTime getDeparture() {
		return departure;
	}
	public void setDeparture(ClockTime departure) {
		this.departure = departure;
	}
	public ClockTime getArrival() {
		return arrival;
	}
	public void setArrival(ClockTime arrival) {
		this.arrival = arrival;
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

	public int timeTrip() {
		return this.arrival.timeTrip(this.departure);
	}
}
