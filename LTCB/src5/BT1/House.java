package BT1;

public class House {
	private String kind;
	private int numberOfRoom;
	private double price;
	private AddRest addrest;

	public House(String kind,int numberOfRoom, double price, AddRest addrest) {
		super();
		this.kind = kind;
		this.numberOfRoom = numberOfRoom;
		this.price = price;
		this.addrest = addrest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kind:  " + this.kind +", Room: "+this.numberOfRoom+ ", Price:  " + this.price + "\n"+this.addrest.toString();
	}
}
