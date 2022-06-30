package ProductManagement;

public class ConsItems implements listItems {
	private BuyItems firstItems;
	private listItems restItems;

	public ConsItems(BuyItems firstItems, listItems restItems) {
		super();
		this.firstItems = firstItems;
		this.restItems = restItems;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.firstItems.toString() + "\r\n" + this.restItems.toString();
	}

	@Override
	public double fineTotal() {
		// TODO Auto-generated method stub
		return this.firstItems.fineTotal() + this.restItems.fineTotal();
	}

}
