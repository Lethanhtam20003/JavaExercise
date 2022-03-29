package Ex7_4;

public class Rectangle extends AShape{
	private int width;
	private int height;

	/**
	 * @param location
	 * @param width
	 * @param height
	 */
	public Rectangle(CartPt location, int width, int height) {
		super(location);
		this.width = width;
		this.height = height;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Rectangle))
			return false;
		else {
			Rectangle that = (Rectangle) obj;
			return this.location.equals(that.location) && this.width == that.width && this.height == that.height;
		}
	}

	public boolean contains(CartPt point) {
		return this.location.getX() >= this.location.getX() && this.location.getX() <= this.location.getX() + this.width
				&& this.location.getY() >= this.location.getY()
				&& this.location.getY() <= this.location.getY() + this.height;
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.location, this.width, this.height);
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
}
