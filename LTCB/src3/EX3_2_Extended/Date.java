package EX3_2_Extended;

public class Date {
	private int day;
	private int month;
	private int year;
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * currentAuthor that determines whether a book was written by a current author
	 * (born after 2000);
	 *Date d1 = Date(12,12,1450);
	 *Date d2 = new Date(1,1,2001);
	 *Author a1 = new Author("nguyen du",d1);
	 *Author a2 = new Author("phan boi chau",d2);
	 *Book ex1 = new Book("truyen kieu", 1521,a1);
	 *Book ex2 = new Book("tau khong nguoi", 1987, a2);
	 *assertEquals(ex1.currentAuthor(), false);
	 *assertEquals(ex2.currentAuthor(), true);
	 * @return
	 */
	public boolean currentAuthor() {
		return this.year < 2000;
	}
	public boolean  sameGeneration(Date that) {
		return Math.abs(this.year - that.year) < 10;
	}
}
