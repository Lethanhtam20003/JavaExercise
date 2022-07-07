package Library;

public abstract class library {
	protected int catID;
	protected String title;
	protected String publisher;
	protected int dueDay;

	public library(int catID, String title, String publisher, int dueDay) {
		this.catID = catID;
		this.title = title;
		this.publisher = publisher;
		this.dueDay = dueDay;
	}

	@Override
	public abstract String toString();

	public abstract boolean smallerThan(library that);

	public abstract int overDueDays(int rentDays);

	public abstract int fine(int rentDays);
}
