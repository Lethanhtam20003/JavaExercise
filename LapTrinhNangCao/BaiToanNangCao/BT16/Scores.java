package BT16;


public class Scores {
	private String subjectName;
	private int subjectID;
	private double scores;
	
	public Scores(String subjectName, int subjectID, double scores) {
		super();
		this.subjectName = subjectName;
		this.subjectID = subjectID;
		this.scores = scores;
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
	
}
