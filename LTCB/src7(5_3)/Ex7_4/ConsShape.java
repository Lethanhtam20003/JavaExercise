package Ex7_4;

public class ConsShape implements IShape {
	private AShape first;
	private IShape rest;
	public ConsShape(AShape first, IShape rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first.toString() +"\n"+this.rest.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ConsShape)) {
			return false;
		}else {
			ConsShape that = (ConsShape)obj;
		return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
	
	
	/*
	 * Testing for the distanseToO()
	 * 
	 */
	@Override
	public double distanseToO() {
		// TODO Auto-generated method stub\
		double n = this.first.distanseToO();
		while(this.rest.distanseToO() == 0) {
			if(n < this.first.distanseToO()) {
				return n = this.first.distanseToO();
				
			}
			 	return this.rest.distanseToO();
			
		}
		return n;
	}
	
	@Override
	public boolean boundaries(int a, int b) {
		// TODO Auto-generated method stub
		if (this.first.between(a, b)) {
			return true;
		}
		return this.rest.boundaries(a, b);
	}
	@Override
	public ConsShape boundingBox() {
		// TODO Auto-generated method stub
		return new ConsShape( this.first.boundingBox(), this.rest.boundingBox());
	}
	
}

