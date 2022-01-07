package Ex5_5;

public class ASingleShape implements IShape {
	private CartPT location;

	public ASingleShape(CartPT location) {
		super();
		this.location = location;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "location: " + this.location.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ASingleShape)) {
			return false;
		} else {
			ASingleShape that = (ASingleShape) obj;
			return this.location.equals(that.location);
		}
	}
}
