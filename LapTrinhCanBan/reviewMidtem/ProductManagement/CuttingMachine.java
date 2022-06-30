package ProductManagement;

public class CuttingMachine extends ProductItems {

	public CuttingMachine(String pid, String name, Producer producer, String nation, double weight, double price) {
		super(pid, name, producer, nation, weight, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pid + ", " + this.name + ", " + this.producer.toString() + ", " + this.weight + "kg, " + this.price
				+ "VND, " + this.nation;
	}

	@Override
	public double promotionFree() {
		// TODO Auto-generated method stub
		return this.price * 0.8;
	}

	@Override
	public boolean checkHandToolsAndGenerator() {
		// TODO Auto-generated method stub
		return false;
	}

}
