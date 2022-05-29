package BT3_log;
 
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
	public double totalDistanceInMonth(int month, int year) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double maximumDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ILog softBySpeed() {
		// TODO Auto-generated method stub
		return new MTLog();
	}
	@Override
	public ILog insertILogorther(Entry that) {
		// TODO Auto-generated method stub
		return new ConsLog(that, new MTLog());
	}
	
	
}
