package BT1;

public class ConsHouse implements AssistsRealEstateAgents {
	private House first;
	private AssistsRealEstateAgents rest;
	/*
	 *  Testing for Constructor of ConsHouse
	 *  ConsHouse c1 = new ConsHouse(h1,new ConsHouse(h2, new ConsHouse(h3, new MTHouse());
	 */
	public ConsHouse(House first, AssistsRealEstateAgents rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Assists Real Estate Agents:  " + this.first + "\n"+"\n"+this.rest;
	}
}
