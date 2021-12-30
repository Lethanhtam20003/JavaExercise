package Ex_4_4_Shape;

public class Dot extends AShape {
	/**
	 * Testing Constructer
	  CartPT pt1 = new CartPT(1,2);
	  IShape = New Dot(pt1);
	 * @param loc
	 */
	public Dot(CartPT loc)
	{
		this.loc = loc;
	}
	/**
	 * Testing area()
	   CartPT pt1 = new CartPT(1,2);
	   IShape s1 = New Dot(pt1);
	   s1.area();0.0
	 */
	public double area() {
		return 0.0;
	}
	/**
	 * Testing distantToO
	  CartPT pt1 = new CartPT(1,2);
	  IShape s1 = New Dot(pt1);
	  s1.distantsToO(); 2.34
	 */
	public double distantToO() {
		return this.loc.distantToO();
	}
	/**
	 * Testing contains()
	  CartPT pt1 = new CartPT(1,2);
	  IShape d1 = New Dot(pt1);
	  CartPT pt2 = new CartPT(3,33);
	  d1.contains(pt1); true
	  d1.contains(pt2); false
	 */
	public boolean contains(CartPT that) {
		return this.loc.distantTo(that) == 0.0;
	}
	/**
	 * Testing boudingBox()
	  CartPT pt1 = new CartPT(1,2);
	  IShape d1 = new Dot (pt1);
	  d1.boudingBox(); new Square(pt1,0)
	 */
	public Square boudingBox() {
		return new Square(this.loc,0);
	}
	@Override
	/**
	 * Testing perimerter()
	  CartPT pt1 = new CartPT(1,2);
	  IShape d1 = new Dot (pt1);
	  d1.perimeter(); 0.0
	 */
	public double perimeter() {
		return 0.0;
	}
}
