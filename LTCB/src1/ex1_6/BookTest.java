package ex1_6;
import junit.framework.TestCase;

public class BookTest extends TestCase
{
	public void testContructor()
	{
		new Book("sang", 100, 2016,new Author("nam", 1999));
	}
}
