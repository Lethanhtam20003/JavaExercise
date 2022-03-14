package BT9;


public class ConsGrades implements IGrades {
	private GradeRecord first;
	private IGrades rest;
	/*
	 * Testing for Constructor ConsGrades
	 * IGrades i1 = new ConsGrades(g1, new ConsGrades(g2, new ConsGrades( g3, new MTGrades())));
	 */
	public ConsGrades(GradeRecord first, IGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() +"\n"+this.rest.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ConsGrades)) {
			return false;
		}else {
			ConsGrades that = (ConsGrades)obj;
			return this.first.equals(that.first)&& this.rest.equals(that.rest) ;
		}
	}
	@Override
	public int howManyCredits() {
		// TODO Auto-generated method stub
		return this.first.getCridit() + this.rest.howManyCredits();
	}
	@Override
	public int howManyCourse() {
		// TODO Auto-generated method stub
		return 1 + this.rest.howManyCourse();
	}
	@Override
	public double sumGrade() {
		// TODO Auto-generated method stub
		return this.first.getGrade() + this.rest.sumGrade();
	}
	@Override
	public double gradeAverage() {
		// TODO Auto-generated method stub
		return this.sumGrade() / this.howManyCourse();
	}
	
	@Override
	public IGrades sortByGradeDec() {
		// TODO Auto-generated method stub
		return this.rest.sortByGradeDec().insertInGradeOrder(this.first);
	}
	@Override
	public IGrades insertInGradeOrder(GradeRecord g) {
		// TODO Auto-generated method stub
		if (g.hasGradesmall(this.first)) {
			return new ConsGrades(g, this);
			
		}else {
		return new ConsGrades(this.first, this.rest.insertInGradeOrder(g));
		}
	}
	@Override
	public IGrades greaterThanList(double grades) {
		// TODO Auto-generated method stub
		return this.rest.greaterThanList(grades).insertInGradeOrder2(this.first,grades);
	}
	@Override
	public IGrades insertInGradeOrder2(GradeRecord g , double number) {
		// TODO Auto-generated method stub
		if (g.gradesSmallNumber(number)) {
			return new ConsGrades(g, this);
			
		}else {
		return new ConsGrades(this.first, this.rest.insertInGradeOrder2(g,number));
		}
	}
	
}
