/**
 * 
 */
package BT9;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class ScoreBoard_mainTest extends TestCase {
	public void testConstructor() {
		Course_subclass c1 = new Course_subclass(1001,"laptrinh", 3);
		Course_subclass c2 = new Course_subclass(1002,"quansu", 4);
		Course_subclass c3 = new Course_subclass(1003,"theduc", 1);
		
		GradeRecord_subclass g1 = new GradeRecord_subclass(c1, 7);
		GradeRecord_subclass g2 = new GradeRecord_subclass(c2, 10);
		GradeRecord_subclass g3 = new GradeRecord_subclass(c3, 6);
		
		ILoGrade i = new ConsLoGrade(g1, new ConsLoGrade(g2, new ConsLoGrade(g3, new MTLoGrade())));
		
		ScoreBoard_main s = new ScoreBoard_main("letam", "DH21DTD", i);
		
		System.out.println(s);
	}
	public void testSoftByGrade() {
		Course_subclass c1 = new Course_subclass(001,"laptrinh", 3);
		Course_subclass c2 = new Course_subclass(002,"quansu", 4);
		Course_subclass c3 = new Course_subclass(003,"theduc", 1);
		
		GradeRecord_subclass g1 = new GradeRecord_subclass(c1, 7);
		GradeRecord_subclass g2 = new GradeRecord_subclass(c2, 10);
		GradeRecord_subclass g3 = new GradeRecord_subclass(c3, 6);
		
		ILoGrade i = new ConsLoGrade(g1, new ConsLoGrade(g2, new ConsLoGrade(g3, new MTLoGrade())));
		
		ScoreBoard_main s = new ScoreBoard_main("letam", "DH21DTD", i);
		
		System.out.println("test Soft by grade: \n"+s.softByGrade());
		assertEquals(s.softByGrade(),new ScoreBoard_main("letam", "DH21DTD", new ConsLoGrade(g2, new ConsLoGrade(g1, new ConsLoGrade(g3, new MTLoGrade())))));
	}
}
