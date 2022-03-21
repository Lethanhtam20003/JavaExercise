package Ex6_4;


import junit.framework.TestCase;

public class ScoreBoardTest extends TestCase {
	public void testConstructor() {
		
		//Testing for constructor Course
		  Course c1 = new Course(1112,"toan a1", 4);
		  Course c2 = new Course(1111,"ly ",3);
		  Course c3 = new Course(1113,"hoa",3);
		  //Testing for Constructor of GrageRecord
		  GradesRecord g1 = new GradesRecord(c1,7);
		  GradesRecord g2 = new GradesRecord(c2,6);
		  GradesRecord g3 = new GradesRecord(c3,8);
		  //Testing for Constructor ConsGrades
		  IGrades i1 = new ConsGrades(g1, new ConsGrades(g2, new ConsGrades(g3, new MTGrades())));
		  //Testing for constructor ScoreBourd
		  ScoreBoard s=new ScoreBoard(" le thanh tam","DH21DTD",i1); 
		  System.out.println(s);
		}
}
