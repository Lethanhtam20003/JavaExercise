package ProductManagement;

public abstract class ProductItems {
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	protected String pid;
	protected String name;
	protected Producer producer;
	protected String nation;
	protected double weight;
	protected double price;

	public ProductItems(String pid, String name, Producer producer, String nation, double weight, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.producer = producer;
		this.nation = nation;
		this.weight = weight;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	public boolean isProducer(String that) {
		return this.producer.getNameProducer().equals(that);
	}

	public abstract double promotionFree();

	public abstract boolean checkHandToolsAndGenerator();

	protected boolean checkNation(String nation) {
		return this.nation.equals(nation);
	}

	protected boolean checkNameThan(ProductItems that) {
		return this.producer.checkNameThan(that);
	}

}
