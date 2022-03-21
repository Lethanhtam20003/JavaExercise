/**
 * 
 */
package Ex8_1;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class ILogRunerTest extends TestCase {
	public void testConstructor() {
		//Testing for the constructor
		Entry e1 = new Entry(new Date(13, 6, 2002), 7.0, 25, "good");
		Entry e2 = new Entry(new Date(14, 5, 2002), 10.0, 25, "tired");
		Entry e3 = new Entry(new Date(15, 5, 2002), 2.0, 25, "great");
		
		ILogRuner empty = new MTLogRuner();
		ILogRuner l1 = new ConsLogRuner(e3,empty);
		ILogRuner l2 = new ConsLogRuner(e2,l1);
		ILogRuner l3 = new ConsLogRuner(e1,l2);
		
		ILogRuner all = new ConsLogRuner(e1,new ConsLogRuner(e2, new ConsLogRuner(e3, new MTLogRuner())));
     	System.out.println(l3);
     	System.out.println(all);

	}
	public void testXepXepTheoKhoangCach() {
		//Testing for the constructor
		Entry e1 = new Entry(new Date(13, 6, 2002), 7.0, 25, "good");
		Entry e2 = new Entry(new Date(14, 5, 2002), 10.0, 25, "tired");
		Entry e3 = new Entry(new Date(15, 5, 2002), 2.0, 25, "great");
		
		ILogRuner empty = new MTLogRuner();
		ILogRuner l1 = new ConsLogRuner(e3,empty);
		ILogRuner l2 = new ConsLogRuner(e2,l1);
		ILogRuner l3 = new ConsLogRuner(e1,l2);
		
		ILogRuner all = new ConsLogRuner(e1,new ConsLogRuner(e2, new ConsLogRuner(e3, new MTLogRuner())));
		System.out.println("hahah"+"\n");
     	System.out.println(all.sapXepTheokhoanCach());

	}
	
}
