package Ex5_3;

public class MTInventory implements Inventory {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof MTInventory)) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public boolean contains(String nameOfInventory) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isBelow(double threshoud) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public int howmany() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Inventory raisePrice(double raice) {
		// TODO Auto-generated method stub
		return new MTInventory();
	}
}
