package Album;


public class Album {
	private String title;
	private int publicYear;
	private IMusicItem musicItem;
	private String singer;
	
	public Album(String title, int publicYear, IMusicItem musicItem, String singer) {
		this.title = title;
		this.publicYear = publicYear;
		this.musicItem = musicItem;
		this.singer=singer;
	}
	public int howMany() {
		return this.musicItem.howMany();
	}
	public int totalTime() {
//		return new clockTime( this.musicItem.totalTiem()/60 ,this.musicItem.totalTiem()%60);
		return this.musicItem.totalTiem();
	}
}
