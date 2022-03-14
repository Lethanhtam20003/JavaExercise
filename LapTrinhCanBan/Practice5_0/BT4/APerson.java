package BT4;

public class APerson {
	private String name;
	private int yearOfBirth;
	private APerson farther;
	private APerson morther;
	public APerson(String name, int yearOfBirth, APerson farther, APerson morther) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.farther = farther;
		this.morther = morther;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "name: " +this.name +", birthday: "+this.yearOfBirth+", Farther: "
//				+this.farther.toString()+",morther: "+this.morther.toString();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj == null || !(obj instanceof APerson)) {
//			return false;
//		}else {
//			APerson that = (APerson)obj;
//			return this.name==that.name 
//					&& this.yearOfBirth== that.yearOfBirth 
//					&& this.farther.equals(that.farther) 
//					&& this.morther.equals(that.morther);
//		}
//	}
}
