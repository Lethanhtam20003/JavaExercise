package Ex7_4;

public class Dot extends AShape{
	public Dot(CartPt location) {
		super(location);
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Dot))
			return false;
		else {
			Dot that = (Dot) obj;
			return this.location.equals(that.location);
		}
	}

	public String toString() {
		return " ";
	}

	public boolean contains(CartPt point) {
		return this.location.getX() == point.getX() && this.location.getY() == point.getY();
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.location, 0, 0);
	}
}
