package BT9_14;

public class Confluence extends ARiver{
	private ARiver left;
	private ARiver right;
	public Confluence(Location location, double length, ARiver left, ARiver right) {
		super(location, length);
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Confluence left: \t " + this.left.location.toString() + ", \t have length: "
				+this.left.length+"km \n \n " + this.left.toString()
				
				+"Confluence right: \t" + this.right.location.toString() + ", \t have length: "
				+this.right.length+"km \n \n" + this.right.toString();
	} 
	
	@Override
	public int howManySource() {
		// TODO Auto-generated method stub
		return this.right.howManySource() + this.left.howManySource();
	}
	
	@Override
	public boolean ditermineLocation(Location that) {
		// TODO Auto-generated method stub
		return this.left.ditermineLocation(that) || this.right.ditermineLocation(that);
	}
	
	@Override
	public double howManyMiles() {
		// TODO Auto-generated method stub
		return this.length + this.right.howManyMiles() + this.left.howManyMiles();
	}
	
	@Override
	public boolean withinAGivenRadius(double radius) {
		// TODO Auto-generated method stub
		return this.length<=radius && this.left.length <= radius && this.right.length <= radius;
	}
	
	@Override
	public double maxlength() {
		// TODO Auto-generated method stub
		return Math.max(this.length, Math.max(this.left.maxlength(),this.right.maxlength()));
	}
	
	@Override
	public int howManyConsfluance() {
		// TODO Auto-generated method stub
		return 1 + this.left.howManyConsfluance()+this.right.howManyConsfluance() ;
	}

	
}
