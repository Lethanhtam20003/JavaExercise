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
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof House)) {
			return false;
		}else {
			House that = (House) obj;
			return this.kind == that.kind 
					&& this.numberOfRoom == that.numberOfRoom 
					&& this.price == that.numberOfRoom 
					&& this.addrest.equals(that.addrest);
		}
	}
	
}
