package BT3;


public class ConsGrades implements IGrades {
	private GradeRecord first;
	private IGrades rest;
	/*
	 * Testing for Constructor ConsGrades
	 * IGrades i1 = new ConsGrades(g1, new ConsGrades(g2, new ConsGrades( g3, new MTGrades())));
	 */
	public ConsGrades(GradeRecord first, IGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() +"\n"+this.rest.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ConsGrades)) {
			return false;
		}else {
			ConsGrades that = (ConsGrades)obj;
			return this.first.equals(that.first)&& this.rest.equals(that.rest) ;
		}
	}
	
}
