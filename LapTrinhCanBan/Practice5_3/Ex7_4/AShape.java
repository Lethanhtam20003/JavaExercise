package Ex7_4;

public abstract class AShape implements IShape {
	protected CartPt location;
	/**
	 * @param location
	 */
	public AShape(CartPt location) {
		super();
		this.location = location;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof AShape))
			return false;
		else {
			AShape that = (AShape) obj;
			return this.location.equals(that.location);
		}
	}

	public String toString() {
		return this.location.toString();
	}

	public double DistancetoO() {
		return Math.sqrt(this.location.getX() * this.location.getX() + this.location.getY() * this.location.getY());
	}

	public abstract boolean contains(CartPt point);

	public abstract Rectangle boundingBox();
}
