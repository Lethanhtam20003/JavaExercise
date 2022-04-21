package BT4;

 
public class Square extends AShape{
	private double size;
	public Square(CartPT location, double size) {
		super(location);
		this.size = size;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Square)) {
			return false;
		}else {
			Square that = (Square)obj;
			return this.location.equals(that.location)
					&& this.size==that.size;
		}
	}
	
	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return Math.sqrt(this.location.getX()*this.location.getX()+this.location.getY()*this.location.getY());
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.size*this.size;
	}
	@Override
	public boolean contains(CartPT point) {
		// TODO Auto-generated method stub
		return point.getX() >= this.location.getX() 
				&& point.getX() <= (this.location.getX() + this.size)
				&& point.getY() >= this.location.getY() 
				&& point.getY() <= (this.location.getY() + this.size);
	}
	@Override
	public Rectangle boundingBox() {
		// TODO Auto-generated method stub
		return new Rectangle(this.location, this.size, this.size);
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.size*4;
	}
}
