package BT9;

public class MTLoGrade implements ILoGrade {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof MTLoGrade)) {
			return false;
		} else {
			MTLoGrade that = (MTLoGrade) obj;
			return true;
		}
	}

	@Override
	public int howManyCredits() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double GradeAverage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sumGrade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int howManyCourse() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ILoGrade softByGrade() {
		// TODO Auto-generated method stub
		return new MTLoGrade();
	}

	@Override
	public ILoGrade insertInGradeRecordOfther(GradeRecord_subclass that) {
		// TODO Auto-generated method stub
		return new ConsLoGrade(that, new MTLoGrade());
	}
}
