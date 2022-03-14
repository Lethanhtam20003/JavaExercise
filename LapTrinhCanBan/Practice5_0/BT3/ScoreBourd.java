package BT3;


public class ScoreBourd implements IGrades {
	private String name;
	private String lop;
	private IGrades grades;

	/*
	 * Testing for constructor ScoreBourd new ScoreBourd(" le thanh tam","DH21",i1);
	 */
	public ScoreBourd(String name, String lop, IGrades grades) {
		super();
		this.name = name;
		this.lop = lop;
		this.grades = grades;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student's Name " + this.name + " grades: " + this.lop + "\n" + this.grades;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ScoreBourd)) {
			return false;
		} else {
			ScoreBourd that = (ScoreBourd) obj;
			return this.name == that.name && this.lop == that.lop && this.grades.equals(that.grades);
		}
	}
}
