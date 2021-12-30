package Ex_4_2_CreatesAGallery;

public abstract class ACreatesAGallery implements ICreatesGallery {
	private String name;
	private int size;
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param size
	 */
	public ACreatesAGallery(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	
}
