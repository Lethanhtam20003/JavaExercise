package Ex5_3;

import junit.framework.TestCase;

public class RestaurantTest extends TestCase {
	public void testConstructor() {

		Restaurant r1 = new Restaurant("Chez Nous","French", "exp.", new Intersection(7, 65));

		Restaurant r2 = new Restaurant("Das Bier","German", "cheap", new Intersection(2, 86));

		Restaurant r3 = new Restaurant("Sun","Chinese", "cheap", new Intersection(10, 13));

		IRestaurant empty = new MTRestaurant();

		IRestaurant l1 = new ConsRestaurant(r3, empty);

		IRestaurant l2 = new ConsRestaurant(r2, l1);

		IRestaurant l3 = new ConsRestaurant(r1, l2);

		System.out.println(l3);

		IRestaurant all = new ConsRestaurant(r1, new ConsRestaurant (r2,new ConsRestaurant(r3, new MTRestaurant())));

		assertEquals(all, l3);

		}
}
