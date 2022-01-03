package Ex5_2;

public class Restaurant {
	private String name;
	private String food;
	private String price;
	private Intersection intersection;
	public Restaurant(String name, String food ,String price , Intersection intersection) {
		super();
		this.name = name;
		this.food = food;
		this.price = price;
		this.intersection = intersection;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : "+ this.name + "food : " +   "intersection : "+this.intersection.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof Restaurant)) {
			return false;
		} else {
			Restaurant that = (Restaurant) obj;
			return this.name.equals(that.name) 
					&& this.food.equals(that.food) 
					&& this.price.equals(that.price)
					&& this.intersection.equals(that.intersection);
		}
	}
}
