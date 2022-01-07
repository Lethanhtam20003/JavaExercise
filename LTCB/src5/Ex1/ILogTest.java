package Ex1;

import junit.framework.TestCase;

public class ILogTest extends TestCase {
	public void testConstructor() {
		
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
}
