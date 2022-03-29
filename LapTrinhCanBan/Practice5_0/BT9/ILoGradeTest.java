/**
 * 
 */
package BT9;

import junit.framework.TestCase;

/**
 * @author lethanhtam
 *
 */
public class ILoGradeTest extends TestCase {
	public void testConstructor() {
		Course_subclass c1 = new Course_subclass(001,"laptrinh", 3);
		Course_subclass c2 = new Course_subclass(002,"quansu", 4);
		Course_subclass c3 = new Course_subclass(003,"theduc", 1);
		
		GradeRecord_subclass g1 = new GradeRecord_subclass(c1, 7);
		GradeRecord_subclass g2 = new GradeRecord_subclass(c2, 10);
		GradeRecord_subclass g3 = new GradeRecord_subclass(c3, 6);
		
		ILoGrade i = new ConsLoGrade(g1, new ConsLoGrade(g2, new ConsLoGrade(g3, new MTLoGrade())));
		
		System.out.println("test Constructor: \n"+i);
	}
	public void testHowManyCredits() {
		Course_subclass c1 = new Course_subclass(001,"laptrinh", 3);
		Course_subclass c2 = new Course_subclass(002,"quansu", 4);
		Course_subclass c3 = new Course_subclass(003,"theduc", 1);
		
		GradeRecord_subclass g1 = new GradeRecord_subclass(c1, 7);
		GradeRecord_subclass g2 = new GradeRecord_subclass(c2, 10);
		GradeRecord_subclass g3 = new GradeRecord_subclass(c3, 6);
		
		ILoGrade i = new ConsLoGrade(g1, new ConsLoGrade(g2, new ConsLoGrade(g3, new MTLoGrade())));
		
		assertEquals(i.howManyCredits(), 8);
	}
	
	public void testGradeAverage() {
		Course_subclass c1 = new Course_subclass(001,"laptrinh", 3);
		Course_subclass c2 = new Course_subclass(002,"quansu", 4);
		Course_subclass c3 = new Course_subclass(003,"theduc", 1);
		
		GradeRecord_subclass g1 = new GradeRecord_subclass(c1, 7);
		GradeRecord_subclass g2 = new GradeRecord_subclass(c2, 10);
		GradeRecord_subclass g3 = new GradeRecord_subclass(c3, 6);
		
		ILoGrade i = new ConsLoGrade(g1, new ConsLoGrade(g2, new ConsLoGrade(g3, new MTLoGrade())));
		
		assertEquals(i.GradeAverage(), 7.66,0.01);
	}

	public void testSoftByGrade() {
		Course_subclass c1 = new Course_subclass(001,"laptrinh", 3);
		Course_subclass c2 = new Course_subclass(002,"quansu", 4);
		Course_subclass c3 = new Course_subclass(003,"theduc", 1);
		
		GradeRecord_subclass g1 = new GradeRecord_subclass(c1, 7);
		GradeRecord_subclass g2 = new GradeRecord_subclass(c2, 10);
		GradeRecord_subclass g3 = new GradeRecord_subclass(c3, 6);
		
		ILoGrade i = new ConsLoGrade(g1, new ConsLoGrade(g2, new ConsLoGrade(g3, new MTLoGrade())));
		System.out.println("test Soft by grade: \n"+i.softByGrade());
		assertEquals(i.softByGrade(), new ConsLoGrade(g2, new ConsLoGrade(g1, new ConsLoGrade(g3, new MTLoGrade()))));
	}
}
