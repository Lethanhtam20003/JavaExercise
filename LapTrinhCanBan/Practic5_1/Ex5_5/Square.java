package Ex5_5;

public class Square extends ASingleShape{
	private int radium;

	public Square(CartPT location, int radium) {
		super(location);
		this.radium = radium;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Square: " + " \n" +  super.toString() + " radium: " + this.radium + " \n";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !( obj instanceof Square)) {
			return false;
		} else { 
			Square that = ( Square) obj;
			return this.radium == that.radium;
		}
	}
}
