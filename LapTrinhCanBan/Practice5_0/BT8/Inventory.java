package BT8;
 
public interface Inventory {
	public boolean contains(String nameOfInventory);
	
	public boolean isBelow( double threshoud);
	
	public int howmany();
	
	public Inventory raisePrice(double raice);
	
	public void raisePriceMutable(double rate);
	
	public double averagePrice();
	
	public double sumPrice();
	
	public Inventory replaceName(String that);
	
	public Inventory eliminate(String ToyOfName);

}

