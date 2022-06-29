package Album;

public class clockTime {
	private int minute;
	private int second;

	public clockTime(int minute, int second) {
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.minute + ":" + this.second;
	}

	public boolean longerThan(MusicItem that) {
		// TODO Auto-generated method stub
		if (minute > that.getFile().getDuration().minute) {
			return true;
		} else if (minute == that.getFile().getDuration().minute) {
			return (second > that.getFile().getDuration().second);
		}
		return false;
	}

	public int totalTime() {
		// TODO Auto-generated method stub
		return this.minute * 60 + second;
	}

	

}
