package BT1;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {
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
