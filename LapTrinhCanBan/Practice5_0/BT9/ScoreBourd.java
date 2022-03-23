package BT9;

public class ScoreBourd {
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
		return "student's Name: " + this.name + " ** grades: " + this.lop + "\n" + this.grades.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ScoreBourd)) {
			return false;
		} else {
			ScoreBourd that = (ScoreBourd) obj;
			return this.name == that.name 
					&& this.lop == that.lop 
					&& this.grades.equals(that.grades);
		}
	}

	/**
	 * Viết phương thức howManyCredits để tính tổng số tín chỉ trong bảng điểm mà
	 * sinh viên đã đạt được.
	 * 
	 * @return
	 */
	public int howManyCredits() {
		return this.grades.howManyCredits();
	}

	/**
	 * Viết phương thức gradeAverage để tính điểm trung bình của sinh viên bằng tổng
	 * của tích điểm số từng môn với số tín chỉ chia cho tổng số tín chỉ.
	 */
	public double gradeAverage() {
		return this.grades.gradeAverage();
	}
	/**
	 * Viết phương thức sortByGradeDec để sắp xếp bảng điểm số của sinh viên theo
	 * thứ tự điểm giảm dần.
	 */
	public ScoreBourd softByGradeDec() {
		return new ScoreBourd(this.name, this.lop, this.grades.softByGradeDec());
	}
}
