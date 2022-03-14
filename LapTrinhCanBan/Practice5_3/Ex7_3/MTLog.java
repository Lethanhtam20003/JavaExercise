package Ex7_3; 

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
	@Override
	public double miles() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ILog getLog(int mouth, int year) {
		// TODO Auto-generated method stub
		return new MTLog();
	}
	@Override
	public double totalDistance(int month, int year) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
