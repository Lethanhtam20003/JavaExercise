package CompanyManagement;

public class Vehicle {
	private int iid;
	private String vehicleName;
	private int vehicleYear;
	public Vehicle(int iid, String vehicleName, int vehicleYear) {
		this.iid = iid;
		this.vehicleName = vehicleName;
		this.vehicleYear = vehicleYear;
	}
	public boolean checkVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return this.vehicleName.equals(vehicle);
	}
	public boolean checkVehicleYear(Vehicle that) {
		// TODO Auto-generated method stub
		return this.vehicleYear>that.vehicleYear;
	}
	
}
