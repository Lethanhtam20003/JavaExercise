package CompanyManagement;

public class ConsVehcle implements IVehicle {
	private Vehicle first;
	private IVehicle rest;
	
	
	public ConsVehcle(Vehicle first, IVehicle rest) {
		this.first = first;
		this.rest = rest;
	}


	@Override
	public IVehicle softByEmloyee() {
		// TODO Auto-generated method stub
		return this.rest.softByEmloyee().insertVehicleOther(this.first);
	}


	@Override
	public IVehicle insertVehicleOther(Vehicle that) {
		// TODO Auto-generated method stub
		if(this.first.checkVehicleYear(that)) {
		return new ConsVehcle(that, this.rest.insertVehicleOther(this.first));
		}else {
			return new ConsVehcle(this.first, this.rest.insertVehicleOther(that));
		}
	}


	@Override
	public boolean checkVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return this.first.checkVehicle(vehicle);
	}

}
