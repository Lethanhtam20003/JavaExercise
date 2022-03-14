/**
 * 
 */
package Ex_4_5_AGallery;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class AAGalleryTest extends TestCase {
	public void testConstructor() {
		AAGallery c1 = new Text("Welcome.txt", 5312, 830);
		AAGallery c2 = new MP3("theme.mp3", 40960, 20);
		AAGallery c3 = new Images("flower.gif", 57234, 100, 50, "medium");
	}

	public void testTimeToDownLoad() {
		// Testing timeToDownLoad(double networkSpeed)
		 AAGallery c1 = new Text("Welcome.txt",5312,830);
		 assertEquals(c1.timeToDownLoad(500), 10.62,0.01);
		 AAGallery c2 = new MP3("theme.mp3",40960,20);
		 assertEquals(c2.timeToDownLoad(500), 81.92,0.01);
		 AAGallery c3 = new Images("flower.gif",57234,100,50,"medium");
		 assertEquals(c3.timeToDownLoad(500), 114.47,0.01);
	}

	public void testSmallThan() {
		AAGallery c1 = new Text("Welcome.txt", 5312, 830);
		assertEquals(c1.smallThan(1000), false);
		AAGallery c2 = new MP3("theme.mp3", 40960, 20);
		assertEquals(c2.smallThan(100000), true);
		AAGallery c3 = new Images("flower.gif", 57234, 100, 50, "medium");
		assertEquals(c3.smallThan(57234), true);
		
	}

	public void testSameName() {
		AAGallery c1 = new Text("Welcome.txt", 5312, 830);
		assertEquals(c1.sameName("Welcome"), false);
		AAGallery c2 = new MP3("theme.mp3", 40960, 20);
		assertEquals(c2.sameName("thene.mp3"), false);
		AAGallery c3 = new Images("flower.gif", 57234, 100, 50, "medium");
		assertEquals(c3.sameName("flower.gif"), true);
	}

}
