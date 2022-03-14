package Ex5_2;

public class MTRestaurant implements IRestaurant {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof MTRestaurant)) {
			return false;
		}
		return true;
	}
}
