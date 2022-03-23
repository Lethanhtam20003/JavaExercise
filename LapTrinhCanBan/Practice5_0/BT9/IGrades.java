package BT9;

public interface IGrades {
	   public int howManyCredits();
	   public int howManyCourse();
	   public double sumGrade();
	   public double gradeAverage();
	   
	   public IGrades softByGradeDec();
	   public IGrades insertInGradeOrther(GradeRecord g);
	   
}
