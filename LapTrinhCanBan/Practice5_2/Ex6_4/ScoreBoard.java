package Ex6_4;


public class ScoreBoard {
	private String name;
	private String Department;
	private IGrades grades;
	
	public ScoreBoard(String name, String department, IGrades grades) {
		super();
		this.name = name;
		Department = department;
		this.grades = grades;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student: " + this.name + " - "+ this.Department+"\n"+this.grades;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ScoreBoard)) {
			return false;
		}else {
			ScoreBoard that = (ScoreBoard)obj;
			return this.name.equals(that.name)
					&& this.Department.equals(that.Department)
					&& this.grades.equals(that.grades);
		}
	}
}
