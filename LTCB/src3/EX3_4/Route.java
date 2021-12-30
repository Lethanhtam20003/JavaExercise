package EX3_4;

public class Route {
	private String origin;
	private String destination;
	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
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
		return this.destination.equals(destination);
	}
}
