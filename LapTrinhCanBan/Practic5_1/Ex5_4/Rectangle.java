package Ex5_4;

public class Rectangle extends ASingleShape{
	private int wight;
	private int hight;
	public Rectangle(CartPT location, int wight, int hight) {
		super(location);
		this.wight = wight;
		this.hight = hight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle:"+" \n" + " wight: " + this.wight + " hight: " + this.hight +" \n";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !( obj instanceof Rectangle)) {
			return false;
		} else { 
			Rectangle that = ( Rectangle) obj;
			return this.hight == that.hight && this.wight == that.wight;
		}
		
	}
}
