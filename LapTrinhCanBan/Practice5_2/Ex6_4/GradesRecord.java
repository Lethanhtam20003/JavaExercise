package Ex6_4;


public class GradesRecord {
	private Course course;
	private double grade;
	public GradesRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.course.toString() +": " + this.grade+"ð";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof GradesRecord)) {
			return false;
		}else {
			GradesRecord that = (GradesRecord)obj;
			return this.course.equals(that.course)
					&& this.grade==that.grade;
		}
	}
}
