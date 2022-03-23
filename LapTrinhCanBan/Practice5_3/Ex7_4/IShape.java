package Ex7_4;

public interface IShape {
	/**
	 * The user wishes to know how close a combination of shapes is to the origin
	 * Người dùng muốn biết sự kết hợp của các hình dạng gần như thế nào với nguồn gốc
	 * @return
	 */
	public double distanseToO();
	/**
	 * Add a method that determines whether some point in the Cartesian space falls within the boundaries of some shape.
	 * Thêm một phương thức xác định xem một số điểm trong không gian Descartes có nằm trong ranh giới của một số hình dạng hay không.
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean boundaries(int a, int b);
	/**
	 * A graphics program must compute the bounding box for a shape.
	 * Một chương trình đồ họa phải tính toán hộp giới hạn cho một hình dạng.
	 * @return
	 */
	public ConsShape boundingBox();
}
