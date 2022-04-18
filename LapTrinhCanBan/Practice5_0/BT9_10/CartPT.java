package BT9_10;
 
public class CartPT {
	private int x;
	private int y;
	public CartPT(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof CartPT)) {
			return false;
		}else {
			CartPT that = (CartPT)obj;
			return this.x ==that.x
					&& this.y==that.y;
		}
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
//	public double distanceToO() {
//		return Math.sqrt(this.getX()*this.getX()+this.getY()*this.getY());
//	}
	public double distanceToPoint(CartPT that) {
		return Math.sqrt( (this.getX()-that.getX()) * (this.getX()-that.getX()) 
				+ (this.getY()-that.getY()) * (this.getY()-that.getY()));
	}
	public CartPT translate(int dx,int dy) {
		return new CartPT(this.getX()-dx, this.getY()-dy);
	}
}
