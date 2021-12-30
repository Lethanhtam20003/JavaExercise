package Ex_4_4_Shape;

public class Rectangle extends AShape{
	private int hight;
	private int width;
	/**
	  CartPT pt1 = new CartPT(1,2);
	  IShape s4 = new Rectangle(pt1,10,20);
	 * @param loc
	 * @param hight
	 * @param width
	 */
	public Rectangle(CartPT loc,int hight, int width) {
		this.loc = loc;
		this.hight = hight;
		this.width = width;
	}
	/**
	 * Testing area()
	  CartPT pt1 = new CartPT(1,2);
	  IShape s4 = new Rectangle(pt1,10,20)
	  s4.area();200
	 */
	public double area() {
		return this.hight*this.width;
	}
	/**
	 * Testing distantToO()
	  CartPT pt1 = new CartPT(1,2);
	  IShape s4 = new Rectangle(pt1,10,20);
	  s4.distaintToO();2.24
	 */
	public double distantToO() {
		return this.loc.distantToO();
	}
	private boolean between(int value, int low, int hight) {
		// TODO Auto-generated method stub
		return (low <= value)&&(value <= hight);
	}
	@Override
	/**
	 * Testing contains()
	  CartPT pt1 = new CartPT(1,2);
	  CartPT pt2 = new CartPT(14,27);
	  IShape s4 = new Rectangle(pt1,10,20)
	  s4.contais(pt1);true
	  s4.contais(pt2);false
	 */
	public boolean contains(CartPT that) {
		// TODO Auto-generated method stub
		return (this.between(that.getX(),this.loc.getX() ,this.loc.getX()+ this.width))&&(this.between(that.getY(),this.loc.getY() ,this.loc.getY()+ this.hight));
	}
	public int bigger() {
		if (this.hight >= this.width) {
			return this.hight;
		}else {
			return this.width;
		}
	}
	@Override
	/**
	 * Testing boudingBox()
	  CartPT pt1 = new CartPT(1,2);
	  IShape s4 = new Rectangle(pt1,10,20)
	  s4.boudingBox(); new Square(pt1,20)
	 */
	public Square boudingBox() {
		// TODO Auto-generated method stub
		return new Square (this.loc,this.bigger());
	}
	@Override
	/**
	 * Testing perimeter()
	  CartPT pt1 = new CartPT(1,2);
	  IShape s4 = new Rectangle(p1,10,20)
	  s4.perimeter();30
	 */
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.hight+this.width;
	}
	
}
