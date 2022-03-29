package BT9;

public class Course_subclass {
	private int number;
	private String title;
	private int credits;
	public Course_subclass(int number, String title, int credits) {
		super();
		this.number = number;
		this.title = title;
		this.credits = credits;
	}
	public int getCredits() {
		return credits;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "- "+this.number+" \t "+ this.title+"("+this.credits+")" + " \t :";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof MTLoGrade)) {
			return true;
		}else {
			Course_subclass that = (Course_subclass)obj;
		return this.number == that.number
				&& this.title.equals(that.title)
				&& this.credits == that.credits;
		}
	}
	
}
