package BT9_10;

public interface IShape {
	public double distanceToO();
	public boolean contains(CartPT point);
	public Rectangle boundingBox();
}
