package BT16_QuanLyHocSinh;

import java.util.ArrayList;

public class Scores {
	private String subjectName;
	private int subjectID;
	private double scores;
	public static  ArrayList<Scores> listScores = new ArrayList<Scores>();
	public Scores(String subjectName, int subjectID) {
		super();
		this.subjectName = subjectName;
		this.subjectID = subjectID;
	}
	public double getScores() {
		return scores;
	}
	public void setScores(double scores) {
		this.scores = scores;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id subject: "+this.subjectID+"\t "+this.subjectName+" \t\t "+this.scores+" đ";
	}
	public static void AddScore(Scores a) {
		// TODO Auto-generated method stub
		listScores.add(a);
	}
	
}
