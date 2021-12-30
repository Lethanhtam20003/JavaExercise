/**
 * 
 */
package Ex_4_5_AGallery;

/**
 * @author lethanhtam
 *
 */
public class MP3 extends AAGallery {
	private int timePlaying;// second
	
	/**
	 * Testing Constructor
	 * @param timePlaying
	 */
	public MP3(String name,int size,int timePlaying) {
		this.name = name;
		this.size = size;
		this.timePlaying = timePlaying;
	}	
}
