/**
 * 
 */
package Ex7_4;

/**
 * @author lethanhtam
 *
 */
public interface IShape {
	public double DistancetoO();

	public boolean contains(CartPt point);

	public Rectangle boundingBox();
}
