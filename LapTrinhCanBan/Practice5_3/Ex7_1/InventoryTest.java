package Ex7_1;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	/**
	 * testing the Constructor 
	 */
	public void testConstructor() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		
		System.out.println(all);
	}
	/**
	 * Phát triển phương pháp chứa, xác định xem tên đồ chơi 
	 * có xuất hiện trong Khoảng không quảng cáo hay không
	 */
	public void testContains() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

		assertFalse(empty.contains("robot"));
		assertFalse(i1.contains("robot"));
		assertTrue(i2.contains("robot"));
		assertTrue(i3.contains("robot"));
		assertTrue(all.contains("robot"));
		assertFalse(all.contains("car"));
	}
	/**
	 * Phát triển phương pháp isBelow, phương pháp này
	 *  kiểm tra xem tất cả giá đồ chơi trong kho có dưới 
	 *  ngưỡng hay không
	 */
	public void testIsBelow() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

		assertTrue(empty.isBelow(20));
		assertTrue(i1.isBelow(20));
		assertFalse(i3.isBelow(20));
		assertFalse(all.isBelow(20));
	}
	/**
	 * Phát triển phương pháp HowMany,
	 *  sản xuất số lượng đồ chơi trong kho.
	 */
	public void testHowMany() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

		assertEquals(empty.howmany(), 0);
		assertEquals(all.howmany(), 3);
	}
	/**
	 * Phát triển phương pháp tăng giá, tạo ra một khoảng không 
	 * quảng cáo trong đó tất cả giá được tăng với tỷ lệ 5% (sử dụng có thể thay đổi và bất biến).
	 */
	public void testRaisePrice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		System.out.println(all); 
		Inventory all2 = new ConsInventory(new Toy("doll", 18.8475, 5),
				new ConsInventory(new Toy("robot", 23.1525, 3), 
						new ConsInventory(new Toy("gun", 15.75, 4), 
								new MTInventory())));
		
		System.out.println(all.raisePrice(0.05));
		
		assertEquals(all.raisePrice(0.05), all2);
	}
	/**
	 * Phát triển phương pháp tăng giá, tạo ra một khoảng không 
	 * quảng cáo trong đó tất cả giá được tăng với tỷ lệ 5% (sử dụng có thể thay đổi và bất biến).
	 */
	public void testRaisePriceMutable() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		System.out.println(all); 
		Inventory all2 = new ConsInventory(new Toy("doll", 18.8475, 5),
				new ConsInventory(new Toy("robot", 23.1525, 3), 
						new ConsInventory(new Toy("gun", 15.75, 4), 
								new MTInventory())));
		
		System.out.println(all.raisePrice(0.05));
		
		assertEquals(all.raisePrice(0.05), all2);
	}
	/**
	 * submethod of averagePrice
	 */
	public void testSumprice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		
		assertEquals(all.sumPrice(), 55.0);
	}
	/**
	 * Xác định phương pháp trung bìnhPrice. Nó tính giá trung bình của đồ chơi trong Hàng tồn kho. 
	 * Giá trung bình là tổng của tất cả các giá chia cho số lượng đồ chơi
	 */
	public void testAveragePrice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		
		assertEquals(all.sumPrice(), 55.0);
		assertEquals(all.averagePrice(), 18.33,0.01);
	}
	/**
	 * Phát triển phương thức ReplaceName, phương thức này sử dụng một danh sách
	 *  đồ chơi và thay thế tất cả các lần xuất hiện của “rô bốt” bằng “r2d2” 
	 *  và nếu không sẽ giữ nguyên các mô tả đồ chơi theo thứ tự.
	 */
    public void testReplaceName() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy robot2 = new Toy("r2d2", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		Inventory iTest = new ConsInventory(doll, new ConsInventory(robot2, new ConsInventory(gun, new MTInventory())));
		assertEquals(all.replaceName("robot"), iTest);
	}
    /**
     * Phát triển phương pháp loại bỏ. Phương thức này sử dụng một chuỗi,
     *  được gọi là toyOfName và tạo ra một danh sách các đồ chơi chứa tất 
     *  cả các thành phần của danh sách, ngoại trừ đồ chơi có tên trùng với
     *   toyOfName.
     */
    public void testEliminate() {
    	Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy robot2 = new Toy("r2d2", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		
		Inventory imoi = new ConsInventory(doll, i1);

		assertEquals(all.eliminate("robot"), imoi);
	}
}
