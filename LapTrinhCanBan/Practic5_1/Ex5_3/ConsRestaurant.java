/**
 * 
 */
package Ex5_3;

/**
 * @author lethanhtam
 *
 */
public class ConsRestaurant implements IRestaurant {
	private Restaurant first;
	private IRestaurant rest;

	public ConsRestaurant(Restaurant first, IRestaurant rest) {
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "first :" + this.first.toString() + "\n rest: " + this.rest.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsRestaurant)) {
			return false;
		} else {
			ConsRestaurant that = (ConsRestaurant) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}
