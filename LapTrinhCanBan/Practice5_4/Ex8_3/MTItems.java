package Ex8_3;

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
	public IItems highestPrice() {
		// TODO Auto-generated method stub
		return new MTItems();
	}

	@Override
	public IItems createSoftItems(AItems n) {
		// TODO Auto-generated method stub
		return new ConsItems(n, new MTItems());
	}
}
