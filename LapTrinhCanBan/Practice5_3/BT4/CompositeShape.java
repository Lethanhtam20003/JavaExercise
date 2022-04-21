/**
 * 
 */
package BT4;

 
/**
 * @author lethanhtam
 *
 */
public class CompositeShape implements IShape {
	private IShape top;
	private IShape bottom;
	public CompositeShape(IShape top, IShape bottom) {
		super();
		this.top = top;
		this.bottom = bottom;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.top.toString()+"\n"+this.bottom.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof CompositeShape)) {
			return false;
		}else {
			CompositeShape that = (CompositeShape)obj;
			return this.top.equals(that.top)
					&& this.bottom.equals(that.bottom);
		}
	}
	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return Math.min(this.top.distanceToO(), this.bottom.distanceToO());
	}
	@Override
	public boolean contains(CartPT point) {
		// TODO Auto-generated method stub
		return this.top.contains(point) || this.bottom.contains(point);
	}
	@Override
	public Rectangle boundingBox() {
		// TODO Auto-generated method stub
		Rectangle bbTop = this.top.boundingBox();
		Rectangle bbBottom = this.bottom.boundingBox();

		int x1 = Math.min(bbTop.location.getX(), bbBottom.location.getX()); // x1 = 3
		int y1 = Math.min(bbTop.location.getY(), bbBottom.location.getY()); // y1 = 3

		int x2 = (int) Math.max(bbTop.location.getX() + bbTop.getWidth(), bbBottom.location.getX() + bbBottom.getWidth()); // x2
																														// =
																														// 53
		int y2 = (int) Math.max(bbTop.location.getY() + bbTop.getHeight(), bbBottom.location.getY() + bbBottom.getHeight()); // y2
																														// =
																														// 54

		return new Rectangle(new CartPT(x1, y1), x2 - x1, y2 - y1);
	}
	
	
	
	
	
}
