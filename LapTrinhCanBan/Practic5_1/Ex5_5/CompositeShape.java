package Ex5_5;

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
		return " top: " + this.top.toString() + "\n bottom: " + this.bottom.toString() + "\n";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof CompositeShape)) {
			return false;
		}else {
			CompositeShape that = ( CompositeShape) obj;
			return this.top.equals(that.top) && this.bottom.equals(that.bottom);
		}
	}
}
