package Ex_4_2_CreatesAGallery;

import Ex_4_5_AGallery.AAGallery;

public class Images extends ACreatesAGallery  {
	private int hight;
	private int widght;
	private String quality;
	/**
	 * ICreatesAGallery c3 = new Images("flower.gif",100,50,"medium");
	 * @param name
	 * @param size
	 * @param hight
	 * @param widght
	 * @param quality
	 */
	public Images(String name, int size, int hight, int widght, String quality) {
		super(name, size);
		this.hight = hight;
		this.widght = widght;
		this.quality = quality;
	}
	
}
