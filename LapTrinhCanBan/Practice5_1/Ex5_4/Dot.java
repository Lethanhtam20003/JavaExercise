package Ex5_4;

public class Dot extends ASingleShape{

	public Dot(CartPT location) {
		super(location);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Dot: "+" \n " +  super.toString() + " \n";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !( obj instanceof Dot)) {
			return false;
		} else { 
			Dot that = ( Dot) obj;
			return true;
		}
		
	}
}
