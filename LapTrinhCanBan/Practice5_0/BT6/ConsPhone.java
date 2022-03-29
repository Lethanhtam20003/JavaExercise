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
		return  this.first.toString() + "\n" + this.rest.toString();
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
	public IDirectory phoneNumber(int number) {
		if (this.first.getNumber()==number)
			return new ConsPhone(this.first, this.rest.phoneNumber(number));
		else {
			return this.rest.phoneNumber(number);
		}
	}

	public IDirectory whoseNumber(String name) {
		if (this.first.getName().equals(name))
			return new ConsPhone(this.first, this.rest.whoseNumber(name));
		else {
			return this.rest.whoseNumber(name);
		}
	}
}
