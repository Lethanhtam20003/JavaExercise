package EX6_2;

public class ConsBook implements IBook {
	private ABook first;
	private IBook rest;
	/*
	 * Testing for the Constructor of ConsBook 
	 * IBook i1 = new ConsBook(b1, new ConsBook(b2,new ConsBook(b3, new MTBook())));
	 */
	public ConsBook(ABook first, IBook rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
}
