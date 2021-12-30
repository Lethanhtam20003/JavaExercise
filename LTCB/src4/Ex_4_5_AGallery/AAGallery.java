/**
 * 
 */
package Ex_4_5_AGallery;

/**
 * @author lethanhtam
 *
 */
public abstract class AAGallery   {
	protected String name;
	protected int size;	
	/**
	 * Testing timeToDownLoad(double networkSpeed)
	 AAGallery c1 = new Text("Welcome.txt",5312,830);
	 c1.timeToDownLoand(500), 10.6,0.01);
	 AAGallery c2 = new MP3("theme.mp3",40960,20);
	 c2.timeToDownLoand(500), 81.9,0.01);
	 AAGallery c3 = new Images("flower.gif",57234,100,50,"medium");
	 c3.timeToDownLoand(500), 114.4,0.01);
	 * @param networkSpeed
	 * @return
	 */
	public double timeToDownLoad(double networkSpeed) {
		return this.size / networkSpeed;
	}
	/**
	 * Testing smallSize(int maximumSize)
	 AAGallery c1 = new Text("Welcome.txt",5312,830);
	 AAGallery c2 = new MP3("theme.mp3",40960,20);
	 AAGallery c3 = new Images("flower.gif",57234,100,50,"medium");
	 * @param maximumSize
	 * @return
	 */
	public boolean smallThan(int maximumSize) {
		return this.size <= maximumSize;
	}
	/**
	 * Testing sameName(Sting givenName)
	 AAGallery c1 = new Text("Welcome.txt",5312,830);
	 AAGallery c2 = new MP3("theme.mp3",40960,20);
	 AAGallery c3 = new Images("flower.gif",57234,100,50,"medium");
	 * @param givenname
	 * @return
	 */
	public  boolean sameName(String givenName)
	{
		return this.name.equals(givenName);
	}
	

}
