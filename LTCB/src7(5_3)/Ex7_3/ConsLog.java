/**
 * 
 */
package Ex7_3;

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
	 * Testing for the miles of miles
	 * assertEquals(i1.miles(),);
	 * assertEquals(i3.miles(),);
	 */
	@Override
	public double miles() {
		// TODO Auto-generated method stub
		return this.first.getDistatse() + this.rest.miles();
	}
	/*
	 * Testing for the getLog  
	 * assertEquals(l1.getLog(6, 2005),t1); 
	 * assertEquals(l2.getLog(6, 2005),t2 );
	 * assertEquals(l3.getLog(6, 2005),t3);
	 */
	@Override
	public ILog getLog(int month, int year) {
		// TODO Auto-generated method stub
		if (this.first.sameMonthInAYear(month, year)) {
			return new ConsLog(this.first, this.rest.getLog(month, year));
		}else {
			
		return this.rest.getLog(month, year);
		}
	}
	/*
	 * Testing for the tatalDistance
	 * l1.totalDistance(),0);
	 * l2.totalDistance(),5.0);
	 * l3.totalDistance(),10.0);
	 */
	@Override
	public double totalDistance(int month, int year) {
		// TODO Auto-generated method stub
		if (this.first.sameMonthInAYear(month, year)) {
		return this.first.getDistatse() + this.rest.totalDistance(month, year);
		}
		return this.rest.totalDistance(month, year);
	}
	
}
