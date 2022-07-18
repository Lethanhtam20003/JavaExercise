package ItemPackage;

public class Specificion {
	private int length;
	private int width;
	private int height;
	public Specificion(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public double volumn() {
		// TODO Auto-generated method stub
		return length*width*height;
	}
	

}
