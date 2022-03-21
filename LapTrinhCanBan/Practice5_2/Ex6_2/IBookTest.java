/**
 * 
 */
package Ex6_2;
 
import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class IBookTest extends TestCase {
	public void testConstructor() {
		// Testing for the ABook
		   ABook b1 = new ABook("Robinson Crusoe","Daniel Defoe",1719,15.50);
		   ABook b2 = new ABook("Heart of Darkness","Joseph Conrad",1902,12.80);
		   ABook b3 = new ABook("Beach Music","Pat Conroy",1996,9.50);
	    // Testing for the ConsBook 
		  IBook i1 = new ConsBook(b1, new ConsBook(b2,new ConsBook(b3, new MTBook())));
		  System.out.println(i1);
	}
}
