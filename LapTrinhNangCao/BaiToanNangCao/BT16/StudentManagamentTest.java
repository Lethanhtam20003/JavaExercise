package BT16;

import junit.framework.TestCase;

public class StudentManagamentTest extends TestCase {

	public void testConstructor() {
		Student st = new Student("tam", 21130525, new birthDay(21, 5, 2003), Student.listScores);
		Scores s = new Scores("toan", 1003, 7);
		StudentManagament.listStudent.add(st);
		Student.listScores.add(s);
		for (var str : StudentManagament.listStudent) {
			System.out.println(str);
		}
	}
	public void testAddStudent() {
	}
}
