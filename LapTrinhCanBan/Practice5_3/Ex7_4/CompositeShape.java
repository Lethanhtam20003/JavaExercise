/**
 * 
 */
package Ex7_4;

/**
 * @author lethanhtam
 *
 */
public class CompositeShape implements IShape {
	private IShape top;
	private IShape bottom;

	/**
	 * @param top
	 * @param bottom
	 */
	public CompositeShape(IShape top, IShape bottom) {
		super();
		this.top = top;
		this.bottom = bottom;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof CompositeShape))
			return false;
		else {
			CompositeShape that = (CompositeShape) obj;
			return this.top.equals(that.top) && this.bottom.equals(that.bottom);
		}
	}

	public String toString() {
		return this.top.toString() + "\n" + this.bottom.toString();
	}

	public double DistancetoO() {
		return Math.min(this.top.DistancetoO(), this.bottom.DistancetoO());
	}

	public boolean contains(CartPt point) {
		return this.top.contains(point) || this.bottom.contains(point);
	}

	public Rectangle boundingBox() {
		Rectangle bbTop = this.top.boundingBox();
		Rectangle bbBottom = this.bottom.boundingBox();

		int x1 = Math.min(bbTop.location.getX(), bbBottom.location.getX()); // x1 = 3
		int y1 = Math.min(bbTop.location.getY(), bbBottom.location.getY()); // y1 = 3

		int x2 = Math.max(bbTop.location.getX() + bbTop.getWidth(), bbBottom.location.getX() + bbBottom.getWidth()); // x2
																														// =
																														// 53
		int y2 = Math.max(bbTop.location.getY() + bbTop.getHeight(), bbBottom.location.getY() + bbBottom.getHeight()); // y2
																														// =
																														// 54

		return new Rectangle(new CartPt(x1, y1), x2 - x1, y2 - y1);

	}
}
