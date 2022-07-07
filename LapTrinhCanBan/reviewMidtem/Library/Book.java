package Library;

public class Book extends library {
	private String category;
	private String author;
	private int publicYear;

	public Book(int catID, String title, String publisher, int dueDay, String category, String author, int publicYear) {
		super(catID, title, publisher, dueDay);
		this.category = category;
		this.author = author;
		this.publicYear = publicYear;
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
		return (this.overDueDays(rentDays) * 4000 > 50000) ? 50000 : this.overDueDays(rentDays) * 4000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.catID + ", " + this.title + ", " + this.publisher + ", " + this.dueDay + ", " + this.category + ", "
				+ this.author + ", " + this.publicYear;
	}

}
