package Ex5_5;

public class Circle extends ASingleShape{
	private int size;

	public Circle(CartPT location, int size) {
		super(location);
		this.size = size;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle: "+" \n " + super.toString() + " size: " + this.size + " \n";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !( obj instanceof Circle)) {
			return false;
		} else { 
			Circle that = ( Circle) obj;
			return this.size == that.size;
		}
		
	}
}
