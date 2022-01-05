package Ex5_3;

public interface Inventory {
	public boolean contains(String nameOfInventory);
	public boolean isBelow( double threshoud);
	public int howmany();
	public Inventory raisePrice(double raice);
}
