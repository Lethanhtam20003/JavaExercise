package BT6;


public class MTDirectory implements IDirectory {

	@Override
	public String toString() {
		return "";
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTDirectory))
			return false;
		return true;
	}
	@Override
	public IDirectory phoneNumber(int number) {
		// TODO Auto-generated method stub
		return new MTDirectory();
	}

	@Override
	public IDirectory whoseNumber(String name) {
		// TODO Auto-generated method stub
		return new MTDirectory();
	}

	
	
}
