package Album;

public class MusicItem{
	private Song song;
	private SourceFile file;
	private String singer;
	public MusicItem(Song song, SourceFile file, String singer) {
		this.song = song;
		this.file = file;
		this.singer = singer;
	}
	public boolean moreFavoriteThan(MusicItem that) {
		return this.file.moreFavoriteThan(that);
		
	}
	public boolean longerThan(MusicItem that) {
		return file.longerThan(that);
	}
	/**
	 * @return the file
	 */
	public SourceFile getFile() {
		return file;
	}
	public String favouriteRate() {
		return this.file.favoriteRate();
	}
	public int totalTime() {
		// TODO Auto-generated method stub
		return this.file.totalTime();
	}

	
}
