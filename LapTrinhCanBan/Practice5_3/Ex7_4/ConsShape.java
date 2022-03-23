package Ex7_4;

public class ConsShape implements IShape {
	private AShape first;
	private IShape rest;

	public ConsShape(AShape first, IShape rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + "\n" + this.rest.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ConsShape)) {
			return false;
		} else {
			ConsShape that = (ConsShape) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}

	/*
	 * Testing for the distanseToO() The user wishes to know how close a combination
	 * of shapes is to the origin Người dùng muốn biết sự kết hợp của các hình dạng
	 * gần như thế nào với nguồn gốc
	 */
	@Override
	public double distanseToO() {
		// TODO Auto-generated method stub\
		double n = this.first.distanseToO();
		while (this.rest.distanseToO() != 0) {
			if (n < this.first.distanseToO()) {
				return n = this.first.distanseToO();
			}
			return this.rest.distanseToO();
		}
		return n;
	}

	/**
	 * 
	 * Add a method that determines whether some point in the Cartesian space falls
	 * within the boundaries of some shape. Thêm một phương thức xác định xem một số
	 * điểm trong không gian Descartes có nằm trong ranh giới của một số hình dạng
	 * hay không.
	 */
	@Override
	public boolean boundaries(int a, int b) {
		// TODO Auto-generated method stub
		if (this.first.between(a, b)) {
			return true;
		}
		return this.rest.boundaries(a, b);
	}

	/**
	 * 
	 * A graphics program must compute the bounding box for a shape. Một chương
	 * trình đồ họa phải tính toán hộp giới hạn cho một hình dạng.
	 */
	@Override
	public ConsShape boundingBox() {
		// TODO Auto-generated method stub
		return new ConsShape(this.first.boundingBox(), this.rest.boundingBox());
	}

}
