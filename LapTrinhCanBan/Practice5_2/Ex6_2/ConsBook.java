package Ex6_2;


public class ConsBook implements IBook {
	private ABook first;
	private IBook rest;
	
	public ConsBook(ABook first, IBook rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString()+"\n"+ this.rest.toString() ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ConsBook)) {
			return false;
		}else {
			ConsBook that = (ConsBook)obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
}
