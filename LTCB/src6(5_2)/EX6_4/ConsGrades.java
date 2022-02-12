package EX6_4;

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
	
}
