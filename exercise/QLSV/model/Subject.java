package model;

public class Subject {
	private String idSub;
	private String nameSub;
	private byte credit;
	private Score score;
	public Subject(String idSub, String nameSub, byte credit) {
		this.idSub = idSub;
		this.nameSub = nameSub;
		this.credit = credit;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.idSub+this.nameSub+this.credit+this.score;
	}
}
