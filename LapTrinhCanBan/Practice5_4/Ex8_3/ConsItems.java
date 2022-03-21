package Ex8_3;

public class ConsItems implements IItems {
	private AItems first;
	private IItems rest;
	public ConsItems(AItems first, IItems rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() + "\n \n"+this.rest.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ConsItems )) {
		return false;
		}else {
			ConsItems that = (ConsItems)obj;
			return this.first.equals(that.first) 
					&& this.rest.equals(that.rest);
		}
	}

	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 1 + this.rest.howMany();
	}
	
	
	
	 public IItems createSoftItems(AItems n){
		if(n.diterminHighest(this.first)) {
			return new ConsItems(n, this);
		}else {
			return new ConsItems(this.first, this.rest.createSoftItems(n));
		}
	}
	@Override
	public IItems highestPrice() {
		// TODO Auto-generated method stub
		return this.rest.highestPrice().createSoftItems(this.first);
	}
	
}
