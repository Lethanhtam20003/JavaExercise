/**
 * 
 */
package Ex8_4;


/**
 * @author lethanhtam
 *
 */
public abstract class ABook {
	protected String title;
	protected String author;
	protected  double price;
	protected  int publicionYear;
	@Override
	public abstract String toString();

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ABook)) {
			return false;
		}else {
			ABook that = (ABook)obj;
		return this.getTitle().equals(that.getTitle())
				&& this.getAuthor().equals(that.getAuthor())
				&& this.getPrice() == that.getPrice()
				&& this.getPublicionYear() == that.getPublicionYear();
		}
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getPublicionYear() {
		return publicionYear;
	}
	/**
	 * Testing Constructor
	  ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
	  ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
	  ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
	 * @param title
	 * @param author
	 * @param price
	 * @param publicionYear
	 */
	public ABook(String title, String author, double price, int publicionYear) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicionYear = publicionYear;
	}
	/**
	 * Testing salePrice()
	  ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
	  ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
	  ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
	  (b1.salePrice(), 25000.0);
	  (b2.salePrice(), 80000.0);
	  (b3.salePrice(), 120000.0);
	 * @return
	 */
	public abstract double salePrice();
	/**
	 * Testing CheaperThan()
	  ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
	  ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
	  ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
	  (b1.CheaperThen(b2), true);
	  (b3.CheaperThen(b2), false);
	 * @param that
	 * @return
	 */
	public boolean CheaperThen(ABook that) {
		return this.salePrice() < that.salePrice();
	}
	/**
	 * 
	  ABook b1 = new Sale("so do", "vu trong phung", 50000, 1998);
	  ABook b2 = new HardCover("chi pheo", "nam cao", 100000, 1980);
	  ABook b3 = new PaperBack("nguoi lai do song da", "nguyen tuan", 120000, 1960);
	  (b1.sameAthor(b1), true);
	  (b2.sameAthor(b3), false);
	 * @param that
	 * @return
	 */
	public boolean sameAthor(ABook that) {
		return this.author.equals(that.author);
	}

	public boolean sameAuthor(String authorName) {
		// TODO Auto-generated method stub
		return this.author.equals(authorName);
	}

	protected  boolean softByOrther(ABook b) {
		return this.price <= b.price;
	}
}
