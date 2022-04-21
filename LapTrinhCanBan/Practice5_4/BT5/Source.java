package BT5;

 
public class Source extends ARiver {

	public Source(Location location, double length) {
		super(location, length);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Source: " + this.location.toString()+", \t  have length: "+this.length+"km \n " ;
	}

	@Override
	public int howManySource() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean ditermineLocation(Location that) {
		// TODO Auto-generated method stub
		return this.location.equals(that);
	}

	@Override
	public double howManyMiles() {
		// TODO Auto-generated method stub
		return this.length;
	}

	@Override
	public boolean withinAGivenRadius(double radius) {
		// TODO Auto-generated method stub
		return this.length <= radius;
	}

	@Override
	public double maxlength() {
		// TODO Auto-generated method stub
		return this.length;
	}

	@Override
	public int howManyConsfluance() {
		// TODO Auto-generated method stub
		return 0;
	}


}
