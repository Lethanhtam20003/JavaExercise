package Ex5_1;

public class MTLog implements ILog {

	@Override
	public String toString() {
		return " empty ";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLog)) {
			return false;
		}else {
			return true;
		}
	}
	
}
