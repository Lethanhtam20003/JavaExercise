package BT9;

public class GradeRecord_subclass {
	private Course_subclass course;
	private double grade;
	public GradeRecord_subclass(Course_subclass course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.course.toString() + this.grade;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof MTLoGrade)) {
			return true;
		}else {
			GradeRecord_subclass that = (GradeRecord_subclass)obj;
		return this.course.equals(that.course)
				&& this.grade == that.grade;
		}
	}
	
	public double getGrade() {
		return grade;
	}
	public int getCredits() {
		return this.course.getCredits();
	}
	public boolean hasGradeThan(GradeRecord_subclass that) {
		// TODO Auto-generated method stub
		return this.grade >= that.grade;
	}
}
