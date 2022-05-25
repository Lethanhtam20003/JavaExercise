package BT16_QuanLyHocSinh;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	Scores s = new Scores("toan", 1000);
	Student st = new Student("tam", 21130525,new birthDay(21, 5, 2003));
	
	public void testAddStudent() {
		st.AddStudent(st);
		//Student.listScores.add(s);
		for (var str : st.listStudent) {
			System.out.println(str);
		}
	}
	
	public void testAddScore() {
		
	}
}
