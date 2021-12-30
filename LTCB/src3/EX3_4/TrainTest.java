package EX3_4;

import junit.framework.TestCase;

public class TrainTest extends TestCase{
	public void testContructor() {
		ClockTime c1 = new ClockTime(12, 00);
		ClockTime c2 = new ClockTime(16, 00);
		Schedule s  = new Schedule(c1, c2);
		Route r = new Route("ha noi", "hai phong");
		new Train(s,r, true);
	}
	public void testSameDestination() {
		 ClockTime c1 = new ClockTime(12, 00);
		 ClockTime c2 = new ClockTime(16, 00);
		 Schedule s  = new Schedule(c1, c2);
		 Route r = new Route("ha noi", "hai phong");
		 Train t = new Train(s,r, true);
		 assertEquals(t.sameDestination("ha noi"), false);
		 assertEquals(t.sameDestination("hai phong"),true);
	}
	public void testTimeDestinayion() {
		 ClockTime c1 = new ClockTime(12, 00);
		 ClockTime c2 = new ClockTime(16, 00);
		 
		 Schedule s  = new Schedule(c1, c2);
		 
		 Route r = new Route("ha noi", "hai phong");
		 
		 Train t = new Train(s,r, true);
		 
		 assertEquals(t.timeDestination(), new ClockTime(12, 00));
		 
	} 
	public void testTimeTrip() {
		 ClockTime c1 = new ClockTime(12, 00);
		 ClockTime c2 = new ClockTime(16, 00);
		 Schedule s1  = new Schedule(c1, c2);
		 Route r1 = new Route("ha noi", "hai phong");
		 Train t1 = new Train(s1,r1, true);
		 
		 ClockTime c3 = new ClockTime(23, 00);
		 ClockTime c4 = new ClockTime(2, 00);
		 Schedule s2  = new Schedule(c3, c4);
		 Route r2 = new Route("ha noi", "hai phong");
		 Train t2 = new Train(s2,r2, false);
		 
		 assertEquals(t1.timeTrip(),240);
		 assertEquals(t2.timeTrip(),180);
	}
}
