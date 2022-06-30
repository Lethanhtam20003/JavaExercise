package ProductManagement;

public class MTProduct implements listProduct {
	public MTProduct() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int howManyHandToolsAndGenerator() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public listProduct getItemmOfNation(String nation) {
		// TODO Auto-generated method stub
		return new MTProduct();
	}

	@Override
	public listProduct softByProducer() {
		// TODO Auto-generated method stub
		return new MTProduct();
	}

	@Override
	public listProduct insertByProducerOther(ProductItems first) {
		// TODO Auto-generated method stub
		return new ConsProduct(first, new MTProduct());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public double fineTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
