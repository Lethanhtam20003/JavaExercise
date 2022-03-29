/**
 * 
 */
package BT9_10;

/**
 * @author lethanhtam
 *
 */
public class Dot extends AShape{

	public Dot(CartPT location) {
		super(location);
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
	public double distanceToO() {
		// TODO Auto-generated method stub
		return Math.sqrt(this.location.getX()*this.location.getX()+this.location.getY()*this.location.getY());
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean contains(CartPT point) {
		// TODO Auto-generated method stub
		return this.location == point ;
	}
	@Override
	public Rectangle boundingBox() {
		// TODO Auto-generated method stub
		return new Rectangle(this.location, 0, 0);
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
