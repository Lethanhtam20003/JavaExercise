package EX3_3;
import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase{
	public void testContructor ()
	{
		Date d = new Date (11,04,2003);
		
		TemperatureRange t1 = new TemperatureRange(23,32);
		TemperatureRange t2 = new TemperatureRange(22,33);
		TemperatureRange t3 = new TemperatureRange(12,40);
		
		new WeatherRecord(d,t1,t2,t3,1500);
	}
	
	public void testwithinhRange() {
		 Date d = new Date (11,04,2003);
			
		 TemperatureRange t1 = new TemperatureRange(23,32);
		 TemperatureRange t12 = new TemperatureRange(11,32);
		 TemperatureRange t2 = new TemperatureRange(22,33);
		 TemperatureRange t3 = new TemperatureRange(12,40);
			
		 WeatherRecord w1 = new WeatherRecord(d,t1,t2,t3,1500);
		 WeatherRecord w2 = new WeatherRecord(d,t12,t2,t3,1500);
		 
		 assertEquals(w1.withinRange(),true);
		 assertEquals(w2.withinRange(),false);
	}
	public void testranyDay() {
		 Date d = new Date (11,04,2003);
			
		 TemperatureRange t1 = new TemperatureRange(23,32);
		 TemperatureRange t2 = new TemperatureRange(22,33);
		 TemperatureRange t3 = new TemperatureRange(12,40);
			
		 WeatherRecord w1 = new WeatherRecord(d,t1,t2,t3,1500);
		 
		 assertEquals(w1.ranyDay(2000.2), false);
		 assertEquals(w1.ranyDay(1000.1), true);

	}
	public void testrecordDay() {
		 Date d = new Date (11,04,2003);
			
		 TemperatureRange t1 = new TemperatureRange(23,32);
		 TemperatureRange t12 = new TemperatureRange(11,32);
		 TemperatureRange t2 = new TemperatureRange(22,33);
		 TemperatureRange t3 = new TemperatureRange(12,40);
			
		 WeatherRecord w1 = new WeatherRecord(d,t1,t2,t3,1500);
		 WeatherRecord w2 = new WeatherRecord(d,t12,t2,t3,1500);
		
	 assertEquals(w1.recordDay(),false);
	 assertEquals(w2.recordDay(),true);
	}

}
