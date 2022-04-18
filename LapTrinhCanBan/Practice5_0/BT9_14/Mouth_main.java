package BT9_14;

 
public class Mouth_main {
	private Location location;
	private ARiver river;
	public Mouth_main(Location location, ARiver river) {
		super();
		this.location = location;
		this.river = river;
	}
	/**
	 * The EPA must represent river systems and monitor them� An EPA officer may wish to query a computer about the number of sources that feed a river system.
	 * @return
	 */
	public int howManySource() {
		return this.river.howManySource();
	}
	/**
	 * An EPA officer may wish to find out whether some location is a part of a river system, regardless of whether it is a source, a confluence, or the river mouth.
	 * @param that
	 * @return
	 */
	public boolean ditermineLocation(Location that) {
		return this.river.ditermineLocation(that);
	}
	/**
	 * An EPA officer may request the number of miles of a river system, either starting from the river's mouth or any of its confluence points.
	 * @return
	 */
	public double howMenyMiles() {
		return this.river.howManyMiles();
	}
	/**
	 * An EPA officer may wish to find out whether some location is within a given radius of some confluence or source on a river system
	 * @param radius
	 * @return
	 */
	public boolean withinAGivenRadius(double radius) {
		return this.river.withinAGivenRadius(radius);
	}
	/**
	 * maxlength, which computes the length of the longest river segment;
	 * @return
	 */
	public double maxlength() {
		return this.river.maxlength();
	}
	/**
	 * confluences, which counts the number of confluences in the river 
	 * @return
	 */
	public int howManyConsfluance() {
		return this.river.howManyConsfluance();
	}
	/**
	 * locations, which produces a list of all locations on this river -- the sources, the mouths, and the confluences.
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "list of all locations on the system river : \n" 
				+this.location+", \t is"+this.river.toString() +"  \n " ;
	}
}
