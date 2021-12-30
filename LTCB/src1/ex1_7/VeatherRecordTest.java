package ex1_7;

import junit.framework.TestCase;

public class VeatherRecordTest extends TestCase 
{
	public void testContructor ()
	{
		new VeatherRecord(new TemperatureRange(12,32),new TemperatureRange(12,23),
				new TemperatureRange(45,16),67,new Date (11,04,2003));
	}
}

