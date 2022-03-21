package Ex6_4;


public class ConsGrades implements IGrades {
	private GradesRecord first;
	private IGrades rest;
	public ConsGrades(GradesRecord first, IGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + "\n" + this.rest.toString() + "\n";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ConsGrades)) {
			return false;
		}else {
			ConsGrades that = (ConsGrades)obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
}
