package BT9;

public interface IGrades {
	   public int howManyCredits();
	   public int howManyCourse();
	   public double sumGrade();
	   public double gradeAverage();
	   
	   public IGrades sortByGradeDec();
	   public IGrades insertInGradeOrder(GradeRecord g);
	   
	   public IGrades greaterThanList(double grades);
	   public IGrades insertInGradeOrder2(GradeRecord g , double number);
}
