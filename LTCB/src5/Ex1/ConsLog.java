/**
 * 
 */
package Ex1;

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
}
