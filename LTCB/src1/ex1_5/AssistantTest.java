package ex1_5;
import junit.framework.TestCase;

public class AssistantTest extends TestCase 
{
	public void testContructor()
	{
		new Assistant("Ranch",7, 375.000,new Address( 23," Maple Street"," Brookline"));
	}
}
