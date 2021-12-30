package Ex_4_2_CreatesAGallery;

public class Text extends ACreatesAGallery {
	private int lines;
	/**
	 * ICreatesAGallery c1 = new Text("Welcome.txt",5312,830);
	 * @param name
	 * @param size
	 * @param lines
	 */
	public Text(String name, int size, int lines) {
		super(name, size);
		this.lines = lines;
	}
	
}
