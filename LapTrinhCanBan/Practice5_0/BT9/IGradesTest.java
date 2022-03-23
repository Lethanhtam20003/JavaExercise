package BT9;

import junit.framework.TestCase;

public class IGradesTest extends TestCase {
	public void testConstructor() {
		
	//Testing for constructor Course
	  Course c1 = new Course(1112,"toan a1", 4);
	  Course c2 = new Course(1111,"ly ",3);
	  Course c3 = new Course(1113,"hoa",3);
	  //Testing for Constructor of GrageRecord
	  GradeRecord g1 = new GradeRecord(c1,7);
	  GradeRecord g2 = new GradeRecord(c2,6);
	  GradeRecord g3 = new GradeRecord(c3,8);
	  //Testing for Constructor ConsGrades
	  IGrades i1 = new ConsGrades(g1, new ConsGrades(g2, new ConsGrades(g3, new MTGrades())));
	  //Testing for constructor ScoreBourd
	  ScoreBourd s=new ScoreBourd(" le thanh tam","DH21",i1); 
	  System.out.println(s);
	}
	
	public void testhowmany() {
		
		//Testing for constructor Course
		  Course c1 = new Course(1112,"toan a1", 4);
		  Course c2 = new Course(1111,"ly ",3);
		  Course c3 = new Course(1113,"hoa",3);
		  //Testing for Constructor of GrageRecord
		  GradeRecord g1 = new GradeRecord(c1,7);
		  GradeRecord g2 = new GradeRecord(c2,6);
		  GradeRecord g3 = new GradeRecord(c3,8);
		  //Testing for Constructor ConsGrades
		  IGrades i1 = new ConsGrades(g1, new ConsGrades(g2, new ConsGrades(g3, new MTGrades())));
		  //Testing for constructor ScoreBourd
		  ScoreBourd s=new ScoreBourd(" le thanh tam","DH21",i1); 
		  
		  assertEquals(s.howManyCredits(), 10);
		  assertEquals(i1.howManyCourse(), 3);
		  assertEquals(s.gradeAverage()	, 7.0);
		}
		public void testGradeAverage() {
				
				//Testing for constructor Course
				  Course c1 = new Course(1112,"toan a1", 4);
				  Course c2 = new Course(1111,"ly ",3);
				  Course c3 = new Course(1113,"hoa",3);
				  //Testing for Constructor of GrageRecord
				  GradeRecord g1 = new GradeRecord(c1,7);
				  GradeRecord g2 = new GradeRecord(c2,6);
				  GradeRecord g3 = new GradeRecord(c3,8);
				  //Testing for Constructor ConsGrades
				  IGrades i1 = new ConsGrades(g1, new ConsGrades(g2, new ConsGrades(g3, new MTGrades())));
				  //Testing for constructor ScoreBourd
				  ScoreBourd s=new ScoreBourd(" le thanh tam","DH21",i1);
				  
				  assertEquals(i1.howManyCourse(), 3);
				  assertEquals(s.gradeAverage()	, 7.0);
		}
		
		public void testSoftByGradeDec() {
			//Testing for constructor Course
			  Course c1 = new Course(1112,"toan a1", 4);
			  Course c2 = new Course(1111,"ly ",3);
			  Course c3 = new Course(1113,"hoa",3);
			  //Testing for Constructor of GrageRecord
			  GradeRecord g1 = new GradeRecord(c1,7);
			  GradeRecord g2 = new GradeRecord(c2,6);
			  GradeRecord g3 = new GradeRecord(c3,8);
			  //Testing for Constructor ConsGrades
			  IGrades i1 = new ConsGrades(g1, new ConsGrades(g2, new ConsGrades(g3, new MTGrades())));
			  //Testing for constructor ScoreBourd
			  ScoreBourd s=new ScoreBourd(" le thanh tam","DH21",i1);
			  ScoreBourd s2 = new ScoreBourd(" le thanh tam","DH21",i1.softByGradeDec());
			  
			  assertEquals(s.softByGradeDec(), s2);
			  
		}
}
