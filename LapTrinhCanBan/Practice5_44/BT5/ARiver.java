package BT5;

 
public abstract class ARiver {
	protected Location location;
	protected double length;
	public ARiver(Location location, double length) {
		super();
		this.location = location;
		this.length = length;
	}
	@Override
	public abstract String toString();
	/**
	 * The EPA must represent river systems and monitor them� An EPA officer may wish to query a computer about the number of sources that feed a river system.
	 * @return
	 */
	public abstract int howManySource();
	/**
	 * An EPA officer may wish to find out whether some location is a part of a river system, regardless of whether it is a source, a confluence, or the river mouth.
	 * @param that
	 * @return
	 */
	public abstract boolean ditermineLocation(Location that);
	/**
	 * An EPA officer may request the number of miles of a river system, either starting from the river's mouth or any of its confluence points.
	 * @return
	 */
	 
	public abstract double howManyMiles();
	/**
	 * An EPA officer may wish to find out whether some location is within a given radius of some confluence or source on a river system
	 * @param radius
	 * @return
	 */
	public abstract boolean withinAGivenRadius(double radius);
	/**
	 * maxlength, which computes the length of the longest river segment;
	 * @return
	 */
	public abstract double maxlength();
	/**
	 * confluences, which counts the number of confluences in the river 
	 * @return
	 */
	public abstract int howManyConsfluance();
}
