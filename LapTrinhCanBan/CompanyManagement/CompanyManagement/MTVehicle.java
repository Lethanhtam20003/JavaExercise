package CompanyManagement;

public class MTVehicle implements IVehicle {

	@Override
	public IVehicle softByEmloyee() {
		// TODO Auto-generated method stub
		return new MTVehicle();
	}

	@Override
	public IVehicle insertVehicleOther(Vehicle first) {
		// TODO Auto-generated method stub
		return new ConsVehcle(first, new MTVehicle());
	}

	@Override
	public boolean checkVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

}
