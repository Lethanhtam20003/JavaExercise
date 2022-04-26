package BT16;

import java.util.ArrayList;
import java.util.Scanner;

public class Student implements StudentManagament{
	Scanner ip = new Scanner(System.in);
	private String studentName;
	private int id;
	private birthDay birth;
	private Scores scores;
	public static ArrayList<Scores> listScores = new ArrayList<Scores>();
	public Student(String studentName, int id, birthDay birth,ArrayList listScore) {
		super();
		this.studentName = studentName;
		this.id = id;
		this.birth = birth;
		this.listScores = listScore;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+this.id+"\t"+this.studentName+"\t\t "+this.birth.toString()+"\n\n \t"+this.listScores;
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@Override
	public void AddStudent() {
		// TODO Auto-generated method stub
		System.out.print("name: ");
		String studentName = ip.next();
		
		System.out.print("\nID");
		int id = ip.nextInt();

		System.out.println(" birth day: ");
		
		int day = ip.nextInt();
		
		System.out.print("/ ");
		int month = ip.nextInt();
		
		System.out.print("/ ");
		int years = ip.nextInt();
		
		birthDay birth = new birthDay(day, month, years);
		Student st1 =  new Student(studentName, id, birth,null);
		listStudent.add(st1);
	}
	@Override
	public void AddScores(Student a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double AverageScores(Student a) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Student Find(String nameStudent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student Find(int idStudent) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
