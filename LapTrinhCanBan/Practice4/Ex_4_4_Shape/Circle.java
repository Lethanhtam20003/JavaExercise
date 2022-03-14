package Ex_4_4_Shape;

public class Circle extends AShape {
	private int radius;

	/**
	 * Testing constructor 
	 * CartPT pt1 = new CartPT(1,2);
	 * IShape s1 = new Circle(pt1,3.0);
	 * @param loc
	 * @param radius
	 */
	public Circle(CartPT loc, int radius) {
		this.loc = loc;
		this.radius = radius;
	}

	/**
	 * Testing area() 
	 * CartPT pt1 = new CartPT(1,2); 
	 * IShape s1 = new Circle(pt1,3.0);
	 * s1.area();28.26
	 */
	public double area() {
		return Math.PI * (this.radius * this.radius);
	}

	/**
	 * Testing distantToO() 
	 * CartPT pt1 = new CartPT(1,2); 
	 * IShape s1 = new Circle(pt1,3.0);
	 * s1.distantToO(); 2.24
	 */
	public double distantToO() {
		return this.loc.distantToO();
	}

	/**
	 * Testing contains(CartPT that) 
	 * CartPT pt1 = new CartPT(1,2); 
	 * IShape s1 = new Circle(pt1,3.0);
	 * CartPT pt2 = new CartPT(3,4);
	 * s1.contains(pt1); true
	 * s1.contains(pt2); false
	 */
	public boolean contains(CartPT that) {
		return this.loc.distantTo(that) < this.radius;
	}

	/**
	 * Testing boudingBox() 
	 * CartPT pt1 = new CartPT(1,2); 
	 * IShape s1 = new Circle(pt1,3.0);
	 * s1.boudingBox(); new Square(new CartPT(-2,-1),6)
	 */
	public Square boudingBox() {
		return new Square(this.loc.translate(this.radius, this.radius), this.radius * 2);
	}

	@Override
	/**
	 * Testing perimeter() 
	 * CartPT pt1 = new CartPT(1,2); 
	 * IShape s1 = new Circle(pt1,3.0);
	 * s1.perimeter(); 18.48 
	 */
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.radius * 2 * Math.PI;
	}
}
