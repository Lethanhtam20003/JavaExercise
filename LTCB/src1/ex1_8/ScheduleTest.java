package ex1_8;
import junit.framework.TestCase;

public class ScheduleTest extends TestCase
{
	public void testContructor()
	{
		new Schedule(new ClockTime(12,30),new ClockTime(2,00));
	}
}
