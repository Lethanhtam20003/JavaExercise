package CompanyManagement;

public class Staff extends Employee {
	private String department;

	public Staff(int eid, String name, day birthday, double salaryRate, String department) {
		super(eid, name, birthday, salaryRate);
		this.department = department;
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return this.salaryRate*1000000;
	}

	@Override
	protected boolean checkVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
