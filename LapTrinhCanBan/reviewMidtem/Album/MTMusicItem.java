package Album;

public class MTMusicItem implements IMusicItem {
	public MTMusicItem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalTiem() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IMusicItem thisAuthor(String author) {
		// TODO Auto-generated method stub
		return new MTMusicItem();
	}

	@Override
	public IMusicItem softByTime() {
		// TODO Auto-generated method stub
		return new MTMusicItem();
	}

	@Override
	public IMusicItem insertMusicItemOrther(MusicItem first) {
		// TODO Auto-generated method stub
		return new ConsMusicItem(first, new MTMusicItem());
	}

}
