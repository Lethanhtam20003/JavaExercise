package CompanyManagement;

public class Driver extends Employee {
	private IVehicle vehicle;

	public Driver(int eid, String name, day birthday, double salaryRate, IVehicle vehicle) {
		super(eid, name, birthday, salaryRate);
		this.vehicle = vehicle;
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return this.salaryRate * 900000;
	}

	@Override
	protected boolean checkVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return this.vehicle.checkVehicle(vehicle);
	}

}
