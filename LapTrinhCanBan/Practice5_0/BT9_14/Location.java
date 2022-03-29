package BT9_14;
public class Location {
	private int x;
	private int y;
	private String name;
	public Location(int x, int y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}
	/**
	 * subMethod of ditermineLocation
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Location)) {			
			return false;
		}else {
			Location that = (Location)obj;
			return this.x == that.x && this.y == that.y && this.name.equals(that.name);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "location: "+this.name +"("+this.x + "," +this.y+")";
	}
	
	
}
