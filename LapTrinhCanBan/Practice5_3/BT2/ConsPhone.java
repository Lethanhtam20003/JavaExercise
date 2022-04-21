package BT2;

 
public class ConsPhone implements IDirectory {
	private APhoneNumber first;
	private IDirectory rest;

	/**
	 * @param first
	 * @param rest
	 */
	public ConsPhone(APhoneNumber first, IDirectory rest) {
		this.first = first;
		this.rest = rest;
	}

	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsPhone))
			return false;
		else {
			ConsPhone that = (ConsPhone) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}

	}

	public IDirectory whoseNumber(String name) {
		if (this.first.getName().equals(name)) {
			return new ConsPhone(this.first, this.rest.whoseNumber(name));
		}else {
			return this.rest.whoseNumber(name);
		}
	}

	public IDirectory phoneNumber(int number) {
		if (this.first.getNumber() == number)
			return new ConsPhone(this.first, this.rest.phoneNumber(number));
		else {
			return this.rest.phoneNumber(number);
		}
	}
}
