package EX6_3;

public class Confluence extends ARiver{
	private ARiver left;
	private ARiver right;
	/*
	 * Testing for constructor of Confluence
	 * Confluence c1 = new Confluence(l1,322,r1,null);
	 * Confluence c2 = new Confluence(l2,1212,r2,r3);
	 * Confluence c3 = new Confluence(l3,342,null,null);
	 */
	public Confluence(Location location, double length, ARiver left, ARiver right) {
		super(location, length);
		this.left = left;
		this.right = right;
	}
}
