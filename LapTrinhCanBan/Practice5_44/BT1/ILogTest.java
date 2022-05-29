package BT1;

import BT3_log.ConsLog;
import BT3_log.Date;
import BT3_log.Entry;
import BT3_log.ILog;
import BT3_log.MTLog;
import junit.framework.TestCase;

public class ILogTest extends TestCase {
	public void testConstructor() {
		//Testing for the constructor
		Entry e1 = new Entry(new Date(13, 6, 2002), 5.0, 25, "good");
		Entry e2 = new Entry(new Date(14, 5, 2002), 6.0, 25, "tired");
		Entry e3 = new Entry(new Date(15, 5, 2002), 4.0, 25, "great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e3,empty);
		ILog l2 = new ConsLog(e2,l1);
		ILog l3 = new ConsLog(e1,l2);
		
     	ILog all = new ConsLog(e1,new ConsLog(e2, new ConsLog(e3, new MTLog())));
     	System.out.println(all);
     	assertEquals(l3, all);
	}
	//Testing for the constructor of miles
	Entry e1 = new Entry(new Date(13, 6, 2002), 5.0, 25, "good");
	Entry e2 = new Entry(new Date(14, 5, 2002), 6.0, 25, "tired");
	Entry e3 = new Entry(new Date(15, 5, 2002), 4.0, 25, "great");
	
	ILog empty = new MTLog();
	ILog l1 = new ConsLog(e3,empty);
	ILog l2 = new ConsLog(e2,l1);
	ILog l3 = new ConsLog(e1,l2);
	
	ILog all = new ConsLog(e1,new ConsLog(e2, new ConsLog(e3, new MTLog())));
	
	
	public void testTotalDistanceInMonth() {
		  assertEquals(l1.totalDistanceInMonth(5,2002),4.0);
		  assertEquals(l3.totalDistanceInMonth(5, 2002),10.0);
	}
	
	public void testMaximumDistance() {
		 assertEquals(all.maximumDistance(),6.0);
	}
	
	public void testSoftBySpeed() {
		ILog all2 = new ConsLog(e3,new ConsLog(e2, new ConsLog(e1, new MTLog())));
		assertEquals(all.softBySpeed(), all2);
	}
}
