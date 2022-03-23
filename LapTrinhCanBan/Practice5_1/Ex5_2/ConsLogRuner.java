package Ex5_2;

public class ConsLogRuner implements ILogRuner {
	private Entry first;
	private ILogRuner rest;
	public ConsLogRuner(Entry first, ILogRuner rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + "\n"+this.rest.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ConsLogRuner)) {
			return false;
		}else {
			ConsLogRuner that = (ConsLogRuner)obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	
}
