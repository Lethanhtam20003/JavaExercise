package Ex7_4;

public class Circle extends AShape {
	private CartPT location;
	private int radium;
	/*
	 * Testing for the Constructor
	 * ISingleShape s2 = new Circle( new CartPT(2, 2),2);
	 */
	public Circle(CartPT location, int radium) {
		super();
		this.location = location;
		this.radium = radium;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "- Cirrle:  (" + this.location.toString()+ ") - radium= " + this.radium;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Circle)) {
			return false;
		}else {
			Circle that = (Circle)obj;
			return this.location.equals(that.location) && this.radium == that.radium;
		}
	}
	@Override
	public double distanseToO() {
		// TODO Auto-generated method stub
		return this.location.distanseToO()-this.radium;
	}
	@Override
	public boolean between(int a, int b) {
		// TODO Auto-generated method stub
		if(a >= this.location.getX() - this.radium 
				&& (a  <= this.location.getX()+this.radium )
				&& (b >= this.location.getY()  - this.radium ) 
				&& (a <= this.location.getY()+this.radium ) )  {
			return true;
		}
		return false;
	}
	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.translate(), this.radium) ;
	}
	@Override
	public CartPT translate() {
		// TODO Auto-generated method stub
		return  new CartPT( this.location.getX()-this.radium,this.location.getY()-this.radium);
	}
}
