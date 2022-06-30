package ProductManagement;

public class Costumers {
	private String name;
	private String email;
	private listItems listItems;

	public Costumers(String name, String email, ProductManagement.listItems listItems) {
		super();
		this.name = name;
		this.email = email;
		this.listItems = listItems;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.email + "\r\n" + this.listItems.toString();
	}

	public double fineTotal() {
		return this.listItems.fineTotal();
	}
}
