package BT6;


public class ConsPhone implements IDirectory{
	private APhoneNumber first;
	private IDirectory rest;
	/*
	 * Testing for the constructor of ConsPhone
	 * IDirectory i2 = new ConsPhone(p1, new ConsPhone(p2, new ConsPhone(p3, new MTDirectory())));
	 */
	public ConsPhone(APhoneNumber first, IDirectory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return  this.first + "\n" + this.rest;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !( obj instanceof ConsPhone)) {
			return false;
		}else {
			ConsPhone that = ( ConsPhone)obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
					
		}
	}
	/**
	 * exercise 
	 */
	@Override
	public APhoneNumber phoneNumber(long number,String name) {
		// TODO Auto-generated method stub
		if (this.first.sameNameOrNumber(number, name)) {
			return this.first;
		}
		return this.rest.phoneNumber(number,name);
	}
}
