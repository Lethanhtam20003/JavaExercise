package BT9_12;
 
public class MTItems implements IItems {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof  MTItems)) {
		return false;
		}else {
			return true;
		}
	}

	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double highestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String brandList() {
		// TODO Auto-generated method stub
		return "";
	}

	

	

}
