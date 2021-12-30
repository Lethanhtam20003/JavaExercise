package Ex_4_4_Shape;

public class Square extends AShape {
	private int size;
	/**
	 * Testing constructor
	  CartPT pt1 = new CartPT(1,2);
	  IShape s2 = new Square(pt1,5);
	 * @param loc
	 * @param size
	 */
	public Square(CartPT loc,int size) {
		this.loc = loc;
		this.size = size;
	}
	/**
	 * Testing area 
	  CartPT pt1 = new CartPT(1,2);
	  IShape s2 = new Square(pt1,5);
	  s2.area();25
	 */
	public double area() {
		return this.size*this.size;
	}
	/**
	 * Testing distantToO
	  CartPT pt1 = new CartPT(1,2);
	  IShape s2 = new Square(pt1,5);
	  s2.distantToO();2.24
	 */
	public double distantToO() {
		return this.loc.distantToO();
	}
	@Override
	/**
	 * Testing contains()
	  CartPT pt1 = new CartPT(1,2);
	  CartPT pt2 = new CartPT(6,8);
	  IShape s2 = new Square(pt1,5);
	  s2.contains(pt1);true
	  s2.contains(pt2);false
	 */
	public boolean contains(CartPT that) {
		// TODO Auto-generated method stub
		return this.between(that.getX(),this.loc.getX(),this.loc.getX()+this.size)
						&&this.between(that.getY(), this.loc.getY(), this.loc.getY()+this.size);
	}
	private boolean between(int value, int low, int hight) {
		// TODO Auto-generated method stub
		return (low <= value)&&(value <= hight);
	}
	@Override
	/**
	 * Testing boudingBox()
	  CartPT pt1 = new CartPT(1,2);
	  IShape s2 = new Square(pt1,5);
	  s2.boudingBox();s2
	  
	 */
	public Square boudingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc, this.size);
	}
	@Override
	/**
	 * Testing perimeter()
	  CartPT pt1 = new CartPT(1,2);
	  IShape s2 = new Square(pt1 ,5);
	  s2.perimeter();20
	 */
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.size*4;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	if ((obj == null) || !(obj instanceof Square)) {
		return false;
	 }else {
		Square that = (Square) obj;
		return (this.loc.equals(that.loc))&&(this.size == that.size);
	 }
	}
	
}
