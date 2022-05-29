package BT1_Inventory;

 
public interface Inventory {
	public boolean contains(String nameOfInventory);
	
	public boolean isBelow( double threshoud);
	
	public int howmany();
	
	public Inventory raisePrice(double raice);
	
	public void raisePrice_Mutable(double rate);

	public double sumPrice();//sub class of averagePrice
	
	public double averagePrice();
	
	
	public Inventory replaceName(String that);
	
	public Inventory eliminate(String ToyOfName);

}

