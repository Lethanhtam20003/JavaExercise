package BT7;

public class ConsGrocery implements IGroceryItems{
	private AItems first;
	private IGroceryItems rest;
	
	public ConsGrocery(AItems first, IGroceryItems rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first +"\n"+ this.rest;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ConsGrocery)) {
			return false;
		}else {			
			ConsGrocery that = (ConsGrocery)obj;
			return this.first.equals(that.first)&&this.rest.equals(that.rest);
		}
	}

	@Override
	public int howmany() {
		// TODO Auto-generated method stub
		return 1 + this.rest.howmany();
	}
	
}
