package ProductManagement;

public class ConsProduct implements listProduct {
	private ProductItems first;
	private listProduct rest;

	public ConsProduct(ProductItems first, listProduct rest) {
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString()+"\r\n"+this.rest.toString();
	}

	@Override
	public int howManyHandToolsAndGenerator() {
		// TODO Auto-generated method stub
		return (this.first.checkHandToolsAndGenerator()) ? +1 : this.rest.howManyHandToolsAndGenerator();
	}

	@Override
	public listProduct getItemmOfNation(String nation) {
		// TODO Auto-generated method stub
		if (this.first.checkNation(nation)) {

			return new ConsProduct(first, rest.getItemmOfNation(nation));
		}
		return this.rest.getItemmOfNation(nation);
	}

	@Override
	public listProduct softByProducer() {
		// TODO Auto-generated method stub
		return this.rest.softByProducer().insertByProducerOther(this.first);
	}

	@Override
	public listProduct insertByProducerOther(ProductItems that) {
		// TODO Auto-generated method stub
		if (this.first.checkNameThan(that)) {
			return new ConsProduct(that, this);
		}
		return new ConsProduct(this.first, this.rest.insertByProducerOther(that));
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.first.getName() + "," + this.rest.getName();
	}

	@Override
	public double fineTotal() {
		// TODO Auto-generated method stub
		return this.first.price + this.rest.fineTotal();
	}

}
