package Ex7_4;

public class Square extends AShape {
	private CartPT location;
	private int size;
	/*
	 * Testing for the constructor
	 * ISingleShape s3 = new Square(new CartPT(2, 4), 2);
	 */
	public Square(CartPT location, int size) {
		super();
		this.location = location;
		this.size = size;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "- Square:  (" + this.location.toString()+ ") - size= " + this.size;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Square)) {
			return false;
		}else {
			Square that = (Square)obj;
			return this.location.equals(that.location) && this.size == that.size;
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
		if(a > this.location.getX() 
				&& (a <= (this.location.getX()+this.size)) 
				&& (b >= this.location.getY() )
				&& (a <= this.location.getY()+this.size)) {
			return true;
		}
		return false;
	}
	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.location, this.size);
	}
	@Override
	public CartPT translate() {
		// TODO Auto-generated method stub
		return null;
	}
}
