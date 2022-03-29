
package Ex7_4;

public class Circle extends AShape {
	private int radius;

	/**
	 * @param location
	 * @param radius
	 */
	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Circle))
			return false;
		else {
			Circle that = (Circle) obj;
			return this.radius == that.radius && this.location.equals(that.location);
		}
	}

	public String toString() {
		return "Radius: " + this.radius;
	}

	public boolean contains(CartPt point) {
		return Math.sqrt((this.location.getX() - point.getX()) * (this.location.getX() - point.getX())
				+ (this.location.getY() - point.getY()) * (this.location.getY() - point.getY())) <= this.radius;
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.location.translate(-this.radius, -this.radius), 2 * this.radius, 2 * this.radius);
	}
}
