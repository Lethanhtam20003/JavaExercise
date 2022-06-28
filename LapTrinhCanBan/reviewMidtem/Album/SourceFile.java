package Album;

public class SourceFile {
	private String fileName;
	private int size;
	private clockTime duration;
	private int hitCounts;
	public SourceFile(String fileName, int size, clockTime duration, int hitCounts) {
		super();
		this.fileName = fileName;
		this.size = size;
		this.duration = duration;
		this.hitCounts = hitCounts;
	}
	public boolean moreFavoriteThan(MusicItem that) {
		// TODO Auto-generated method stub
		return this.hitCounts>that.getFile().hitCounts;
	}
	public boolean longerThan(MusicItem that) {
		// TODO Auto-generated method stub
		return this.duration.longerThan(that);
	}
	/**
	 * @return the duration
	 */
	public clockTime getDuration() {
		return duration;
	}
	public String favoriteRate() {
		// TODO Auto-generated method stub
		if(this.hitCounts>40000)return "Hot";
		if(this.hitCounts>2000 && this.hitCounts<40000)return "Phổ Biến";
		return "";
	}
	public int totalTime() {
		// TODO Auto-generated method stub
		return this.duration.totalTime();
	}
	
}
