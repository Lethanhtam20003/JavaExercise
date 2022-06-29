package Album;

public class ConsMusicItem implements IMusicItem {
	private MusicItem first;
	private IMusicItem rest;

	public ConsMusicItem(MusicItem first, IMusicItem rest) {
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + "\n\r" + this.rest.toString();
	}

	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return this.rest.howMany() + 1;
	}

	@Override
	public int totalTiem() {
		// TODO Auto-generated method stub
		return this.rest.totalTiem() + this.first.totalTime();
	}

	@Override
	public IMusicItem thisAuthor(String author) {
		// TODO Auto-generated method stub
		if (this.first.checkAuthor(author)) {
			return new ConsMusicItem(first, rest.thisAuthor(author));
		}
		return this.rest.thisAuthor(author);
	}

	@Override
	public IMusicItem softByTime() {
		// TODO Auto-generated method stub
		return this.rest.softByTime().insertMusicItemOrther(this.first);
	}

	@Override
	public IMusicItem insertMusicItemOrther(MusicItem that) {
		// TODO Auto-generated method stub
		if (that.hasTimeThan(this.first)) {
			return new ConsMusicItem(that, this);
		}
		return new ConsMusicItem(this.first, this.rest.insertMusicItemOrther(that));
	}

}
