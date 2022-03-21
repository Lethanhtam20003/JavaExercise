/**
 * 
 */
package Ex6_4;

import Ex6_2.ABook;

/**
 * @author lethanhtam
 *
 */
public class Course {
	private int number;
	private String title;
	private int credits;
	public Course(int number, String title, int credits) {
		super();
		this.number = number;
		this.title = title;
		this.credits = credits;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "course code: "+this.number+"   "+ this.title+"(credits:"+ this.credits+")";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Course)) {
			return false;
		}else {
			Course that = (Course)obj;
			return this.number==that.number 
					&& this.title.equals(that.title)
					&& this.credits== that.credits;
		}
	}
}
