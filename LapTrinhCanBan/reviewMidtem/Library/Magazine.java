package Library;

public class Magazine extends library {
	private int no;

	public Magazine(int catID, String title, String publisher, int dueDay, int no) {
		super(catID, title, publisher, dueDay);
		this.no = no;
	}

	@Override
	public boolean smallerThan(library that) {
		// TODO Auto-generated method stub
		return this.catID<that.catID;
	}

	@Override
	public int overDueDays(int rentDays) {
		// TODO Auto-generated method stub
		return (this.dueDay<rentDays)?rentDays - this.dueDay:0;
	}

	@Override
	public int fine(int rentDays) {
		// TODO Auto-generated method stub
		return this.overDueDays(rentDays)*1000;
	}

}
