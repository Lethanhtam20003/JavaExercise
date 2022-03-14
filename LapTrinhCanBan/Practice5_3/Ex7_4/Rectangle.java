package Ex7_4;

public class Rectangle extends AShape {
	private CartPT location;
	private int width;
	private int hight;

	/*
	 * Testing for the Constructor ISingleShape s4 = new Rectangle(new CartPT(2, 4),
	 * 4, 2);
	 */
	public Rectangle(CartPT location, int width, int hight) {
		super();
		this.location = location;
		this.width = width;
		this.hight = hight;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "- Rectangle: (" + this.location.toString() + ") - width=" + this.width + " , hight= " + this.hight;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof Rectangle)) {
			return false;
		} else {
			Rectangle that = (Rectangle) obj;
			return this.location.equals(that.location) && this.hight == that.hight && this.width == that.width;
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
		if (a > this.location.getX() && (a <= (this.location.getX() + this.width)) && (b >= this.location.getY())
				&& (a <= this.location.getY() + this.hight)) {
			return true;
		}
		return false;
	}

	public int bigger() {
		 if(this.hight > this.width) { 
			 return this.hight ;
			}else { 
			return this.width;
			}
	}

	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.location, this.bigger() );
	}

	@Override
	public CartPT translate() {
		// TODO Auto-generated method stub
		return this.location;
	}

}
