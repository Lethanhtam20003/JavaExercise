package BT9_10;

public class Circle extends AShape{
	private double radium;
	public Circle(CartPT location, double radium) {
		super(location);
		this.radium = radium;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "location: "+this.location+" \t Shape: Circle, have radium: \t :"+this.radium  ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Circle)) {
			return false;
		}else {
			Circle that = (Circle)obj;
			return this.location.equals(that.location)
					&& this.radium == that.radium;
		}
	}
	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return Math.abs(Math.sqrt(this.location.getX()*this.location.getX()+this.location.getY()*this.location.getY()));
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*this.radium*this.radium;
	}
	@Override
	public boolean contains(CartPT point) {
		// TODO Auto-generated method stub
		return this.location.distanceToPoint(point) < this.radium;
	}
	@Override
	public Rectangle boundingBox() {
		// TODO Auto-generated method stub
		return new Rectangle(this.location.translate((int)this.radium, (int)this.radium), this.radium*2, this.radium*2);
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return Math .PI*2*this.radium;
	}
	
}
