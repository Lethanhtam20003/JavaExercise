package BT2;

 
public class ConsRecord implements IDirectory {
	private PhoneRecord first;
	private IDirectory rest;
	/*
	 * Testing for the Constructor of ConsRecord
	 * IDirectory i1 = new ConsRecord(r1, new ConsRecord(r2,new ConsRecord(r3, new MTDirectory())));
	 */
	public ConsRecord(PhoneRecord first, IDirectory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return  this.first.toString() + "\n" + this.rest.toString() ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !( obj instanceof ConsRecord)) {
			return false;
		}else {
			ConsRecord that = ( ConsRecord)obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
					
		}
	}
	@Override
	public IDirectory phoneNumber(int number) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IDirectory whoseNumber(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
