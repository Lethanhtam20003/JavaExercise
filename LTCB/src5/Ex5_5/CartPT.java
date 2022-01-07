package Ex5_5;

public class CartPT {
	private int x;
	private int y;
	public CartPT(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " x: " + this.x + ", y: " + this.y;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if( obj == null || !(obj instanceof CartPT)) {
			return false;
	 }else {
			CartPT that = (CartPT) obj;
			return this.x == that.x && this.y == that.y;
		}
	}
	
}
