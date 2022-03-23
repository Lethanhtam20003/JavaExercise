package Ex5_3;

public class Intersection {
	private int street;
	private int avenue;

	public Intersection(int street, int avenue) {
		super();
		this.street = street;
		this.avenue = avenue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Street " + this.street + " avenue :" + this.avenue;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if ( obj == null || !(obj instanceof Intersection)) {
			return false;
		} else {
		Intersection that = (Intersection) obj;	
		return this.street == that.street && this.avenue == that.avenue;
		}
	}
}
