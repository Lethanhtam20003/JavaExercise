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
	public IGrades softByGradeDec() {
		// TODO Auto-generated method stub
		return new MTGrades();
	}

	@Override
	public IGrades insertInGradeOrther(GradeRecord g) {
		// TODO Auto-generated method stub
		return new ConsGrades(g, new MTGrades());
	}

	
}
