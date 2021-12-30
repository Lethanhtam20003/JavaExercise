
package ex1_8;
import junit.framework.TestCase;
public class TrainTest extends TestCase 
{
	public void testContructor()
	{
		new Train(new Schedule(new ClockTime(12,30),new ClockTime(2,00)),new Route("hp","hcm"),true);
	}
}
