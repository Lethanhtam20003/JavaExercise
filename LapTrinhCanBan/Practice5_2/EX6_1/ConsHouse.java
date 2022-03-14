package EX6_1;

public class ConsHouse implements IAssistsRealEstateAgents {
	private House first;
	private IAssistsRealEstateAgents rest;
	/*
	 *  Testing for Constructor of ConsHouse
	 *  ConsHouse c1 = new ConsHouse(h1,new ConsHouse(h2, new ConsHouse(h3, new MTHouse());
	 */
	public ConsHouse(House first, IAssistsRealEstateAgents rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
}
