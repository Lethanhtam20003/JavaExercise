package Ex_4_2_CreatesAGallery;

public class MP3 extends ACreatesAGallery  {
	private int minutes;
	private int second;
	/**
	 * ICreatesAGallery c2 = new MP3("theme.mp3",40960,3,20);
	 * @param name
	 * @param size
	 * @param minutes
	 * @param second
	 */
	public MP3(String name, int size, int minutes, int second) {
		super(name, size);
		this.minutes = minutes;
		this.second = second;
	}

}
