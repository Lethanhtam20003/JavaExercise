package Ex6_5;


public class APerson {
	private String name;
	private int birthday;
	private APerson farther;
	private APerson morther;
	public APerson(String name, int birthday, APerson farther, APerson morther) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.farther = farther;
		this.morther = morther;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof APerson)) {
			return false;
		}else {
			APerson that = (APerson)obj;
			return this.name.equals(that.name)
					&& this.birthday== that.birthday
					&& this.farther.equals(that.farther)
					&& this.morther.equals(that.morther);
		}
	}
}
