package Ex_4_4_Shape;

public abstract class AShape implements IShape {
	protected CartPT loc;

	public abstract double area();

	public abstract double distantToO();

	public abstract boolean contains(CartPT that);

	public abstract Square boudingBox();

	public abstract double perimeter() ;
}
