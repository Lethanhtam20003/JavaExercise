package ProductManagement;

public class BuyItems {
	private ProductItems Items;
	private int quantity;

	public BuyItems(ProductItems items, int quantity) {
		Items = items;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Item=(" + this.Items.toString() + "), " + this.quantity;
	}

	public double fineTotal() {
		// TODO Auto-generated method stub
		return this.Items.getPrice() * quantity;
	}

}
