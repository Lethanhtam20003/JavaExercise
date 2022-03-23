package Ex7_3;


 import junit.framework.TestCase;

public class ILogTest extends TestCase {
	public void testConstructor() {
		//Testing for the constructor
		Entry e1 = new Entry(new Date(5, 5, 2002), 5.0, 25, "good");
		Entry e2 = new Entry(new Date(5, 5, 2002), 5.0, 25, "tired");
		Entry e3 = new Entry(new Date(5, 5, 2002), 5.0, 25, "great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e3,empty);
		ILog l2 = new ConsLog(e2,l1);
		ILog l3 = new ConsLog(e1,l2);
		
     	ILog all = new ConsLog(e1,new ConsLog(e2, new ConsLog(e3, new MTLog())));
     	System.out.println(l3);
     	System.out.println(all);
     	assertEquals(l3, all);
	}
	/**
	 * The runner wants to know the total distance run in
	 * a given month...
	 * Design the method that computes this number
	 */
	public void testMiles() {
		//Testing for the constructor of miles
		Entry e1 = new Entry(new Date(5, 5, 2002), 5.0, 25, "good");
		Entry e2 = new Entry(new Date(5, 5, 2002), 5.0, 25, "tired");
		Entry e3 = new Entry(new Date(5, 5, 2002), 5.0, 25, "great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e3,empty);
		ILog l2 = new ConsLog(e2,l1);
		ILog l3 = new ConsLog(e1,l2);
		
		  assertEquals(l1.miles(),5.0);
		  assertEquals(l3.miles(),15.0);
	}
	public void testGetLog() {
		//Testing for the getLog
		Entry e1 = new Entry(new Date(5, 5, 2002), 5.0, 25, "good");
		Entry e2 = new Entry(new Date(5, 6, 2005), 5.0, 25, "tired");
		Entry e3 = new Entry(new Date(5, 6, 2005), 5.0, 25, "great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e1,empty);
		ILog l2 = new ConsLog(e2,l1);
		ILog l3 = new ConsLog(e3,l2);
		
		ILog t1 = new MTLog();
		ILog t2 = new ConsLog(e2, new MTLog());
		ILog t3 = new ConsLog(e3, new ConsLog(e2, new MTLog()));
		System.out.println(" test getLog \t  "+l3.getLog(6, 2005));
		 assertEquals(l1.getLog(6, 2005),t1); 
		 assertEquals(l2.getLog(6, 2005),t2 );
		 assertEquals(l3.getLog(6, 2005),t3);
	}
	/**
	 * A runner wishes to know the maximum distance ever run ...
	 * Design the method that computes this number.
	 * Assume that the method produces 0 if the log is empty.
	 */
	public void testTotalDistance() {
		//Testing for the tatalDistance
		Entry e1 = new Entry(new Date(5, 5, 2002), 5.0, 25, "good");
		Entry e2 = new Entry(new Date(5, 6, 2005), 5.0, 25, "tired");
		Entry e3 = new Entry(new Date(5, 6, 2005), 5.0, 25, "great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e1,empty);
		ILog l2 = new ConsLog(e2,l1);
		ILog l3 = new ConsLog(e3,l2);
		
		assertEquals(l2.totalDistance(6,2005),5.0);
		assertEquals(l3.totalDistance(6,2005),10.0);
	}
}
