package CompanyManagement;

public interface IVehicle {
	public abstract IVehicle softByEmloyee();

	public abstract IVehicle insertVehicleOther(Vehicle first);

	public abstract boolean checkVehicle(String vehicle);
}
