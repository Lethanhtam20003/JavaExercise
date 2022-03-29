/**
 * 
 */
package BT9;

/**
 * @author lethanhtam
 *
 */
public class ScoreBoard_main {
	private String name;
	private String lop;
	private ILoGrade loGrade;
	public ScoreBoard_main(String name, String lop, ILoGrade loGrade) {
		super();
		this.name = name;
		this.lop = lop;
		this.loGrade = loGrade;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "*Imformation of student: \n Name:"+ this.name+ "\t class: "+ this.lop +"\n"+ "code: \t subject: \t grade: \n"+this.loGrade.toString();
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ScoreBoard_main)) {
			return true;
		}else {
			ScoreBoard_main that = (ScoreBoard_main)obj;
		return this.name.equals(that.name)
				&& this.lop.equals(that.lop)
				&& this.loGrade.equals(that.loGrade);
		}
	}
	public ScoreBoard_main softByGrade() {
		return new ScoreBoard_main(this.name, this.lop, this.loGrade.softByGrade());
	}
}
