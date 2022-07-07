package ProductManagement;

public class Producer {
	private String nameProducer;

	private int birthYear;

	public Producer(String name, int birthYear) {
		this.nameProducer = name;
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nameProducer;
	}

	/**
	 * @return the nameProducer
	 */
	public String getNameProducer() {
		return nameProducer;
	}

	public boolean checkNameThan(ProductItems that) {
		// TODO Auto-generated method stub
		return this.nameProducer.compareTo(that.producer.nameProducer)>0;
		//this.nameProducer.indexOf(0) > that.producer.nameProducer.indexOf(0)
	}

}
