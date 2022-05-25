package BT16_QuanLyHocSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Student{
	Scanner ip = new Scanner(System.in);
	private String studentName;
	private int id;
	private birthDay birth;
	private Scores scores;
	public   ArrayList<Student> listStudent = new ArrayList<Student>();
	public Student(String studentName, int id, birthDay birth) {
		this.studentName = studentName;
		this.id = id;
		this.birth = birth;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+this.id+"\t"+this.studentName+"\t\t "+this.birth.toString()+"\n"+Scores.listScores;
	}
	
	public void AddStudent(Student st) {
		listStudent.add(st);
		//Scores.listScores.add(st.scores);
	}
	public double AverageScores(Student a) {
		return 0;
	}
	public Student Find(String nameStudent) {
		for(int i = 0;i<listStudent.size();i++) {
			if(listStudent.get(i).studentName.equals(nameStudent)) {
				return listStudent.get(i);
			}
		}
		
		return null;
	}
	public Student Find(int idStudent) {
		for(int i = 0;i<listStudent.size();i++) {
			if(listStudent.get(i).id == idStudent) {
				return listStudent.get(i);
			}
		}
		return null;
	}
	
}
