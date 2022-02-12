package EX6_4;

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
}
