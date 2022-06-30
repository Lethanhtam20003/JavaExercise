package ProductManagement;

public interface listProduct  {
	public abstract int howManyHandToolsAndGenerator();
	public abstract listProduct getItemmOfNation(String nation);
	public abstract listProduct softByProducer();
	public abstract listProduct insertByProducerOther(ProductItems first);
	public abstract String getName();
	public abstract double fineTotal();
}
