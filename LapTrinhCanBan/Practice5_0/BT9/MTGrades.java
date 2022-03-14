package BT9;

public class MTGrades implements IGrades {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int howManyCredits() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int howManyCourse() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double gradeAverage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sumGrade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IGrades sortByGradeDec() {
		// TODO Auto-generated method stub
		return new MTGrades();
	}

	@Override
	public IGrades insertInGradeOrder(GradeRecord g) {
		// TODO Auto-generated method stub
		return new ConsGrades(g, new MTGrades());
	}

	@Override
	public IGrades greaterThanList(double grades) {
		// TODO Auto-generated method stub
		return new MTGrades();
	}

	@Override
	public IGrades insertInGradeOrder2(GradeRecord g, double number) {
		// TODO Auto-generated method stub
		return new ConsGrades(g, new MTGrades()); 
	}
}
