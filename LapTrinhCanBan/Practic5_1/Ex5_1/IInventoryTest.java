/**
 * 
 */
package Ex5_1;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class IInventoryTest extends TestCase {
	public void testConstructor() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		IInventory empty = new MTInventory();
		IInventory i1 = new ConsInventory(gun, empty);
		IInventory i2 = new ConsInventory(robot, i1);
		IInventory i3 = new ConsInventory(doll, i2);
		IInventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		
		System.out.println(all);
	}
}
