package ProductManagement;

public class HandTool extends ProductItems {
	private String category;

	

	public HandTool(String pid, String name, Producer producer, String nation, double weight, double price,
			String category) {
		super(pid, name, producer, nation, weight, price);
		this.category = category;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pid + ", " + this.name + ", " + this.producer.toString() + ", " + this.weight + "kg, " + this.price
				+ "VND, " + this.nation+", "+this.category;
	}
	@Override
	public double promotionFree() {
		// TODO Auto-generated method stub
		return this.price*0.75;
	}

	@Override
	public boolean checkHandToolsAndGenerator() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
