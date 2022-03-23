package BT9;


class Course {
	private int number;
	private String title;
	private int cridits;
	/*
	 * Testing for constructor Course
	 * Course c1 = new Course(1112"toan a1", 4);
	 * Course c2 = new Course(1111,"ly ",3);
	 * Course c3 = new Course(1113,"hoa",3);
	 */
	public Course(int number, String title, int cridits) {
		super();
		this.number = number;
		this.title = title;
		this.cridits = cridits;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+this.number +" \t  - title: "+this.title +", \t cridits: "+this.cridits;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof Course)) {
			return false;
		}else {
			Course that = (Course)obj;
			return this.number==that.number 
					&& this.title== that.title 
					&& this.cridits==that.cridits;
		}
	}
	public int getCridit() {
		return this.cridits;
	}
}
