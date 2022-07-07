package CompanyManagement;

public class ConsEmployee implements IEmployee {
	private Employee first;
	private IEmployee rest;
	public ConsEmployee(Employee first, IEmployee rest) {
		this.first = first;
		this.rest = rest;
	}
	@Override
	public int howmanyEmployee() {
		// TODO Auto-generated method stub
		return this.rest.howmanyEmployee()+1;
	}
	@Override
	public IEmployee getDrivers(String vehicle) {
		// TODO Auto-generated method stub
		if(this.first.checkVehicle(vehicle)) {
			return new ConsEmployee(this.first, this.rest.getDrivers(vehicle));
		}
		return this.rest.getDrivers(vehicle);
	}
	
}
