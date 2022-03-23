package BT9;


public class GradeRecord {
	private Course course;
	private double grade; // diem so
	/*
	 * Testing for Constructor of GrageRecord
	 * GrageRecord g1 = new GrageRecord(c1,7);
	 * GrageRecord g2 = new GrageRecord(c2,6);
	 * GrageRecord g1 = new GrageRecord(c3,8); 
	 */
	public GradeRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.course.toString() +  " \t\t - Grade: " +this.grade;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof GradeRecord)) {
			return false;
		}else {
			GradeRecord that = (GradeRecord)obj;
			return this.course.equals(that.course) 
					&& this.grade==that.grade;
		}
	}
	public int getCridit() {
		return this.course.getCridit();
	}
	public double getGrade() {
		return this.grade;
	}
	public boolean hasGradesmall(GradeRecord that) {
		// TODO Auto-generated method stub
		return this.grade >= that.grade;
	}
	

}
