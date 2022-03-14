package Ex7_4;

public class Dot extends AShape {
	private CartPT location;
	/*
	 *Testing for the Constructor 
	 *ISingleShape s1 = new Dot(new CartPT(2, 4)); 
	 */
	public Dot(CartPT location) {
		super();
		this.location = location;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "- dot  : (" + this.location.toString()+")";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Dot)) {
			return false;
		}else {
			Dot that = (Dot)obj;
			return this.location.equals(that.location);
		}
	}
	
	
	@Override
	public double distanseToO() {
		// TODO Auto-generated method stub
		
		return this.location.distanseToO();
	}
	@Override
	public boolean between(int a, int b) {
		// TODO Auto-generated method stub
		if(a==this.location.getX() && b==this.location.getY()) {
			return true;
		}
		return false;
	}
	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.location, 0);
	}
	@Override
	public CartPT translate() {
		// TODO Auto-generated method stub
		return this.location;
	}
}
