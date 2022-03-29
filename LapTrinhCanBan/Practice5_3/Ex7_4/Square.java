package Ex7_4;

public class Square extends AShape{
	private int size;

	/**
	 * @param location
	 * @param size
	 */
	public Square(CartPt location, int size) {
		super(location);
		this.size = size;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Square))
			return false;
		else {
			Square that = (Square) obj;
			return this.location.equals(that.location) && this.size == that.size;
		}
	}

	public boolean contains(CartPt point) {
		return this.location.getX() <= point.getX() && point.getX() <= this.location.getX() + this.size
				&& this.location.getY() - this.size <= point.getY() && point.getY() <= this.location.getY();

	}

	public Rectangle boundingBox() {
		return new Rectangle(this.location, this.size, this.size);
	}
}
