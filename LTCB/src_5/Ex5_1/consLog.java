package Ex5_1;

public class consLog implements ILog {
	private Entry first;
	private ILog rest;
	/**
	 * @param first
	 * @param rest
	 */
	public consLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return this.first.toString() + "\n "+
				this.rest.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLog))
			return false;
		else {
			consLog that = ( consLog) obj;
			return this.first.equals(that.first)&&
					this.rest.equals(that.rest);
		}
	}
	
}
