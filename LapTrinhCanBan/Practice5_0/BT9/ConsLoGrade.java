/**
 * 
 */
package BT9;

/**
 * @author lethanhtam
 *
 */
public class ConsLoGrade implements ILoGrade {
	private GradeRecord_subclass first;
	private ILoGrade rest;

	public ConsLoGrade(GradeRecord_subclass first, ILoGrade rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + " \n" + this.rest.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof MTLoGrade)) {
			return true;
		} else {
			ConsLoGrade that = (ConsLoGrade) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}

	@Override
	public int howManyCredits() {
		// TODO Auto-generated method stub
		return this.first.getCredits() + this.rest.howManyCredits();
	}
	
	@Override
	public double GradeAverage() {
		// TODO Auto-generated method stub
		return this.sumGrade() / this.howManyCourse();
	}
	
	@Override
	public double sumGrade() {
		// TODO Auto-generated method stub
		return this.first.getGrade() + this.rest.sumGrade();
	}
	
	@Override
	public int howManyCourse() {
		// TODO Auto-generated method stub
		return 1 + this.rest.howManyCourse();
	}
	
	@Override
	public ILoGrade softByGrade() {
		// TODO Auto-generated method stub
		return this.rest.softByGrade().insertInGradeRecordOfther(this.first);
	}

	@Override
	public ILoGrade insertInGradeRecordOfther(GradeRecord_subclass that) {
		// TODO Auto-generated method stub
		if (that.hasGradeThan(this.first)) {
			return new ConsLoGrade(that, this);
		} else {
			return new ConsLoGrade(this.first, this.rest.insertInGradeRecordOfther(that));
		}
	}


}
