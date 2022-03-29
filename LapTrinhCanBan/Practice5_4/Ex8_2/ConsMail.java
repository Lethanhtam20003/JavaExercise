package Ex8_2;


public class ConsMail implements IMail {
	private MessagesMail first;
	private IMail rest;
	
	public ConsMail(MessagesMail first, IMail rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() +"\n"+ this.rest.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ConsMail)) {
			return false;
		}else {
			ConsMail that= (ConsMail)obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}

	@Override
	public IMail softByDate() {
		// TODO Auto-generated method stub
		return this.rest.softByDate().insertInDateOrther(this.first);
		
	}

	@Override
	public IMail insertInDateOrther(MessagesMail m) {
		// TODO Auto-generated method stub
		if(m.hasDateOrtherThan(m)) {
			return new ConsMail(m, this);
		}else {
			return new ConsMail(this.first, this.rest.insertInDateOrther(m));
		}
	}
}
