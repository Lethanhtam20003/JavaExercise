package BT9_10;
 
public class Rectangle extends AShape{
	private double hight;
	private double wight;
	
	public Rectangle(CartPT location, double hight, double wight) {
		super(location);
		this.hight = hight;
		this.wight = wight;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Rectangle)) {
			return false;
		}else {
			Rectangle that = (Rectangle)obj;
			return this.location.equals(that.location)
					&& this.hight == that.hight
					&& this.wight == that.wight;
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
		return this.hight*this.wight;
	}
	@Override
	public boolean contains(CartPT point) {
		// TODO Auto-generated method stub
		return point.getX() >= this.location.getX() 
				&& point.getX() <= (this.location.getX() + this.wight)
				&& point.getY() >= this.location.getY() 
				&& point.getY() <= (this.location.getY() + this.hight);
	}
	@Override
	public Rectangle boundingBox() {
		// TODO Auto-generated method stub
		return new Rectangle(this.location, this.hight, this.wight);
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.hight+this.wight*2;
	}
	public double getWidth() {
		// TODO Auto-generated method stub
		return this.wight;
	}
	public double getHeight() {
		// TODO Auto-generated method stub
		return this.hight;
	}	
}
