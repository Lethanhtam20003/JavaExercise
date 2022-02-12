package EX6_4;

public class ScoreBourd implements IGrades{
	private String name;
	private String lop;
	private IGrades grades;
	/*
	 * Testing for constructor ScoreBourd
	 * new ScoreBourd(" le thanh tam","DH21",i1); 
	 */
	public ScoreBourd(String name, String lop, IGrades grades) {
		super();
		this.name = name;
		this.lop = lop;
		this.grades = grades;
	}
	
}
