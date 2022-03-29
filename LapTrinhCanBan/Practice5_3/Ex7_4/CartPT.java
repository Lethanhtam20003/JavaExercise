package Ex7_4;

public class CartPt {
	private int x;
	private int y;

	/**
	 * @param x
	 * @param y
	 */
	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;

	}

	public int getY() {
		return this.y;
	}

	public CartPt translate(int dX, int dY) {
		return new CartPt(this.x + dX, this.y + dY);
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof CartPt))
			return false;
		else {
			CartPt that = (CartPt) obj;
			return this.x == that.x && this.y == that.y;
		}
	}
}
