/**
 * 
 */
package BT5; 
/**
 * @author lethanhtam
 *
 */
public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return "first : " + this.first.toString() + "\n  rest : " + this.rest.toString() + "\n ";
	} 
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLog)) {
			return false;
		}else {
			ConsLog that = (ConsLog) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
		}
	}
	
	/*
	 * Testing for the tatalDistance
	 * l1.totalDistance(),0);
	 * l2.totalDistance(),5.0);
	 * l3.totalDistance(),10.0);
	 */
	@Override
	public double totalDistanceInMonth(int month, int year) {
		// TODO Auto-generated method stub
		if (this.first.sameMonthInAYear(month, year)) {
		return this.first.getDistatse() + this.rest.totalDistanceInMonth(month, year);
		}
		return this.rest.totalDistanceInMonth(month, year);
	}
	/**
	 * Exercise 5.2.2 
	 * Testing for the maximunDistance
	 * 
	 */
	@Override
	public double maximumDistance() {
		// TODO Auto-generated method stub
		return Math.max(this.first.getDistatse(), this.rest.maximumDistance());
	}
	/**
	 * Exercise 5.2.2 
	 * Testing for the maximunDistance
	 * 
	 */
	public double maxDistanse() {
		return maxHelper(this.first.getDistatse());
	}
	public double maxHelper(double distanceMax) {
		// TODO Auto-generated method stub
		if(  this.first.getDistatse() > distanceMax) 
			return this.rest.maxHelper(this.first.getDistatse());	
		else
			return this.rest.maxHelper(distanceMax);
	}
	
}