package EX3_4;

public class Train {
	Schedule schedule;
	Route route;
	boolean local;
/**
 *ClockTime c1 = new ClockTime(12, 00);
 *ClockTime c2 = new ClockTime(16, 00);
 *Schedule s  = new Schedule(c1, c2);
 *Route r = new Route("ha noi", "hai phong");
 *new Train(s,r, true);
 * @param schedule
 * @param route
 * @param local
 */
	public Train(Schedule schedule, Route route, boolean local) {
		this.schedule = schedule;
		this.route = route;
		this.local = local;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public boolean isLocal() {
		return local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	/**
	 * Does his destination station match the destination of the train trip?
	 *ClockTime c1 = new ClockTime(12, 00);
	 *ClockTime c2 = new ClockTime(16, 00);
	 *Schedule s  = new Schedule(c1, c2);
	 *Route r = new Route("ha noi", "hai phong");
	 *Train t = new Train(s,r, true);
	 *assertEquals(t.sameDestination("ha noi"), true);
	 *assertEquals(t.sameDestination("hoi phong"), false);
	 * @param destination
	 * @return
	 */
	public boolean sameDestination(String destination) {
		return this.route.sameDestination(destination);
	}

	/**
	 * What time does the train start ?
	 *ClockTime c1 = new ClockTime(12, 00);
	 *ClockTime c2 = new ClockTime(16, 00);
	 *Schedule s  = new Schedule(c1, c2);
	 *Route r = new Route("ha noi", "hai phong");
	 *Train t = new Train(s,r, true);
	 *assert(t.timeDestination(), c1);
	 * @return
	 */
	public ClockTime timeDestination() {
		return this.schedule.getDeparture();
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
		return this.schedule.timeTrip();
	}
}
