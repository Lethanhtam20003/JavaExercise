package BT3;

import junit.framework.TestCase;

public class IGradesTest extends TestCase {
	public void testConstructor() {
		
	//Testing for constructor Course
	  Course c1 = new Course(211, "Database Fundamentals", 3);
	  Course c2 = new Course(220,"Basic Programming",2);
	  Course c3 = new Course(690,"Algorithms",4);
	  Course c4 = new Course(721,"Data Structure",4);
	  
	  //Testing for Constructor of GrageRecord
	  GradeRecord g1 = new GradeRecord(c1,7.5);
	  GradeRecord g2 = new GradeRecord(c2,5.0);
	  GradeRecord g3 = new GradeRecord(c3,7.0);
	  GradeRecord g4 = new GradeRecord(c4,8.0);
	  
	  //Testing for Constructor ConsGrades
	  IGrades i1 = new ConsGrades(g1, new ConsGrades(g2, new ConsGrades(g3,new ConsGrades(g4, new MTGrades()))));
	  //Testing for constructor ScoreBourd
	  ScoreBourd s=new ScoreBourd(" le thanh tam","DH21",i1); 
	  System.out.println(s);
	}
}
