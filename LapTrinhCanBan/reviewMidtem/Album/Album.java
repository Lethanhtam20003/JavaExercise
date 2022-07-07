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
		this.singer = singer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (this.publicYear != 0) {

			return "Album of singer \"" + this.title + "\", " + this.publicYear + "  của " + this.singer
					+ " gồm các bản nhạc \r \n" + this.musicItem.toString();
		}
		return "Album Tổng Hợp:\"" + this.title + "\", bao gồm các bài: \r\n" + this.musicItem.toString() + "";
	}

	public int howMany() {
		return this.musicItem.howMany();
	}

	public int totalTime() {
//		return new clockTime( this.musicItem.totalTiem()/60 ,this.musicItem.totalTiem()%60);
		return this.musicItem.totalTiem();
	}

	public Album thisAuthor(String author) {
		return new Album("của " + author, 0, musicItem.thisAuthor(author), null);
	}

	public Album softByTime() {
		return new Album(title, publicYear, musicItem.softByTime(), singer);
	}
}
