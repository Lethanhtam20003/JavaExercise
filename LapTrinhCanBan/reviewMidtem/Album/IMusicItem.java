package Album;

public interface IMusicItem {

	int howMany();

	int totalTiem();

	IMusicItem thisAuthor(String author);


	IMusicItem softByTime();

	IMusicItem insertMusicItemOrther(MusicItem first);


}
