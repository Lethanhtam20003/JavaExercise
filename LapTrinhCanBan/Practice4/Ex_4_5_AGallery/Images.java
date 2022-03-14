/**
 * 
 */
package Ex_4_5_AGallery;

/**
 * @author lethanhtam
 *
 */
public class Images extends AAGallery {
	private int hight;
	private int widght;
	private String quality;
	/**
	 * Testing Constructor
	 * @param hight
	 * @param widght
	 * @param quality
	 */
	public Images(String name,int size, int hight, int widght, String quality) {
		this.name = name;
		this.size = size;
		this.hight = hight;
		this.widght = widght;
		this.quality = quality;
	}
}
