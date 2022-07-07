package CompanyManagement;

public abstract class Employee {
	protected int eid;
	protected String name;
	protected day birthday;
	protected double salaryRate;

	public Employee(int eid, String name, day birthday, double salaryRate) {
		this.eid = eid;
		this.name = name;
		this.birthday = birthday;
		this.salaryRate = salaryRate;
	}

	/**
	 * @return the birthday
	 */
	public day getBirthday() {
		return birthday;
	}

	public abstract double salary();
	/**
	 * @return the salaryRate
	 */

	protected abstract boolean checkVehicle(String vehicle);

}
