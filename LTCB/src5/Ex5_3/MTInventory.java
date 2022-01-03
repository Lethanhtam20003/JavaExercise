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
}
