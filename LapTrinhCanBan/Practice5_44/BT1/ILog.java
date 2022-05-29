/**
 * 
 */
package BT1;

 
/**
 * @author lethanhtam
 *
 */
public interface ILog {
	/**
	 * 5.5.1 Suppose the requirements for the program that tracks a runner's log includes this request: ... The runner wants to know the  otal distance run in a given month...
	 * @param month
	 * @param year
	 * @return
	 */
	public double totalDistanceInMonth(int month, int year);
	/**
	 * 5.5.2 Suppose the requirements for the program that tracks a runner's log includes this request: ... A runner wishes to know the maximum distance ever run ...
	 * @return
	 */
	public double maximumDistance();
	
	/**
	 * .. The runner would like to see the log with entries ordered according to the pace computed in minutes per mile in each run, from the fastest to the slowest ...
	 * @return
	 */
	public ILog softBySpeed();
	/**
	 * subMethod of SoftByspeed
	 * @param that
	 * @return
	 */
	public ILog insertILogorther(Entry that);
}
