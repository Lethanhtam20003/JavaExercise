package model;

public class Subject {
	private String idSub;
	private String nameSub;
	private byte credit;
	private double score;
	public Subject(String idSub, String nameSub, byte credit, double score) {
		super();
		this.idSub = idSub;
		this.nameSub = nameSub;
		this.credit = credit;
		this.score = score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.idSub+this.nameSub+this.credit+this.score;
	}
}
