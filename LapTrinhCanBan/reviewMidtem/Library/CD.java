package Library;

public class CD extends library {
	private String artist;

	public CD(int catID, String title, String publisher, int dueDay, String artist) {
		super(catID, title, publisher, dueDay);
		this.artist = artist;
	}

	@Override
	public boolean smallerThan(library that) {
		// TODO Auto-generated method stub
		return this.catID < that.catID;
	}

	@Override
	public int overDueDays(int rentDays) {
		// TODO Auto-generated method stub
		return (this.dueDay < rentDays) ? rentDays - this.dueDay : 0;
	}

	@Override
	public int fine(int rentDays) {
		// TODO Auto-generated method stub
		return (this.overDueDays(rentDays)*2000>10000)?10000:this.overDueDays(rentDays)*2000;
	}

}
