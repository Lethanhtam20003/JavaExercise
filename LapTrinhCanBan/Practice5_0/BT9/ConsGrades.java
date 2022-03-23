package BT9;

public class ConsGrades implements IGrades {
	private GradeRecord first;
	private IGrades rest;

	/**
	 *         Constructor
	 * Testing for Constructor ConsGrades IGrades i1 = new ConsGrades(g1, new
	 * ConsGrades(g2, new ConsGrades( g3, new MTGrades())));
	 */
	public ConsGrades(GradeRecord first, IGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Method ToString 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + "\n" + this.rest.toString();
	}
	/**
	 *  Method Equals
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ConsGrades)) {
			return false;
		} else {
			ConsGrades that = (ConsGrades) obj;
			return this.first.equals(that.first) 
					&& this.rest.equals(that.rest);
		}
	}

	/**
	 * Viết phương thức howManyCredits để tính tổng số tín chỉ trong bảng điểm mà
	 * sinh viên đã đạt được.
	 */
	@Override
	public int howManyCredits() {
		// TODO Auto-generated method stub
		return this.first.getCridit() + this.rest.howManyCredits();
	}

	/**
	 * subMethod of the gradeAverage()
	 */
	@Override
	public int howManyCourse() {
		// TODO Auto-generated method stub
		return 1 + this.rest.howManyCourse();
	}

	/**
	 * subMethod of the gradeAverage()
	 */
	@Override
	public double sumGrade() {
		// TODO Auto-generated method stub
		return this.first.getGrade() + this.rest.sumGrade();
	}

	/**
	 * Viết phương thức gradeAverage để tính điểm trung bình của sinh viên bằng tổng
	 * của tích điểm số từng môn với số tín chỉ chia cho tổng số tín chỉ.
	 */
	@Override
	public double gradeAverage() {
		// TODO Auto-generated method stub
		return this.sumGrade() / this.howManyCourse();
	}

	/**
	 * Viết phương thức sortByGradeDec để sắp xếp bảng điểm số của sinh viên theo
	 * thứ tự điểm giảm dần.
	 */
	@Override
	public IGrades softByGradeDec() {
		// TODO Auto-generated method stub
		return this.rest.softByGradeDec().insertInGradeOrther(this.first);
	}
	/**
	 * subMothod of softByGradeDec
	 */
	@Override
	public IGrades insertInGradeOrther(GradeRecord g) {
		// TODO Auto-generated method stub
		if(g.hasGradesmall(this.first)) {
			return new ConsGrades(g, this);
		}
		return new ConsGrades(this.first,this.rest.insertInGradeOrther(g));
	}

	
}
