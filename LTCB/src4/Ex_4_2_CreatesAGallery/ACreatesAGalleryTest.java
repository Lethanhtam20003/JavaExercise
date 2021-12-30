package Ex_4_2_CreatesAGallery;

import junit.framework.TestCase;

public class ACreatesAGalleryTest extends TestCase {
	public void testContructor() {
		ACreatesAGallery c1 = new Text("Welcome.txt",5312,830);
		ACreatesAGallery c2 = new MP3("theme.mp3",40960,2,0);
		ACreatesAGallery c3 = new Images("flower.gif",57234,100,50,"medium");
	}
}
