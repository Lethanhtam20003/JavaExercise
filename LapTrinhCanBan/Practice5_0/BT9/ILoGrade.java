/**
 * 
 */
package BT9;

/**
 * @author lethanhtam
 *
 */
public interface ILoGrade {
	public int howManyCredits();
	public double GradeAverage();
	public double sumGrade();
	public int howManyCourse();
	public ILoGrade softByGrade();
	public ILoGrade insertInGradeRecordOfther(GradeRecord_subclass that);

}
