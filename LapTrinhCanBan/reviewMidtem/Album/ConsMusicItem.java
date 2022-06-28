package Album;

public class ConsMusicItem  implements IMusicItem{
	private MusicItem first;
	private IMusicItem rest;
	public ConsMusicItem(MusicItem first, IMusicItem rest) {
		this.first = first;
		this.rest = rest;
	}
	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return this.rest.howMany() +1;
	}
	@Override
	public int totalTiem() {
		// TODO Auto-generated method stub
		return this.rest.totalTiem()+this.first.totalTime();
	}
	
	

}
