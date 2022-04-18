package BT9_10;

 
public abstract class AShape implements IShape {
	protected CartPT location;
	public AShape(CartPT location) {
		this.location = location;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof AShape))
			return false;
		else {
			AShape that = (AShape) obj;
			return this.location.equals(that.location);
		}
	}
	public abstract double distanceToO();

	public abstract double area();

	public abstract boolean contains(CartPT point);

	public abstract Rectangle boundingBox();

	public abstract double perimeter();
	
	
	
}
